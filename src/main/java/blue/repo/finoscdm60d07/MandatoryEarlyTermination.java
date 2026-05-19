package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7Crsajf7j6Pj4ZrxWM5M8k49n89dMAubRjQR3uB4zzHL")
public class MandatoryEarlyTermination {
    public static String blueId() {
        return "7Crsajf7j6Pj4ZrxWM5M8k49n89dMAubRjQR3uB4zzHL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MandatoryEarlyTermination";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MandatoryEarlyTermination";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MandatoryEarlyTermination.json";
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

    private CalculationAgent calculationAgent;

    private SettlementTerms cashSettlement;

    private MandatoryEarlyTerminationAdjustedDates mandatoryEarlyTerminationAdjustedDates;

    private AdjustableDate mandatoryEarlyTerminationDate;

    public String getNamespace() {
        return namespace;
    }

    public MandatoryEarlyTermination namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CalculationAgent getCalculationAgent() {
        return calculationAgent;
    }

    public MandatoryEarlyTermination calculationAgent(CalculationAgent calculationAgent) {
        this.calculationAgent = calculationAgent;
        return this;
    }

    public SettlementTerms getCashSettlement() {
        return cashSettlement;
    }

    public MandatoryEarlyTermination cashSettlement(SettlementTerms cashSettlement) {
        this.cashSettlement = cashSettlement;
        return this;
    }

    public MandatoryEarlyTerminationAdjustedDates getMandatoryEarlyTerminationAdjustedDates() {
        return mandatoryEarlyTerminationAdjustedDates;
    }

    public MandatoryEarlyTermination mandatoryEarlyTerminationAdjustedDates(MandatoryEarlyTerminationAdjustedDates mandatoryEarlyTerminationAdjustedDates) {
        this.mandatoryEarlyTerminationAdjustedDates = mandatoryEarlyTerminationAdjustedDates;
        return this;
    }

    public AdjustableDate getMandatoryEarlyTerminationDate() {
        return mandatoryEarlyTerminationDate;
    }

    public MandatoryEarlyTermination mandatoryEarlyTerminationDate(AdjustableDate mandatoryEarlyTerminationDate) {
        this.mandatoryEarlyTerminationDate = mandatoryEarlyTerminationDate;
        return this;
    }

}
