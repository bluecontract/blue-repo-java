package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2U7YP6Ym1jX4mFm5GexJ4F3psZB836JfxHmp6MF1dcAF")
public class CdmProductAssetMetafieldsReferenceWithMetaInterestRatePayout {
    public static String blueId() {
        return "2U7YP6Ym1jX4mFm5GexJ4F3psZB836JfxHmp6MF1dcAF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/metafields/ReferenceWithMetaInterestRatePayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/metafields/ReferenceWithMetaInterestRatePayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetmetafieldsReferenceWithMetaInterestRatePayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelLibMetaReference address;

    private String externalReference;

    private String globalReference;

    public ComRosettaModelLibMetaReference getAddress() {
        return address;
    }

    public CdmProductAssetMetafieldsReferenceWithMetaInterestRatePayout address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmProductAssetMetafieldsReferenceWithMetaInterestRatePayout externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmProductAssetMetafieldsReferenceWithMetaInterestRatePayout globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
