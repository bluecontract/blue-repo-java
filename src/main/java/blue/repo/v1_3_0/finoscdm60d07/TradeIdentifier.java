package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3fYPqEAGPKp55ZezkKTAANdA5nVAo24xz1aUh9UChDqw")
public class TradeIdentifier {
    public static String blueId() {
        return "3fYPqEAGPKp55ZezkKTAANdA5nVAo24xz1aUh9UChDqw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TradeIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TradeIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TradeIdentifier.json";
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

    private TradeIdentifierTypeEnum identifierType;

    private FieldWithMetaString issuer;

    private ReferenceWithMetaParty issuerReference;

    public String getNamespace() {
        return namespace;
    }

    public TradeIdentifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<AssignedIdentifier> getAssignedIdentifier() {
        return assignedIdentifier;
    }

    public TradeIdentifier assignedIdentifier(List<AssignedIdentifier> assignedIdentifier) {
        this.assignedIdentifier = assignedIdentifier;
        return this;
    }

    public TradeIdentifierTypeEnum getIdentifierType() {
        return identifierType;
    }

    public TradeIdentifier identifierType(TradeIdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

    public FieldWithMetaString getIssuer() {
        return issuer;
    }

    public TradeIdentifier issuer(FieldWithMetaString issuer) {
        this.issuer = issuer;
        return this;
    }

    public ReferenceWithMetaParty getIssuerReference() {
        return issuerReference;
    }

    public TradeIdentifier issuerReference(ReferenceWithMetaParty issuerReference) {
        this.issuerReference = issuerReference;
        return this;
    }

}
