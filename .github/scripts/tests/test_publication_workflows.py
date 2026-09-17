"""Guard the release boundary without sending artifacts to Maven Central."""
from pathlib import Path
import unittest


ROOT = Path(__file__).resolve().parents[3]


class PublicationWorkflowsTest(unittest.TestCase):
    def test_both_releases_wait_before_github_release(self):
        for filename in ("release-rc.yml", "release.yml"):
            with self.subTest(workflow=filename):
                workflow = (ROOT / ".github/workflows" / filename).read_text()
                deploy = workflow.index("./gradlew jreleaserDeploy")
                wait = workflow.index("python3 .github/scripts/wait-maven-central.py")
                release = workflow.index("./gradlew jreleaserFullRelease --exclude-deployer=mavenCentral")
                self.assertLess(deploy, wait)
                self.assertLess(wait, release)
                self.assertIn("-PblueMavenCentralSkipPublicationCheck=true", workflow[deploy:wait])
                self.assertIn(
                    "rm -f build/jreleaser/output.properties build/jreleaser/maven-central-submitted.properties build/jreleaser/maven-central-publication.json",
                    workflow[:deploy],
                )
                self.assertIn("cp build/jreleaser/output.properties build/jreleaser/maven-central-submitted.properties", workflow[deploy:wait])
                self.assertIn("wait-maven-central.py build/jreleaser/maven-central-submitted.properties", workflow)
                self.assertNotIn("continue-on-error", workflow)
                self.assertEqual(1, workflow.count("./gradlew jreleaserFullRelease"))
                if filename == "release-rc.yml":
                    self.assertLess(release, workflow.index("git push origin HEAD:next"))

    def test_async_publication_is_explicit_opt_in(self):
        configuration = (ROOT / "build.gradle").read_text()
        self.assertIn(
            "skipPublicationCheck = providers.gradleProperty('blueMavenCentralSkipPublicationCheck').orElse('false').get().toBoolean()",
            configuration,
        )


if __name__ == "__main__":
    unittest.main()
