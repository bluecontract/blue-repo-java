package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("C3b31ujUecjD3uHficrorQPDZh2w4VibSWay98MhDZYs")
public class CdmObservableAssetPremiumExpression {
    public static String blueId() {
        return "C3b31ujUecjD3uHficrorQPDZh2w4VibSWay98MhDZYs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/PremiumExpression";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/PremiumExpression";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetPremiumExpression.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double percentageOfNotional;

    private CdmObservableAssetPremiumTypeEnum premiumType;

    private CdmObservableAssetMoney pricePerOption;

    public Double getPercentageOfNotional() {
        return percentageOfNotional;
    }

    public CdmObservableAssetPremiumExpression percentageOfNotional(Double percentageOfNotional) {
        this.percentageOfNotional = percentageOfNotional;
        return this;
    }

    public CdmObservableAssetPremiumTypeEnum getPremiumType() {
        return premiumType;
    }

    public CdmObservableAssetPremiumExpression premiumType(CdmObservableAssetPremiumTypeEnum premiumType) {
        this.premiumType = premiumType;
        return this;
    }

    public CdmObservableAssetMoney getPricePerOption() {
        return pricePerOption;
    }

    public CdmObservableAssetPremiumExpression pricePerOption(CdmObservableAssetMoney pricePerOption) {
        this.pricePerOption = pricePerOption;
        return this;
    }

}
