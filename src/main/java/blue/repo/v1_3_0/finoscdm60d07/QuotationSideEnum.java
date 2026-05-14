package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5dD2GpWRNjTb9HJDh2TB1MFnQRvZghG4TmmbiJYhWsZS")
public class QuotationSideEnum {
    public static String blueId() {
        return "5dD2GpWRNjTb9HJDh2TB1MFnQRvZghG4TmmbiJYhWsZS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "QuotationSideEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/QuotationSideEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/QuotationSideEnum.json";
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

    public QuotationSideEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
