package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8TYiPxS12nea35y6YR9jrThpiNyYMJgNPgJCd6hF3T1i")
public class CdmBaseDatetimeFieldWithMetaCommodityBusinessCalendarEnum {
    public static String blueId() {
        return "8TYiPxS12nea35y6YR9jrThpiNyYMJgNPgJCd6hF3T1i";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/FieldWithMetaCommodityBusinessCalendarEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/FieldWithMetaCommodityBusinessCalendarEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeFieldWithMetaCommodityBusinessCalendarEnum.json";
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

    private CdmBaseDatetimeCommodityBusinessCalendarEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseDatetimeFieldWithMetaCommodityBusinessCalendarEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseDatetimeCommodityBusinessCalendarEnum getVal() {
        return val;
    }

    public CdmBaseDatetimeFieldWithMetaCommodityBusinessCalendarEnum val(CdmBaseDatetimeCommodityBusinessCalendarEnum val) {
        this.val = val;
        return this;
    }

}
