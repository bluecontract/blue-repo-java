package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CRK1NK8JeYHUHGS1MmULhtzvFfeNaonfrkQoU5qDpRL7")
public class ArithmeticOperationEnum {
    public static String blueId() {
        return "CRK1NK8JeYHUHGS1MmULhtzvFfeNaonfrkQoU5qDpRL7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ArithmeticOperationEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ArithmeticOperationEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ArithmeticOperationEnum.json";
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

    public ArithmeticOperationEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
