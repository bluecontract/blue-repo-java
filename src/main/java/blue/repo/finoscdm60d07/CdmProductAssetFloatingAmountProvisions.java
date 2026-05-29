package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Gd3N5B2Q5Fb7AXEaXfe3iXtXmHuAUXDYpfeqAF9fULPd")
public class CdmProductAssetFloatingAmountProvisions {
    public static String blueId() {
        return "Gd3N5B2Q5Fb7AXEaXfe3iXtXmHuAUXDYpfeqAF9fULPd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FloatingAmountProvisions";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FloatingAmountProvisions";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFloatingAmountProvisions.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean stepUpProvision;

    private Boolean wacCapInterestProvision;

    public Boolean getStepUpProvision() {
        return stepUpProvision;
    }

    public CdmProductAssetFloatingAmountProvisions stepUpProvision(Boolean stepUpProvision) {
        this.stepUpProvision = stepUpProvision;
        return this;
    }

    public Boolean getWacCapInterestProvision() {
        return wacCapInterestProvision;
    }

    public CdmProductAssetFloatingAmountProvisions wacCapInterestProvision(Boolean wacCapInterestProvision) {
        this.wacCapInterestProvision = wacCapInterestProvision;
        return this;
    }

}
