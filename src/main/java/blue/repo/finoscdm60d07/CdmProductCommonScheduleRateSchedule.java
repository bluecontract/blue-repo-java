package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7phCnc6jaEQE2YU1kKRsCj2JBQMaraQWKWjXBrdBVpvE")
public class CdmProductCommonScheduleRateSchedule {
    public static String blueId() {
        return "7phCnc6jaEQE2YU1kKRsCj2JBQMaraQWKWjXBrdBVpvE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/RateSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/RateSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleRateSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule price;

    public CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule getPrice() {
        return price;
    }

    public CdmProductCommonScheduleRateSchedule price(CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule price) {
        this.price = price;
        return this;
    }

}
