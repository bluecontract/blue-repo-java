package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9MuxTNnqdBfc2jXWLVxrcXeAQkmmc3aoj2AuNQ46RBnh")
public class CdmProductAssetMetafieldsReferenceWithMetaFixedRateSpecification {
    public static String blueId() {
        return "9MuxTNnqdBfc2jXWLVxrcXeAQkmmc3aoj2AuNQ46RBnh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/metafields/ReferenceWithMetaFixedRateSpecification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/metafields/ReferenceWithMetaFixedRateSpecification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetmetafieldsReferenceWithMetaFixedRateSpecification.json";
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

    public CdmProductAssetMetafieldsReferenceWithMetaFixedRateSpecification address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmProductAssetMetafieldsReferenceWithMetaFixedRateSpecification externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmProductAssetMetafieldsReferenceWithMetaFixedRateSpecification globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
