package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D5MVAPQZZQMZXFW2noGBFFgRgvJ2sLSL8SKwphof8rd4")
public class CdmProductAssetMetafieldsReferenceWithMetaProtectionTerms {
    public static String blueId() {
        return "D5MVAPQZZQMZXFW2noGBFFgRgvJ2sLSL8SKwphof8rd4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/metafields/ReferenceWithMetaProtectionTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/metafields/ReferenceWithMetaProtectionTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetmetafieldsReferenceWithMetaProtectionTerms.json";
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

    public CdmProductAssetMetafieldsReferenceWithMetaProtectionTerms address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmProductAssetMetafieldsReferenceWithMetaProtectionTerms externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmProductAssetMetafieldsReferenceWithMetaProtectionTerms globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
