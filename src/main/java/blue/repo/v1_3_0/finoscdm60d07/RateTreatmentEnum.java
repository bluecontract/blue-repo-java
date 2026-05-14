package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EQbLgmXA4dEZxrpkxEzgaL3xnfYVQcqX9MtiNDidCsPS")
public class RateTreatmentEnum {
    public static String blueId() {
        return "EQbLgmXA4dEZxrpkxEzgaL3xnfYVQcqX9MtiNDidCsPS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RateTreatmentEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RateTreatmentEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RateTreatmentEnum.json";
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

    public RateTreatmentEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
