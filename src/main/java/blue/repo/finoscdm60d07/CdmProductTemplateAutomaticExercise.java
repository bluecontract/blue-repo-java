package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6fnDZS1zqAsqg6ScqF5Y7LEwCWQtuBpB621ZXfC9ocuy")
public class CdmProductTemplateAutomaticExercise {
    public static String blueId() {
        return "6fnDZS1zqAsqg6ScqF5Y7LEwCWQtuBpB621ZXfC9ocuy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/AutomaticExercise";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/AutomaticExercise";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateAutomaticExercise.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean isApplicable;

    private Double thresholdRate;

    public Boolean getIsApplicable() {
        return isApplicable;
    }

    public CdmProductTemplateAutomaticExercise isApplicable(Boolean isApplicable) {
        this.isApplicable = isApplicable;
        return this;
    }

    public Double getThresholdRate() {
        return thresholdRate;
    }

    public CdmProductTemplateAutomaticExercise thresholdRate(Double thresholdRate) {
        this.thresholdRate = thresholdRate;
        return this;
    }

}
