package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ckw9v2wXUokJbSTvCdt5Q8XQuPvLbUCCx6JaAoaUpDGt")
public class CdmBaseStaticdataPartyRelatedParty {
    public static String blueId() {
        return "Ckw9v2wXUokJbSTvCdt5Q8XQuPvLbUCCx6JaAoaUpDGt";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/RelatedParty";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/RelatedParty";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyRelatedParty.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount accountReference;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference;

    private CdmBaseStaticdataPartyPartyRoleEnum role;

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount getAccountReference() {
        return accountReference;
    }

    public CdmBaseStaticdataPartyRelatedParty accountReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount accountReference) {
        this.accountReference = accountReference;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public CdmBaseStaticdataPartyRelatedParty partyReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public CdmBaseStaticdataPartyPartyRoleEnum getRole() {
        return role;
    }

    public CdmBaseStaticdataPartyRelatedParty role(CdmBaseStaticdataPartyPartyRoleEnum role) {
        this.role = role;
        return this;
    }

}
