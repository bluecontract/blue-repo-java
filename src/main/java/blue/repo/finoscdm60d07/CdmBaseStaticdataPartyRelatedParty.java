package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8by4qiTXS4w5iqFvkoPkRQtXZauocve3KX1QvEvK4oTD")
public class CdmBaseStaticdataPartyRelatedParty {
    public static String blueId() {
        return "8by4qiTXS4w5iqFvkoPkRQtXZauocve3KX1QvEvK4oTD";
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
