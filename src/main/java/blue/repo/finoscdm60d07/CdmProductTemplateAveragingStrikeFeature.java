package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HxYQ9z6xDVRw63wB5M3kiknebJ9fvTEFsXwtbJPtXRRD")
public class CdmProductTemplateAveragingStrikeFeature {
    public static String blueId() {
        return "HxYQ9z6xDVRw63wB5M3kiknebJ9fvTEFsXwtbJPtXRRD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/AveragingStrikeFeature";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/AveragingStrikeFeature";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateAveragingStrikeFeature.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateAveragingCalculation averagingCalculation;

    private CdmProductCommonScheduleObservationTerms observationTerms;

    public CdmProductTemplateAveragingCalculation getAveragingCalculation() {
        return averagingCalculation;
    }

    public CdmProductTemplateAveragingStrikeFeature averagingCalculation(CdmProductTemplateAveragingCalculation averagingCalculation) {
        this.averagingCalculation = averagingCalculation;
        return this;
    }

    public CdmProductCommonScheduleObservationTerms getObservationTerms() {
        return observationTerms;
    }

    public CdmProductTemplateAveragingStrikeFeature observationTerms(CdmProductCommonScheduleObservationTerms observationTerms) {
        this.observationTerms = observationTerms;
        return this;
    }

}
