package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9Ju3htjUpZsgbz7MaSgs7ntw7biN6ZPVQg9UaUQA1NqT")
public class CalculationAgent {
    public static String blueId() {
        return "9Ju3htjUpZsgbz7MaSgs7ntw7biN6ZPVQg9UaUQA1NqT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculationAgent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculationAgent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CalculationAgent.json";
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

    private FieldWithMetaBusinessCenterEnum calculationAgentBusinessCenter;

    private AncillaryRoleEnum calculationAgentParty;

    private PartyDeterminationEnum calculationAgentPartyEnum;

    public String getNamespace() {
        return namespace;
    }

    public CalculationAgent namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaBusinessCenterEnum getCalculationAgentBusinessCenter() {
        return calculationAgentBusinessCenter;
    }

    public CalculationAgent calculationAgentBusinessCenter(FieldWithMetaBusinessCenterEnum calculationAgentBusinessCenter) {
        this.calculationAgentBusinessCenter = calculationAgentBusinessCenter;
        return this;
    }

    public AncillaryRoleEnum getCalculationAgentParty() {
        return calculationAgentParty;
    }

    public CalculationAgent calculationAgentParty(AncillaryRoleEnum calculationAgentParty) {
        this.calculationAgentParty = calculationAgentParty;
        return this;
    }

    public PartyDeterminationEnum getCalculationAgentPartyEnum() {
        return calculationAgentPartyEnum;
    }

    public CalculationAgent calculationAgentPartyEnum(PartyDeterminationEnum calculationAgentPartyEnum) {
        this.calculationAgentPartyEnum = calculationAgentPartyEnum;
        return this;
    }

}
