package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9tpFoqFu1yX5LZEATGF8CYsE5VSXhkQua9LMXwLEX2Pv")
public class CdmBaseStaticdataIdentifierIdentifier {
    public static String blueId() {
        return "9tpFoqFu1yX5LZEATGF8CYsE5VSXhkQua9LMXwLEX2Pv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/identifier/Identifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/identifier/Identifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataidentifierIdentifier.json";
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

    public List<CdmBaseStaticdataIdentifierAssignedIdentifier> getAssignedIdentifier() {
        return assignedIdentifier;
    }

    public CdmBaseStaticdataIdentifierIdentifier assignedIdentifier(List<CdmBaseStaticdataIdentifierAssignedIdentifier> assignedIdentifier) {
        this.assignedIdentifier = assignedIdentifier;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getIssuer() {
        return issuer;
    }

    public CdmBaseStaticdataIdentifierIdentifier issuer(ComRosettaModelFieldWithMetaString issuer) {
        this.issuer = issuer;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getIssuerReference() {
        return issuerReference;
    }

    public CdmBaseStaticdataIdentifierIdentifier issuerReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty issuerReference) {
        this.issuerReference = issuerReference;
        return this;
    }

}
