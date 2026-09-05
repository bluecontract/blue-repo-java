package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4F7qyygeicz98eEDWZKfWZGevPDVZ6hc8SFfwdpLvEG7")
public class CdmObservableAssetPriceSourceDisruption {
    public static String blueId() {
        return "4F7qyygeicz98eEDWZKfWZGevPDVZ6hc8SFfwdpLvEG7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/PriceSourceDisruption";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/PriceSourceDisruption";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetPriceSourceDisruption.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetFallbackReferencePrice fallbackReferencePrice;

    public CdmObservableAssetFallbackReferencePrice getFallbackReferencePrice() {
        return fallbackReferencePrice;
    }

    public CdmObservableAssetPriceSourceDisruption fallbackReferencePrice(CdmObservableAssetFallbackReferencePrice fallbackReferencePrice) {
        this.fallbackReferencePrice = fallbackReferencePrice;
        return this;
    }

}
