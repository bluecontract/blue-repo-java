package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7BQBZywPFAD4dWxBXLoXWBNBFeW33LU6D4nFBLTKCVEW")
public class TelephoneTypeEnum {
    public static String blueId() {
        return "7BQBZywPFAD4dWxBXLoXWBNBFeW33LU6D4nFBLTKCVEW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TelephoneTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TelephoneTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TelephoneTypeEnum.json";
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

    public TelephoneTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
