package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CBuAJiMsCvXZ2Uq7xDDLkUhnWrgWWb6ELFeyFWPmkyMm")
public class FallbackReferencePrice {
    public static String blueId() {
        return "CBuAJiMsCvXZ2Uq7xDDLkUhnWrgWWb6ELFeyFWPmkyMm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FallbackReferencePrice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FallbackReferencePrice";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FallbackReferencePrice.json";
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

    private CalculationAgent calculationAgentDetermination;

    private List<FieldWithMetaSettlementRateOptionEnum> fallBackSettlementRateOption;

    private Boolean fallbackSurveyValuationPostponement;

    private ValuationPostponement valuationPostponement;

    public String getNamespace() {
        return namespace;
    }

    public FallbackReferencePrice namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CalculationAgent getCalculationAgentDetermination() {
        return calculationAgentDetermination;
    }

    public FallbackReferencePrice calculationAgentDetermination(CalculationAgent calculationAgentDetermination) {
        this.calculationAgentDetermination = calculationAgentDetermination;
        return this;
    }

    public List<FieldWithMetaSettlementRateOptionEnum> getFallBackSettlementRateOption() {
        return fallBackSettlementRateOption;
    }

    public FallbackReferencePrice fallBackSettlementRateOption(List<FieldWithMetaSettlementRateOptionEnum> fallBackSettlementRateOption) {
        this.fallBackSettlementRateOption = fallBackSettlementRateOption;
        return this;
    }

    public Boolean getFallbackSurveyValuationPostponement() {
        return fallbackSurveyValuationPostponement;
    }

    public FallbackReferencePrice fallbackSurveyValuationPostponement(Boolean fallbackSurveyValuationPostponement) {
        this.fallbackSurveyValuationPostponement = fallbackSurveyValuationPostponement;
        return this;
    }

    public ValuationPostponement getValuationPostponement() {
        return valuationPostponement;
    }

    public FallbackReferencePrice valuationPostponement(ValuationPostponement valuationPostponement) {
        this.valuationPostponement = valuationPostponement;
        return this;
    }

}
