package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3a4XNVhEGrKnEtMh7DzcLJtfjhDLwxtP36m4LNipEFS9")
public class CollateralInterestHandlingEnum {
    public static String blueId() {
        return "3a4XNVhEGrKnEtMh7DzcLJtfjhDLwxtP36m4LNipEFS9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralInterestHandlingEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralInterestHandlingEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralInterestHandlingEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public CollateralInterestHandlingEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
