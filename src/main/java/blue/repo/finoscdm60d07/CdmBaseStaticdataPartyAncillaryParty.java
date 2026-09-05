package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DxW6v9Eqes2GNByfJjPwiexQ3383NQkjaGcH3EsU9YPW")
public class CdmBaseStaticdataPartyAncillaryParty {
    public static String blueId() {
        return "DxW6v9Eqes2GNByfJjPwiexQ3383NQkjaGcH3EsU9YPW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/AncillaryParty";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/AncillaryParty";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyAncillaryParty.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyCounterpartyRoleEnum onBehalfOf;

    private List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> partyReference;

    private CdmBaseStaticdataPartyAncillaryRoleEnum role;

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getOnBehalfOf() {
        return onBehalfOf;
    }

    public CdmBaseStaticdataPartyAncillaryParty onBehalfOf(CdmBaseStaticdataPartyCounterpartyRoleEnum onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> getPartyReference() {
        return partyReference;
    }

    public CdmBaseStaticdataPartyAncillaryParty partyReference(List<CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty> partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public CdmBaseStaticdataPartyAncillaryRoleEnum getRole() {
        return role;
    }

    public CdmBaseStaticdataPartyAncillaryParty role(CdmBaseStaticdataPartyAncillaryRoleEnum role) {
        this.role = role;
        return this;
    }

}
