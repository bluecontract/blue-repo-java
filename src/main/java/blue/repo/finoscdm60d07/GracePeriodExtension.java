package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B6FmrxzHk4DqKtPmzPhKvTcE4QwaMDZwtmSvqq3YVMMV")
public class GracePeriodExtension {
    public static String blueId() {
        return "B6FmrxzHk4DqKtPmzPhKvTcE4QwaMDZwtmSvqq3YVMMV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "GracePeriodExtension";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/GracePeriodExtension";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/GracePeriodExtension.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private Boolean applicable;

    private Offset gracePeriod;

    public String getNamespace() {
        return namespace;
    }

    public GracePeriodExtension namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getApplicable() {
        return applicable;
    }

    public GracePeriodExtension applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public Offset getGracePeriod() {
        return gracePeriod;
    }

    public GracePeriodExtension gracePeriod(Offset gracePeriod) {
        this.gracePeriod = gracePeriod;
        return this;
    }

}
