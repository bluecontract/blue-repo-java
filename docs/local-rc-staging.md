# Immutable local RC catalog

The catalog can rebind its POM to a verified Language RC without regenerating
its types. Select `-PblueDependencyMode=immutable-local-rc-artifacts`,
`-PreleaseVersion=3.0.0-rc.22`, the exact Language repository with
`-PblueLanguageRepository=/absolute/repository`, and its reviewed binding with
`-PblueLanguageBinding=/absolute/language-binding.json`.

The binding schema is `blue-repository-local-rc-input/1`. It requires
`releaseReadinessClaimed: false`, the Language version, exact `sourceCommit`
and `sourceTree`, and `manifestSha256`. The verified Language input uses
`blue-local-rc-maven-repository/1.0`, Java 17 and a clean source tree. All
seven modules and all four publications per module must match their exact
paths, sizes and checksums; additional files and symlinks are rejected.

Run `test assembleImmutableStagedRepository` with
`-PstagedDependencyRepository=/absolute/new/catalog-repository`. The catalog
export requires a clean source tree and Java 17. It retains the generated
catalog manifest identity and binds the exact Language source and repository.
The output schema is `blue-repository-local-rc-repository/1.0` with
`stagePurpose: LOCAL_RC` and `releaseReadinessClaimed: false`. Existing output
bytes cannot be replaced. Final integrated readiness is recorded separately.
