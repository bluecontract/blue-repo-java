package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G5qdV1cr23CKFp5rHm6dGo9ucFp3Lae5UrRwWRTkC7gh")
public class PartyRoleEnum {
    public static String blueId() {
        return "G5qdV1cr23CKFp5rHm6dGo9ucFp3Lae5UrRwWRTkC7gh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PartyRoleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PartyRoleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PartyRoleEnum.json";
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

    public PartyRoleEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
