package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HcZAF2MZ9WCaRxSvbnwNrsUbjiQfnvheFFUVuxRyVqQG")
public class CdmBaseStaticdataPartyFieldWithMetaNaturalPersonRoleEnum {
    public static String blueId() {
        return "HcZAF2MZ9WCaRxSvbnwNrsUbjiQfnvheFFUVuxRyVqQG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/FieldWithMetaNaturalPersonRoleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/FieldWithMetaNaturalPersonRoleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyFieldWithMetaNaturalPersonRoleEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelMetafieldsMetaFields meta;

    private CdmBaseStaticdataPartyNaturalPersonRoleEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseStaticdataPartyFieldWithMetaNaturalPersonRoleEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseStaticdataPartyNaturalPersonRoleEnum getVal() {
        return val;
    }

    public CdmBaseStaticdataPartyFieldWithMetaNaturalPersonRoleEnum val(CdmBaseStaticdataPartyNaturalPersonRoleEnum val) {
        this.val = val;
        return this;
    }

}
