package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("25Xp4tJRaZyv2LV8rPbZoJ9iLwHnmizsWJiCcXHiLx75")
public class CdmProductAssetDividendPaymentDate {
    public static String blueId() {
        return "25Xp4tJRaZyv2LV8rPbZoJ9iLwHnmizsWJiCcXHiLx75";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/DividendPaymentDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/DividendPaymentDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetDividendPaymentDate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDate dividendDate;

    private CdmProductAssetDividendDateReference dividendDateReference;

    public CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDate getDividendDate() {
        return dividendDate;
    }

    public CdmProductAssetDividendPaymentDate dividendDate(CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDate dividendDate) {
        this.dividendDate = dividendDate;
        return this;
    }

    public CdmProductAssetDividendDateReference getDividendDateReference() {
        return dividendDateReference;
    }

    public CdmProductAssetDividendPaymentDate dividendDateReference(CdmProductAssetDividendDateReference dividendDateReference) {
        this.dividendDateReference = dividendDateReference;
        return this;
    }

}
