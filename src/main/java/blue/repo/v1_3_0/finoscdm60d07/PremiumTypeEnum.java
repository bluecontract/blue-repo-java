package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FgZcevAuJ3oVd6P3be8tDrWbmtJx9pkQzn9ymeowD1fN")
public class PremiumTypeEnum {
    public static String blueId() {
        return "FgZcevAuJ3oVd6P3be8tDrWbmtJx9pkQzn9ymeowD1fN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PremiumTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PremiumTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PremiumTypeEnum.json";
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

    public PremiumTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
