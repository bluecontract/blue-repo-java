package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5tjWhqsZVUeZaraK4vLWm7YUe1Zy6yaTaZMD1QEU4hXJ")
public class CdmProductTemplateMandatoryEarlyTermination {
    public static String blueId() {
        return "5tjWhqsZVUeZaraK4vLWm7YUe1Zy6yaTaZMD1QEU4hXJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/MandatoryEarlyTermination";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/MandatoryEarlyTermination";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateMandatoryEarlyTermination.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetCalculationAgent calculationAgent;

    private CdmProductCommonSettlementSettlementTerms cashSettlement;

    private CdmProductTemplateMandatoryEarlyTerminationAdjustedDates mandatoryEarlyTerminationAdjustedDates;

    private CdmBaseDatetimeAdjustableDate mandatoryEarlyTerminationDate;

    public CdmObservableAssetCalculationAgent getCalculationAgent() {
        return calculationAgent;
    }

    public CdmProductTemplateMandatoryEarlyTermination calculationAgent(CdmObservableAssetCalculationAgent calculationAgent) {
        this.calculationAgent = calculationAgent;
        return this;
    }

    public CdmProductCommonSettlementSettlementTerms getCashSettlement() {
        return cashSettlement;
    }

    public CdmProductTemplateMandatoryEarlyTermination cashSettlement(CdmProductCommonSettlementSettlementTerms cashSettlement) {
        this.cashSettlement = cashSettlement;
        return this;
    }

    public CdmProductTemplateMandatoryEarlyTerminationAdjustedDates getMandatoryEarlyTerminationAdjustedDates() {
        return mandatoryEarlyTerminationAdjustedDates;
    }

    public CdmProductTemplateMandatoryEarlyTermination mandatoryEarlyTerminationAdjustedDates(CdmProductTemplateMandatoryEarlyTerminationAdjustedDates mandatoryEarlyTerminationAdjustedDates) {
        this.mandatoryEarlyTerminationAdjustedDates = mandatoryEarlyTerminationAdjustedDates;
        return this;
    }

    public CdmBaseDatetimeAdjustableDate getMandatoryEarlyTerminationDate() {
        return mandatoryEarlyTerminationDate;
    }

    public CdmProductTemplateMandatoryEarlyTermination mandatoryEarlyTerminationDate(CdmBaseDatetimeAdjustableDate mandatoryEarlyTerminationDate) {
        this.mandatoryEarlyTerminationDate = mandatoryEarlyTerminationDate;
        return this;
    }

}
