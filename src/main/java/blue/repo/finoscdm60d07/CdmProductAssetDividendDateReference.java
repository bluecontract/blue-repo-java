package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("27h9XhtCRRX1w8W56vcSY2T14PTbGigcrhbRWGDy7fKe")
public class CdmProductAssetDividendDateReference {
    public static String blueId() {
        return "27h9XhtCRRX1w8W56vcSY2T14PTbGigcrhbRWGDy7fKe";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/DividendDateReference";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/DividendDateReference";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetDividendDateReference.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetDividendDateReferenceEnum dateReference;

    private CdmBaseDatetimeOffset paymentDateOffset;

    public CdmProductAssetDividendDateReferenceEnum getDateReference() {
        return dateReference;
    }

    public CdmProductAssetDividendDateReference dateReference(CdmProductAssetDividendDateReferenceEnum dateReference) {
        this.dateReference = dateReference;
        return this;
    }

    public CdmBaseDatetimeOffset getPaymentDateOffset() {
        return paymentDateOffset;
    }

    public CdmProductAssetDividendDateReference paymentDateOffset(CdmBaseDatetimeOffset paymentDateOffset) {
        this.paymentDateOffset = paymentDateOffset;
        return this;
    }

}
