package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EDFTBGGUu27n2TfeTQMHr46iChSJeLbM4CMYz8c1M4v7")
public class PriceReturnTerms {
    public static String blueId() {
        return "EDFTBGGUu27n2TfeTQMHr46iChSJeLbM4CMYz8c1M4v7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PriceReturnTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PriceReturnTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PriceReturnTerms.json";
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

    private Double conversionFactor;

    private String performance;

    private ReturnTypeEnum returnType;

    public String getNamespace() {
        return namespace;
    }

    public PriceReturnTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getConversionFactor() {
        return conversionFactor;
    }

    public PriceReturnTerms conversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
        return this;
    }

    public String getPerformance() {
        return performance;
    }

    public PriceReturnTerms performance(String performance) {
        this.performance = performance;
        return this;
    }

    public ReturnTypeEnum getReturnType() {
        return returnType;
    }

    public PriceReturnTerms returnType(ReturnTypeEnum returnType) {
        this.returnType = returnType;
        return this;
    }

}
