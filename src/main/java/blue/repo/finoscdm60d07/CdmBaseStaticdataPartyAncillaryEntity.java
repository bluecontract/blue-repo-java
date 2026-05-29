package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6JvELeMZDRr5R6W3QUM7r6arPAr4DsSTRGGTzLNuuBTv")
public class CdmBaseStaticdataPartyAncillaryEntity {
    public static String blueId() {
        return "6JvELeMZDRr5R6W3QUM7r6arPAr4DsSTRGGTzLNuuBTv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/AncillaryEntity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/AncillaryEntity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyAncillaryEntity.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyAncillaryRoleEnum ancillaryParty;

    private CdmBaseStaticdataPartyLegalEntity legalEntity;

    public CdmBaseStaticdataPartyAncillaryRoleEnum getAncillaryParty() {
        return ancillaryParty;
    }

    public CdmBaseStaticdataPartyAncillaryEntity ancillaryParty(CdmBaseStaticdataPartyAncillaryRoleEnum ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getLegalEntity() {
        return legalEntity;
    }

    public CdmBaseStaticdataPartyAncillaryEntity legalEntity(CdmBaseStaticdataPartyLegalEntity legalEntity) {
        this.legalEntity = legalEntity;
        return this;
    }

}
