package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("C3bVdtiaZxFCnE2nW87KFYsAGL6vZ2kLCAK11s2zdpb1")
public class CdmProductAssetSpreadSchedule {
    public static String blueId() {
        return "C3bVdtiaZxFCnE2nW87KFYsAGL6vZ2kLCAK11s2zdpb1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/SpreadSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/SpreadSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetSpreadSchedule.json";
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

    private CdmProductAssetFieldWithMetaSpreadScheduleTypeEnum spreadScheduleType;

    public CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule getPrice() {
        return price;
    }

    public CdmProductAssetSpreadSchedule price(CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule price) {
        this.price = price;
        return this;
    }

    public CdmProductAssetFieldWithMetaSpreadScheduleTypeEnum getSpreadScheduleType() {
        return spreadScheduleType;
    }

    public CdmProductAssetSpreadSchedule spreadScheduleType(CdmProductAssetFieldWithMetaSpreadScheduleTypeEnum spreadScheduleType) {
        this.spreadScheduleType = spreadScheduleType;
        return this;
    }

}
