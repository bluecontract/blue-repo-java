package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7YPXekUAnhSyp9AcFCEqPbCAU21zbcDE5gTMTqxEu6f4")
public class DividendApplicability {
    public static String blueId() {
        return "7YPXekUAnhSyp9AcFCEqPbCAU21zbcDE5gTMTqxEu6f4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendApplicability";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendApplicability";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DividendApplicability.json";
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

    private Boolean additionalDividends;

    private Boolean allDividends;

    private Boolean optionsExchangeDividends;

    public String getNamespace() {
        return namespace;
    }

    public DividendApplicability namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getAdditionalDividends() {
        return additionalDividends;
    }

    public DividendApplicability additionalDividends(Boolean additionalDividends) {
        this.additionalDividends = additionalDividends;
        return this;
    }

    public Boolean getAllDividends() {
        return allDividends;
    }

    public DividendApplicability allDividends(Boolean allDividends) {
        this.allDividends = allDividends;
        return this;
    }

    public Boolean getOptionsExchangeDividends() {
        return optionsExchangeDividends;
    }

    public DividendApplicability optionsExchangeDividends(Boolean optionsExchangeDividends) {
        this.optionsExchangeDividends = optionsExchangeDividends;
        return this;
    }

}
