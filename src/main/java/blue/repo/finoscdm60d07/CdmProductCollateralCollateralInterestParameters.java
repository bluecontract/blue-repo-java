package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EywGfAbgU3eRnV8v2fvbVyysAP9K5CoRecNjRnMTd6xM")
public class CdmProductCollateralCollateralInterestParameters {
    public static String blueId() {
        return "EywGfAbgU3eRnV8v2fvbVyysAP9K5CoRecNjRnMTd6xM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CollateralInterestParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CollateralInterestParameters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateralInterestParameters.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String currency;

    private CdmBaseDatetimeCalculationFrequency interestCalculationFrequency;

    private CdmProductCollateralCollateralInterestCalculationParameters interestCalculationParameters;

    private CdmProductCollateralCollateralInterestHandlingParameters interestHandlingParameters;

    private CdmProductCollateralCollateralMarginTypeEnum marginType;

    private CdmBaseStaticdataPartyCounterpartyRoleEnum postingParty;

    public String getCurrency() {
        return currency;
    }

    public CdmProductCollateralCollateralInterestParameters currency(String currency) {
        this.currency = currency;
        return this;
    }

    public CdmBaseDatetimeCalculationFrequency getInterestCalculationFrequency() {
        return interestCalculationFrequency;
    }

    public CdmProductCollateralCollateralInterestParameters interestCalculationFrequency(CdmBaseDatetimeCalculationFrequency interestCalculationFrequency) {
        this.interestCalculationFrequency = interestCalculationFrequency;
        return this;
    }

    public CdmProductCollateralCollateralInterestCalculationParameters getInterestCalculationParameters() {
        return interestCalculationParameters;
    }

    public CdmProductCollateralCollateralInterestParameters interestCalculationParameters(CdmProductCollateralCollateralInterestCalculationParameters interestCalculationParameters) {
        this.interestCalculationParameters = interestCalculationParameters;
        return this;
    }

    public CdmProductCollateralCollateralInterestHandlingParameters getInterestHandlingParameters() {
        return interestHandlingParameters;
    }

    public CdmProductCollateralCollateralInterestParameters interestHandlingParameters(CdmProductCollateralCollateralInterestHandlingParameters interestHandlingParameters) {
        this.interestHandlingParameters = interestHandlingParameters;
        return this;
    }

    public CdmProductCollateralCollateralMarginTypeEnum getMarginType() {
        return marginType;
    }

    public CdmProductCollateralCollateralInterestParameters marginType(CdmProductCollateralCollateralMarginTypeEnum marginType) {
        this.marginType = marginType;
        return this;
    }

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getPostingParty() {
        return postingParty;
    }

    public CdmProductCollateralCollateralInterestParameters postingParty(CdmBaseStaticdataPartyCounterpartyRoleEnum postingParty) {
        this.postingParty = postingParty;
        return this;
    }

}
