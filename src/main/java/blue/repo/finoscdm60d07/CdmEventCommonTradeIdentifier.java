package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Qw49apmrbX1XioCMqzw7NWw4osDXDVHUeXZjSCR9MV7")
public class CdmEventCommonTradeIdentifier {
    public static String blueId() {
        return "Qw49apmrbX1XioCMqzw7NWw4osDXDVHUeXZjSCR9MV7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/TradeIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/TradeIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonTradeIdentifier.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataIdentifierAssignedIdentifier> assignedIdentifier;

    private CdmBaseStaticdataIdentifierTradeIdentifierTypeEnum identifierType;

    private ComRosettaModelFieldWithMetaString issuer;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty issuerReference;

    public List<CdmBaseStaticdataIdentifierAssignedIdentifier> getAssignedIdentifier() {
        return assignedIdentifier;
    }

    public CdmEventCommonTradeIdentifier assignedIdentifier(List<CdmBaseStaticdataIdentifierAssignedIdentifier> assignedIdentifier) {
        this.assignedIdentifier = assignedIdentifier;
        return this;
    }

    public CdmBaseStaticdataIdentifierTradeIdentifierTypeEnum getIdentifierType() {
        return identifierType;
    }

    public CdmEventCommonTradeIdentifier identifierType(CdmBaseStaticdataIdentifierTradeIdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getIssuer() {
        return issuer;
    }

    public CdmEventCommonTradeIdentifier issuer(ComRosettaModelFieldWithMetaString issuer) {
        this.issuer = issuer;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getIssuerReference() {
        return issuerReference;
    }

    public CdmEventCommonTradeIdentifier issuerReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty issuerReference) {
        this.issuerReference = issuerReference;
        return this;
    }

}
