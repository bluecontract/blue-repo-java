package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CvcgH8XTAmwTnFqEUEUcizcSmNBVem7kajhTSWujJuuy")
public class QuotationRateTypeEnum {
    public static String blueId() {
        return "CvcgH8XTAmwTnFqEUEUcizcSmNBVem7kajhTSWujJuuy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "QuotationRateTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/QuotationRateTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/QuotationRateTypeEnum.json";
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

    public QuotationRateTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
