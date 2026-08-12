package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FCaGFiACv9gh7BbLiPZYLCDttHSuo2J6u9uyRkQbxeSw")
public class CdmBaseMathFieldWithMetaNonNegativeQuantitySchedule {
    public static String blueId() {
        return "FCaGFiACv9gh7BbLiPZYLCDttHSuo2J6u9uyRkQbxeSw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/FieldWithMetaNonNegativeQuantitySchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/FieldWithMetaNonNegativeQuantitySchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathFieldWithMetaNonNegativeQuantitySchedule.json";
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

    private CdmBaseMathNonNegativeQuantitySchedule val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseMathFieldWithMetaNonNegativeQuantitySchedule meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseMathNonNegativeQuantitySchedule getVal() {
        return val;
    }

    public CdmBaseMathFieldWithMetaNonNegativeQuantitySchedule val(CdmBaseMathNonNegativeQuantitySchedule val) {
        this.val = val;
        return this;
    }

}
