package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8oCekz5LcNMgbMyomSHZc3Uh3GSg2jHb6q853aCYyvdR")
public class CdmLegaldocumentationMasterEquitySwapMasterConfirmation2018 {
    public static String blueId() {
        return "8oCekz5LcNMgbMyomSHZc3Uh3GSg2jHb6q853aCYyvdR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/EquitySwapMasterConfirmation2018";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/EquitySwapMasterConfirmation2018";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterEquitySwapMasterConfirmation2018.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonSchedulePaymentDates equityCashSettlementDates;

    private CdmObservableAssetInterpolationMethodEnum linearInterpolationElection;

    private CdmProductAssetPriceReturnTerms pricingMethodElection;

    private CdmProductCommonSettlementSettlementTerms settlementTerms;

    private CdmProductAssetReturnTypeEnum typeOfSwapElection;

    private CdmObservableAssetValuationDates valuationDates;

    public CdmProductCommonSchedulePaymentDates getEquityCashSettlementDates() {
        return equityCashSettlementDates;
    }

    public CdmLegaldocumentationMasterEquitySwapMasterConfirmation2018 equityCashSettlementDates(CdmProductCommonSchedulePaymentDates equityCashSettlementDates) {
        this.equityCashSettlementDates = equityCashSettlementDates;
        return this;
    }

    public CdmObservableAssetInterpolationMethodEnum getLinearInterpolationElection() {
        return linearInterpolationElection;
    }

    public CdmLegaldocumentationMasterEquitySwapMasterConfirmation2018 linearInterpolationElection(CdmObservableAssetInterpolationMethodEnum linearInterpolationElection) {
        this.linearInterpolationElection = linearInterpolationElection;
        return this;
    }

    public CdmProductAssetPriceReturnTerms getPricingMethodElection() {
        return pricingMethodElection;
    }

    public CdmLegaldocumentationMasterEquitySwapMasterConfirmation2018 pricingMethodElection(CdmProductAssetPriceReturnTerms pricingMethodElection) {
        this.pricingMethodElection = pricingMethodElection;
        return this;
    }

    public CdmProductCommonSettlementSettlementTerms getSettlementTerms() {
        return settlementTerms;
    }

    public CdmLegaldocumentationMasterEquitySwapMasterConfirmation2018 settlementTerms(CdmProductCommonSettlementSettlementTerms settlementTerms) {
        this.settlementTerms = settlementTerms;
        return this;
    }

    public CdmProductAssetReturnTypeEnum getTypeOfSwapElection() {
        return typeOfSwapElection;
    }

    public CdmLegaldocumentationMasterEquitySwapMasterConfirmation2018 typeOfSwapElection(CdmProductAssetReturnTypeEnum typeOfSwapElection) {
        this.typeOfSwapElection = typeOfSwapElection;
        return this;
    }

    public CdmObservableAssetValuationDates getValuationDates() {
        return valuationDates;
    }

    public CdmLegaldocumentationMasterEquitySwapMasterConfirmation2018 valuationDates(CdmObservableAssetValuationDates valuationDates) {
        this.valuationDates = valuationDates;
        return this;
    }

}
