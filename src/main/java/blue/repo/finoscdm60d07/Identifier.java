package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EdjJv5JTyG4VPv5esPYfbiA1VSWQfZA9erSSr785y3C1")
public class Identifier {
    public static String blueId() {
        return "EdjJv5JTyG4VPv5esPYfbiA1VSWQfZA9erSSr785y3C1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Identifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Identifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Identifier.json";
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

    public String getNamespace() {
        return namespace;
    }

    public Identifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<AssignedIdentifier> getAssignedIdentifier() {
        return assignedIdentifier;
    }

    public Identifier assignedIdentifier(List<AssignedIdentifier> assignedIdentifier) {
        this.assignedIdentifier = assignedIdentifier;
        return this;
    }

    public FieldWithMetaString getIssuer() {
        return issuer;
    }

    public Identifier issuer(FieldWithMetaString issuer) {
        this.issuer = issuer;
        return this;
    }

    public ReferenceWithMetaParty getIssuerReference() {
        return issuerReference;
    }

    public Identifier issuerReference(ReferenceWithMetaParty issuerReference) {
        this.issuerReference = issuerReference;
        return this;
    }

}
