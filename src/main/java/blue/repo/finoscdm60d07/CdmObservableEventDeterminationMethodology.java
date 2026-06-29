package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4Gy7A4j9sYhPf8Eqd9dXLdUFBWPHMDXxiV4n5VNAsmQF")
public class CdmObservableEventDeterminationMethodology {
    public static String blueId() {
        return "4Gy7A4j9sYhPf8Eqd9dXLdUFBWPHMDXxiV4n5VNAsmQF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/DeterminationMethodology";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/DeterminationMethodology";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventDeterminationMethodology.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathAveragingCalculationMethodEnum averagingMethod;

    private CdmObservableCommonDeterminationMethodEnum determinationMethod;

    public CdmBaseMathAveragingCalculationMethodEnum getAveragingMethod() {
        return averagingMethod;
    }

    public CdmObservableEventDeterminationMethodology averagingMethod(CdmBaseMathAveragingCalculationMethodEnum averagingMethod) {
        this.averagingMethod = averagingMethod;
        return this;
    }

    public CdmObservableCommonDeterminationMethodEnum getDeterminationMethod() {
        return determinationMethod;
    }

    public CdmObservableEventDeterminationMethodology determinationMethod(CdmObservableCommonDeterminationMethodEnum determinationMethod) {
        this.determinationMethod = determinationMethod;
        return this;
    }

}
