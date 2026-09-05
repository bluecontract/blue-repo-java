package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9oEG7wg6cNz2K9pGAc9i37tZeGy3BJr6shKrUzHGLVi1")
public class CdmBaseStaticdataPartyFieldWithMetaEntityTypeEnum {
    public static String blueId() {
        return "9oEG7wg6cNz2K9pGAc9i37tZeGy3BJr6shKrUzHGLVi1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/FieldWithMetaEntityTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/FieldWithMetaEntityTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyFieldWithMetaEntityTypeEnum.json";
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

    private CdmBaseStaticdataPartyEntityTypeEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseStaticdataPartyFieldWithMetaEntityTypeEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseStaticdataPartyEntityTypeEnum getVal() {
        return val;
    }

    public CdmBaseStaticdataPartyFieldWithMetaEntityTypeEnum val(CdmBaseStaticdataPartyEntityTypeEnum val) {
        this.val = val;
        return this;
    }

}
