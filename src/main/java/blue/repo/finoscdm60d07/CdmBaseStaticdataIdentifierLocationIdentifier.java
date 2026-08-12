package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3ozegEWX22qBx9Ne96bvMirXcEA9bBRnr9EK6ibv7Jrf")
public class CdmBaseStaticdataIdentifierLocationIdentifier {
    public static String blueId() {
        return "3ozegEWX22qBx9Ne96bvMirXcEA9bBRnr9EK6ibv7Jrf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/identifier/LocationIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/identifier/LocationIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataidentifierLocationIdentifier.json";
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

    private ComRosettaModelFieldWithMetaString issuer;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty issuerReference;

    private CdmBaseStaticdataIdentifierCommodityLocationIdentifierTypeEnum locationIdentifierType;

    public List<CdmBaseStaticdataIdentifierAssignedIdentifier> getAssignedIdentifier() {
        return assignedIdentifier;
    }

    public CdmBaseStaticdataIdentifierLocationIdentifier assignedIdentifier(List<CdmBaseStaticdataIdentifierAssignedIdentifier> assignedIdentifier) {
        this.assignedIdentifier = assignedIdentifier;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getIssuer() {
        return issuer;
    }

    public CdmBaseStaticdataIdentifierLocationIdentifier issuer(ComRosettaModelFieldWithMetaString issuer) {
        this.issuer = issuer;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getIssuerReference() {
        return issuerReference;
    }

    public CdmBaseStaticdataIdentifierLocationIdentifier issuerReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty issuerReference) {
        this.issuerReference = issuerReference;
        return this;
    }

    public CdmBaseStaticdataIdentifierCommodityLocationIdentifierTypeEnum getLocationIdentifierType() {
        return locationIdentifierType;
    }

    public CdmBaseStaticdataIdentifierLocationIdentifier locationIdentifierType(CdmBaseStaticdataIdentifierCommodityLocationIdentifierTypeEnum locationIdentifierType) {
        this.locationIdentifierType = locationIdentifierType;
        return this;
    }

}
