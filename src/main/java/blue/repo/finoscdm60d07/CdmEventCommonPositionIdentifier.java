package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("69nLFfiGcCWNuTn9H9eiEcBwsXuqgNxxqgB7X8X9XaSz")
public class CdmEventCommonPositionIdentifier {
    public static String blueId() {
        return "69nLFfiGcCWNuTn9H9eiEcBwsXuqgNxxqgB7X8X9XaSz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/PositionIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/PositionIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonPositionIdentifier.json";
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

    public CdmEventCommonPositionIdentifier assignedIdentifier(List<CdmBaseStaticdataIdentifierAssignedIdentifier> assignedIdentifier) {
        this.assignedIdentifier = assignedIdentifier;
        return this;
    }

    public CdmBaseStaticdataIdentifierTradeIdentifierTypeEnum getIdentifierType() {
        return identifierType;
    }

    public CdmEventCommonPositionIdentifier identifierType(CdmBaseStaticdataIdentifierTradeIdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getIssuer() {
        return issuer;
    }

    public CdmEventCommonPositionIdentifier issuer(ComRosettaModelFieldWithMetaString issuer) {
        this.issuer = issuer;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getIssuerReference() {
        return issuerReference;
    }

    public CdmEventCommonPositionIdentifier issuerReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty issuerReference) {
        this.issuerReference = issuerReference;
        return this;
    }

}
