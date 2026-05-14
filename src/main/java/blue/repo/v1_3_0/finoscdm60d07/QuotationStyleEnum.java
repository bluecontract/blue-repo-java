package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5Yqp2AQbRgTTBDa8SXJ4L249Czvn4LsXthGvSHoXPJxT")
public class QuotationStyleEnum {
    public static String blueId() {
        return "5Yqp2AQbRgTTBDa8SXJ4L249Czvn4LsXthGvSHoXPJxT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "QuotationStyleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/QuotationStyleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/QuotationStyleEnum.json";
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

    public QuotationStyleEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
