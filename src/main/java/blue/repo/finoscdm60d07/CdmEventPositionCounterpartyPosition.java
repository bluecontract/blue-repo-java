package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DhpZ3SZe34Pz3xJLcAS74rHhgZSez7ZvQx3yqmXcYA8r")
public class CdmEventPositionCounterpartyPosition {
    public static String blueId() {
        return "DhpZ3SZe34Pz3xJLcAS74rHhgZSez7ZvQx3yqmXcYA8r";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/CounterpartyPosition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/CounterpartyPosition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionCounterpartyPosition.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralMetafieldsReferenceWithMetaCollateral collateral;

    private CdmEventCommonMetafieldsReferenceWithMetaContractDetails contractDetails;

    private CdmEventCommonMetafieldsReferenceWithMetaExecutionDetails executionDetails;

    private String openDateTime;

    private List<CdmBaseStaticdataPartyParty> party;

    private List<CdmBaseStaticdataPartyPartyRole> partyRole;

    private CdmProductTemplateTradableProduct positionBase;

    private List<CdmEventCommonPositionIdentifier> positionIdentifier;

    private List<CdmEventCommonMetafieldsReferenceWithMetaTradeState> tradeReference;

    public CdmProductCollateralMetafieldsReferenceWithMetaCollateral getCollateral() {
        return collateral;
    }

    public CdmEventPositionCounterpartyPosition collateral(CdmProductCollateralMetafieldsReferenceWithMetaCollateral collateral) {
        this.collateral = collateral;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaContractDetails getContractDetails() {
        return contractDetails;
    }

    public CdmEventPositionCounterpartyPosition contractDetails(CdmEventCommonMetafieldsReferenceWithMetaContractDetails contractDetails) {
        this.contractDetails = contractDetails;
        return this;
    }

    public CdmEventCommonMetafieldsReferenceWithMetaExecutionDetails getExecutionDetails() {
        return executionDetails;
    }

    public CdmEventPositionCounterpartyPosition executionDetails(CdmEventCommonMetafieldsReferenceWithMetaExecutionDetails executionDetails) {
        this.executionDetails = executionDetails;
        return this;
    }

    public String getOpenDateTime() {
        return openDateTime;
    }

    public CdmEventPositionCounterpartyPosition openDateTime(String openDateTime) {
        this.openDateTime = openDateTime;
        return this;
    }

    public List<CdmBaseStaticdataPartyParty> getParty() {
        return party;
    }

    public CdmEventPositionCounterpartyPosition party(List<CdmBaseStaticdataPartyParty> party) {
        this.party = party;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getPartyRole() {
        return partyRole;
    }

    public CdmEventPositionCounterpartyPosition partyRole(List<CdmBaseStaticdataPartyPartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public CdmProductTemplateTradableProduct getPositionBase() {
        return positionBase;
    }

    public CdmEventPositionCounterpartyPosition positionBase(CdmProductTemplateTradableProduct positionBase) {
        this.positionBase = positionBase;
        return this;
    }

    public List<CdmEventCommonPositionIdentifier> getPositionIdentifier() {
        return positionIdentifier;
    }

    public CdmEventPositionCounterpartyPosition positionIdentifier(List<CdmEventCommonPositionIdentifier> positionIdentifier) {
        this.positionIdentifier = positionIdentifier;
        return this;
    }

    public List<CdmEventCommonMetafieldsReferenceWithMetaTradeState> getTradeReference() {
        return tradeReference;
    }

    public CdmEventPositionCounterpartyPosition tradeReference(List<CdmEventCommonMetafieldsReferenceWithMetaTradeState> tradeReference) {
        this.tradeReference = tradeReference;
        return this;
    }

}
