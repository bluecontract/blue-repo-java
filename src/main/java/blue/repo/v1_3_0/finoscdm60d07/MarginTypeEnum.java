package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HmpvzvA58EwtnjYeNPNsQyMMdWEk4vfebXQsEhJYuT8k")
public class MarginTypeEnum {
    public static String blueId() {
        return "HmpvzvA58EwtnjYeNPNsQyMMdWEk4vfebXQsEhJYuT8k";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MarginTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MarginTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MarginTypeEnum.json";
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

    public MarginTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
