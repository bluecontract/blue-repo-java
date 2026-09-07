package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2p5h5L3rfyQFoJioAjrRzJXVz8kyab6xJBLXjPHTS145")
public class CdmObservableAssetCalculationAgent {
    public static String blueId() {
        return "2p5h5L3rfyQFoJioAjrRzJXVz8kyab6xJBLXjPHTS145";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/CalculationAgent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/CalculationAgent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetCalculationAgent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeFieldWithMetaBusinessCenterEnum calculationAgentBusinessCenter;

    private CdmBaseStaticdataPartyAncillaryRoleEnum calculationAgentParty;

    private CdmObservableAssetPartyDeterminationEnum calculationAgentPartyEnum;

    public CdmBaseDatetimeFieldWithMetaBusinessCenterEnum getCalculationAgentBusinessCenter() {
        return calculationAgentBusinessCenter;
    }

    public CdmObservableAssetCalculationAgent calculationAgentBusinessCenter(CdmBaseDatetimeFieldWithMetaBusinessCenterEnum calculationAgentBusinessCenter) {
        this.calculationAgentBusinessCenter = calculationAgentBusinessCenter;
        return this;
    }

    public CdmBaseStaticdataPartyAncillaryRoleEnum getCalculationAgentParty() {
        return calculationAgentParty;
    }

    public CdmObservableAssetCalculationAgent calculationAgentParty(CdmBaseStaticdataPartyAncillaryRoleEnum calculationAgentParty) {
        this.calculationAgentParty = calculationAgentParty;
        return this;
    }

    public CdmObservableAssetPartyDeterminationEnum getCalculationAgentPartyEnum() {
        return calculationAgentPartyEnum;
    }

    public CdmObservableAssetCalculationAgent calculationAgentPartyEnum(CdmObservableAssetPartyDeterminationEnum calculationAgentPartyEnum) {
        this.calculationAgentPartyEnum = calculationAgentPartyEnum;
        return this;
    }

}
