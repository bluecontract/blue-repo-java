package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5okT4PBEHijywnb7jBieEoVCyGTRkhzDmbMEDnxtpD92")
public class CdmProductCollateralMetafieldsReferenceWithMetaCollateral {
    public static String blueId() {
        return "5okT4PBEHijywnb7jBieEoVCyGTRkhzDmbMEDnxtpD92";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/metafields/ReferenceWithMetaCollateral";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/metafields/ReferenceWithMetaCollateral";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralmetafieldsReferenceWithMetaCollateral.json";
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

    public CdmProductCollateralMetafieldsReferenceWithMetaCollateral address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmProductCollateralMetafieldsReferenceWithMetaCollateral externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmProductCollateralMetafieldsReferenceWithMetaCollateral globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
