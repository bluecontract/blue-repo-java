package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CqbA4C789vc7YHieJFX1dSWuNt3f7LkGCNjSSGF9ZfUB")
public class PositionIdentifier {
    public static String blueId() {
        return "CqbA4C789vc7YHieJFX1dSWuNt3f7LkGCNjSSGF9ZfUB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PositionIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PositionIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PositionIdentifier.json";
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

    public PositionIdentifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<AssignedIdentifier> getAssignedIdentifier() {
        return assignedIdentifier;
    }

    public PositionIdentifier assignedIdentifier(List<AssignedIdentifier> assignedIdentifier) {
        this.assignedIdentifier = assignedIdentifier;
        return this;
    }

    public TradeIdentifierTypeEnum getIdentifierType() {
        return identifierType;
    }

    public PositionIdentifier identifierType(TradeIdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

    public FieldWithMetaString getIssuer() {
        return issuer;
    }

    public PositionIdentifier issuer(FieldWithMetaString issuer) {
        this.issuer = issuer;
        return this;
    }

    public ReferenceWithMetaParty getIssuerReference() {
        return issuerReference;
    }

    public PositionIdentifier issuerReference(ReferenceWithMetaParty issuerReference) {
        this.issuerReference = issuerReference;
        return this;
    }

}
