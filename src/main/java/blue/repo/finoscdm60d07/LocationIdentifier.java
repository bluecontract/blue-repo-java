package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6aJo9GdQojGqm8Y7NyHocBSoLaDMiighDW47xaQC6p2X")
public class LocationIdentifier {
    public static String blueId() {
        return "6aJo9GdQojGqm8Y7NyHocBSoLaDMiighDW47xaQC6p2X";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LocationIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LocationIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/LocationIdentifier.json";
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

    private List<AssignedIdentifier> assignedIdentifier;

    private FieldWithMetaString issuer;

    private ReferenceWithMetaParty issuerReference;

    private CommodityLocationIdentifierTypeEnum locationIdentifierType;

    public String getNamespace() {
        return namespace;
    }

    public LocationIdentifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<AssignedIdentifier> getAssignedIdentifier() {
        return assignedIdentifier;
    }

    public LocationIdentifier assignedIdentifier(List<AssignedIdentifier> assignedIdentifier) {
        this.assignedIdentifier = assignedIdentifier;
        return this;
    }

    public FieldWithMetaString getIssuer() {
        return issuer;
    }

    public LocationIdentifier issuer(FieldWithMetaString issuer) {
        this.issuer = issuer;
        return this;
    }

    public ReferenceWithMetaParty getIssuerReference() {
        return issuerReference;
    }

    public LocationIdentifier issuerReference(ReferenceWithMetaParty issuerReference) {
        this.issuerReference = issuerReference;
        return this;
    }

    public CommodityLocationIdentifierTypeEnum getLocationIdentifierType() {
        return locationIdentifierType;
    }

    public LocationIdentifier locationIdentifierType(CommodityLocationIdentifierTypeEnum locationIdentifierType) {
        this.locationIdentifierType = locationIdentifierType;
        return this;
    }

}
