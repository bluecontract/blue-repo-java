package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3ovMWZG1vkBZmE3FHeEHCtXaBPGJ8RUhfdw6Jryv8j4H")
public class CdmProductAssetReferencePool {
    public static String blueId() {
        return "3ovMWZG1vkBZmE3FHeEHCtXaBPGJ8RUhfdw6Jryv8j4H";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/ReferencePool";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/ReferencePool";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetReferencePool.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductAssetReferencePoolItem> referencePoolItem;

    public List<CdmProductAssetReferencePoolItem> getReferencePoolItem() {
        return referencePoolItem;
    }

    public CdmProductAssetReferencePool referencePoolItem(List<CdmProductAssetReferencePoolItem> referencePoolItem) {
        this.referencePoolItem = referencePoolItem;
        return this;
    }

}
