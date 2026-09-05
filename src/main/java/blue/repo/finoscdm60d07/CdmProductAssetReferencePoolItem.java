package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H2c7HVhNxEK58Xbwu6nD1WiipD31jNvGh9rKzurS9Fwv")
public class CdmProductAssetReferencePoolItem {
    public static String blueId() {
        return "H2c7HVhNxEK58Xbwu6nD1WiipD31jNvGh9rKzurS9Fwv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/ReferencePoolItem";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/ReferencePoolItem";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetReferencePoolItem.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonSettlementMetafieldsReferenceWithMetaCashSettlementTerms cashSettlementTermsReference;

    private CdmProductTemplateConstituentWeight constituentWeight;

    private CdmProductCommonSettlementMetafieldsReferenceWithMetaPhysicalSettlementTerms physicalSettlementTermsReference;

    private CdmProductAssetMetafieldsReferenceWithMetaProtectionTerms protectionTermsReference;

    private CdmProductAssetReferencePair referencePair;

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaCashSettlementTerms getCashSettlementTermsReference() {
        return cashSettlementTermsReference;
    }

    public CdmProductAssetReferencePoolItem cashSettlementTermsReference(CdmProductCommonSettlementMetafieldsReferenceWithMetaCashSettlementTerms cashSettlementTermsReference) {
        this.cashSettlementTermsReference = cashSettlementTermsReference;
        return this;
    }

    public CdmProductTemplateConstituentWeight getConstituentWeight() {
        return constituentWeight;
    }

    public CdmProductAssetReferencePoolItem constituentWeight(CdmProductTemplateConstituentWeight constituentWeight) {
        this.constituentWeight = constituentWeight;
        return this;
    }

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaPhysicalSettlementTerms getPhysicalSettlementTermsReference() {
        return physicalSettlementTermsReference;
    }

    public CdmProductAssetReferencePoolItem physicalSettlementTermsReference(CdmProductCommonSettlementMetafieldsReferenceWithMetaPhysicalSettlementTerms physicalSettlementTermsReference) {
        this.physicalSettlementTermsReference = physicalSettlementTermsReference;
        return this;
    }

    public CdmProductAssetMetafieldsReferenceWithMetaProtectionTerms getProtectionTermsReference() {
        return protectionTermsReference;
    }

    public CdmProductAssetReferencePoolItem protectionTermsReference(CdmProductAssetMetafieldsReferenceWithMetaProtectionTerms protectionTermsReference) {
        this.protectionTermsReference = protectionTermsReference;
        return this;
    }

    public CdmProductAssetReferencePair getReferencePair() {
        return referencePair;
    }

    public CdmProductAssetReferencePoolItem referencePair(CdmProductAssetReferencePair referencePair) {
        this.referencePair = referencePair;
        return this;
    }

}
