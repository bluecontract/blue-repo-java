package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HRdX6hcZAgM7yKUeQ1a1UJm8H4B7DPFKys1f7nQ69ESE")
public class ConfirmationStatusEnum {
    public static String blueId() {
        return "HRdX6hcZAgM7yKUeQ1a1UJm8H4B7DPFKys1f7nQ69ESE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ConfirmationStatusEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ConfirmationStatusEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ConfirmationStatusEnum.json";
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

    public ConfirmationStatusEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
