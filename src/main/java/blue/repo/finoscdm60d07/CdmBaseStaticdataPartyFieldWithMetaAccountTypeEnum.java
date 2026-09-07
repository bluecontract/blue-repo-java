package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5paBWjWmZSPjaJ7AsiTaChcQpMmJxvrkSHfpbqBHYruj")
public class CdmBaseStaticdataPartyFieldWithMetaAccountTypeEnum {
    public static String blueId() {
        return "5paBWjWmZSPjaJ7AsiTaChcQpMmJxvrkSHfpbqBHYruj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/FieldWithMetaAccountTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/FieldWithMetaAccountTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyFieldWithMetaAccountTypeEnum.json";
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

    private CdmBaseStaticdataPartyAccountTypeEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseStaticdataPartyFieldWithMetaAccountTypeEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseStaticdataPartyAccountTypeEnum getVal() {
        return val;
    }

    public CdmBaseStaticdataPartyFieldWithMetaAccountTypeEnum val(CdmBaseStaticdataPartyAccountTypeEnum val) {
        this.val = val;
        return this;
    }

}
