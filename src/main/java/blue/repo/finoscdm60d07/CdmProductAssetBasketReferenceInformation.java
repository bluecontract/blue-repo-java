package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("34WKd2d1noR6VuBpVgUWFuSj9Tf6otKoAWTHbR9fvzco")
public class CdmProductAssetBasketReferenceInformation {
    public static String blueId() {
        return "34WKd2d1noR6VuBpVgUWFuSj9Tf6otKoAWTHbR9fvzco";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/BasketReferenceInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/BasketReferenceInformation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetBasketReferenceInformation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<ComRosettaModelFieldWithMetaString> basketId;

    private ComRosettaModelFieldWithMetaString basketName;

    private BigInteger mthToDefault;

    private BigInteger nthToDefault;

    private CdmProductAssetReferencePool referencePool;

    private CdmProductAssetTranche tranche;

    public List<ComRosettaModelFieldWithMetaString> getBasketId() {
        return basketId;
    }

    public CdmProductAssetBasketReferenceInformation basketId(List<ComRosettaModelFieldWithMetaString> basketId) {
        this.basketId = basketId;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getBasketName() {
        return basketName;
    }

    public CdmProductAssetBasketReferenceInformation basketName(ComRosettaModelFieldWithMetaString basketName) {
        this.basketName = basketName;
        return this;
    }

    public BigInteger getMthToDefault() {
        return mthToDefault;
    }

    public CdmProductAssetBasketReferenceInformation mthToDefault(BigInteger mthToDefault) {
        this.mthToDefault = mthToDefault;
        return this;
    }

    public BigInteger getNthToDefault() {
        return nthToDefault;
    }

    public CdmProductAssetBasketReferenceInformation nthToDefault(BigInteger nthToDefault) {
        this.nthToDefault = nthToDefault;
        return this;
    }

    public CdmProductAssetReferencePool getReferencePool() {
        return referencePool;
    }

    public CdmProductAssetBasketReferenceInformation referencePool(CdmProductAssetReferencePool referencePool) {
        this.referencePool = referencePool;
        return this;
    }

    public CdmProductAssetTranche getTranche() {
        return tranche;
    }

    public CdmProductAssetBasketReferenceInformation tranche(CdmProductAssetTranche tranche) {
        this.tranche = tranche;
        return this;
    }

}
