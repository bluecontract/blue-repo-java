package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("mhf6WRgtgTJMTnTAjfSnKhmv1AvzP2cpRXZ7preU8D5")
public class AffirmationStatusEnum {
    public static String blueId() {
        return "mhf6WRgtgTJMTnTAjfSnKhmv1AvzP2cpRXZ7preU8D5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AffirmationStatusEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AffirmationStatusEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AffirmationStatusEnum.json";
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

    public AffirmationStatusEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
