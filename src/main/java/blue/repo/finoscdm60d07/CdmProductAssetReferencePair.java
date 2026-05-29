package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("44gvwtTdb7FVnnYJ1HCxFMNTxV2xgKJR82joqJF5YaoP")
public class CdmProductAssetReferencePair {
    public static String blueId() {
        return "44gvwtTdb7FVnnYJ1HCxFMNTxV2xgKJR82joqJF5YaoP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/ReferencePair";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/ReferencePair";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetReferencePair.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyFieldWithMetaEntityTypeEnum entityType;

    private Boolean noReferenceObligation;

    private CdmBaseStaticdataPartyLegalEntity referenceEntity;

    private CdmProductAssetReferenceObligation referenceObligation;

    public CdmBaseStaticdataPartyFieldWithMetaEntityTypeEnum getEntityType() {
        return entityType;
    }

    public CdmProductAssetReferencePair entityType(CdmBaseStaticdataPartyFieldWithMetaEntityTypeEnum entityType) {
        this.entityType = entityType;
        return this;
    }

    public Boolean getNoReferenceObligation() {
        return noReferenceObligation;
    }

    public CdmProductAssetReferencePair noReferenceObligation(Boolean noReferenceObligation) {
        this.noReferenceObligation = noReferenceObligation;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getReferenceEntity() {
        return referenceEntity;
    }

    public CdmProductAssetReferencePair referenceEntity(CdmBaseStaticdataPartyLegalEntity referenceEntity) {
        this.referenceEntity = referenceEntity;
        return this;
    }

    public CdmProductAssetReferenceObligation getReferenceObligation() {
        return referenceObligation;
    }

    public CdmProductAssetReferencePair referenceObligation(CdmProductAssetReferenceObligation referenceObligation) {
        this.referenceObligation = referenceObligation;
        return this;
    }

}
