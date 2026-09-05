package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9P2gXh7o3Dz4mNXuMZJibxyP928gtr1XKjCZUvrV7Y6b")
public class CdmLegaldocumentationCommonFieldWithMetaContractualSupplementTypeEnum {
    public static String blueId() {
        return "9P2gXh7o3Dz4mNXuMZJibxyP928gtr1XKjCZUvrV7Y6b";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/FieldWithMetaContractualSupplementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/FieldWithMetaContractualSupplementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonFieldWithMetaContractualSupplementTypeEnum.json";
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

    private CdmLegaldocumentationCommonContractualSupplementTypeEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmLegaldocumentationCommonFieldWithMetaContractualSupplementTypeEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmLegaldocumentationCommonContractualSupplementTypeEnum getVal() {
        return val;
    }

    public CdmLegaldocumentationCommonFieldWithMetaContractualSupplementTypeEnum val(CdmLegaldocumentationCommonContractualSupplementTypeEnum val) {
        this.val = val;
        return this;
    }

}
