package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AfKweapaqsU79LG9ZWn4qFZmKFXJo7xvzr7cVxixP86u")
public class CdmObservableAssetDividendApplicability {
    public static String blueId() {
        return "AfKweapaqsU79LG9ZWn4qFZmKFXJo7xvzr7cVxixP86u";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/DividendApplicability";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/DividendApplicability";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetDividendApplicability.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean additionalDividends;

    private Boolean allDividends;

    private Boolean optionsExchangeDividends;

    public Boolean getAdditionalDividends() {
        return additionalDividends;
    }

    public CdmObservableAssetDividendApplicability additionalDividends(Boolean additionalDividends) {
        this.additionalDividends = additionalDividends;
        return this;
    }

    public Boolean getAllDividends() {
        return allDividends;
    }

    public CdmObservableAssetDividendApplicability allDividends(Boolean allDividends) {
        this.allDividends = allDividends;
        return this;
    }

    public Boolean getOptionsExchangeDividends() {
        return optionsExchangeDividends;
    }

    public CdmObservableAssetDividendApplicability optionsExchangeDividends(Boolean optionsExchangeDividends) {
        this.optionsExchangeDividends = optionsExchangeDividends;
        return this;
    }

}
