package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AhnjPV8YNPhbAjozktmjeX2wDwUvX9j1SLMv3rUYCvk3")
public class CdmProductAssetTranche {
    public static String blueId() {
        return "AhnjPV8YNPhbAjozktmjeX2wDwUvX9j1SLMv3rUYCvk3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/Tranche";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/Tranche";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetTranche.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double attachmentPoint;

    private Double exhaustionPoint;

    private Boolean incurredRecoveryApplicable;

    public Double getAttachmentPoint() {
        return attachmentPoint;
    }

    public CdmProductAssetTranche attachmentPoint(Double attachmentPoint) {
        this.attachmentPoint = attachmentPoint;
        return this;
    }

    public Double getExhaustionPoint() {
        return exhaustionPoint;
    }

    public CdmProductAssetTranche exhaustionPoint(Double exhaustionPoint) {
        this.exhaustionPoint = exhaustionPoint;
        return this;
    }

    public Boolean getIncurredRecoveryApplicable() {
        return incurredRecoveryApplicable;
    }

    public CdmProductAssetTranche incurredRecoveryApplicable(Boolean incurredRecoveryApplicable) {
        this.incurredRecoveryApplicable = incurredRecoveryApplicable;
        return this;
    }

}
