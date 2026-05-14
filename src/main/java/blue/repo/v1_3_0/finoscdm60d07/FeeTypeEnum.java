package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HKkUcTPJZTrQTJdH6Efksc7E2CAroaZdwcpBkaWYG1rr")
public class FeeTypeEnum {
    public static String blueId() {
        return "HKkUcTPJZTrQTJdH6Efksc7E2CAroaZdwcpBkaWYG1rr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FeeTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FeeTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FeeTypeEnum.json";
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

    public FeeTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
