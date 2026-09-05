package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9mHeL92fiAV9uzZGaz7ahfDAh5vbKErK7J8pDA3Wgp6N")
public class CdmObservableAssetFallbackReferencePrice {
    public static String blueId() {
        return "9mHeL92fiAV9uzZGaz7ahfDAh5vbKErK7J8pDA3Wgp6N";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FallbackReferencePrice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FallbackReferencePrice";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFallbackReferencePrice.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetCalculationAgent calculationAgentDetermination;

    private List<CdmObservableAssetFieldWithMetaSettlementRateOptionEnum> fallBackSettlementRateOption;

    private Boolean fallbackSurveyValuationPostponement;

    private CdmObservableAssetValuationPostponement valuationPostponement;

    public CdmObservableAssetCalculationAgent getCalculationAgentDetermination() {
        return calculationAgentDetermination;
    }

    public CdmObservableAssetFallbackReferencePrice calculationAgentDetermination(CdmObservableAssetCalculationAgent calculationAgentDetermination) {
        this.calculationAgentDetermination = calculationAgentDetermination;
        return this;
    }

    public List<CdmObservableAssetFieldWithMetaSettlementRateOptionEnum> getFallBackSettlementRateOption() {
        return fallBackSettlementRateOption;
    }

    public CdmObservableAssetFallbackReferencePrice fallBackSettlementRateOption(List<CdmObservableAssetFieldWithMetaSettlementRateOptionEnum> fallBackSettlementRateOption) {
        this.fallBackSettlementRateOption = fallBackSettlementRateOption;
        return this;
    }

    public Boolean getFallbackSurveyValuationPostponement() {
        return fallbackSurveyValuationPostponement;
    }

    public CdmObservableAssetFallbackReferencePrice fallbackSurveyValuationPostponement(Boolean fallbackSurveyValuationPostponement) {
        this.fallbackSurveyValuationPostponement = fallbackSurveyValuationPostponement;
        return this;
    }

    public CdmObservableAssetValuationPostponement getValuationPostponement() {
        return valuationPostponement;
    }

    public CdmObservableAssetFallbackReferencePrice valuationPostponement(CdmObservableAssetValuationPostponement valuationPostponement) {
        this.valuationPostponement = valuationPostponement;
        return this;
    }

}
