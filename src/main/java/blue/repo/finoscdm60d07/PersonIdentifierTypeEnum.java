package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8nbbNL5ik7chKovPKvdqs8o81ZKkAp8gnAF5TGGb7Mp8")
public class PersonIdentifierTypeEnum {
    public static String blueId() {
        return "8nbbNL5ik7chKovPKvdqs8o81ZKkAp8gnAF5TGGb7Mp8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PersonIdentifierTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PersonIdentifierTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PersonIdentifierTypeEnum.json";
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

    public PersonIdentifierTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
