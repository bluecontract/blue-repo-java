package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("E8Wm7NZuUJ17aHoehVwUofcYjN4oe6bb4JaT76afmrg")
public class ShareExtraordinaryEventEnum {
    public static String blueId() {
        return "E8Wm7NZuUJ17aHoehVwUofcYjN4oe6bb4JaT76afmrg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ShareExtraordinaryEventEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ShareExtraordinaryEventEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ShareExtraordinaryEventEnum.json";
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

    public ShareExtraordinaryEventEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
