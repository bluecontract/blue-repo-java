package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Dnoa3g5i2QYJuFDjb4giKCn96sAMoPTp9f4s5uocQx9")
public class CollateralTypeEnum {
    public static String blueId() {
        return "Dnoa3g5i2QYJuFDjb4giKCn96sAMoPTp9f4s5uocQx9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralTypeEnum.json";
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

    public CollateralTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
