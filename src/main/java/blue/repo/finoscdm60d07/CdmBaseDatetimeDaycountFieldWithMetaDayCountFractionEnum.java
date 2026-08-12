package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HQvDRU2HRkECU2uHD3Ej7VhhyWVYzBxPs79CZfFYccWc")
public class CdmBaseDatetimeDaycountFieldWithMetaDayCountFractionEnum {
    public static String blueId() {
        return "HQvDRU2HRkECU2uHD3Ej7VhhyWVYzBxPs79CZfFYccWc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/daycount/FieldWithMetaDayCountFractionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/daycount/FieldWithMetaDayCountFractionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimedaycountFieldWithMetaDayCountFractionEnum.json";
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

    private CdmBaseDatetimeDaycountDayCountFractionEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseDatetimeDaycountFieldWithMetaDayCountFractionEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseDatetimeDaycountDayCountFractionEnum getVal() {
        return val;
    }

    public CdmBaseDatetimeDaycountFieldWithMetaDayCountFractionEnum val(CdmBaseDatetimeDaycountDayCountFractionEnum val) {
        this.val = val;
        return this;
    }

}
