package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EdX1FMZ4dKNPXQHdrC6jKHRgbpL1uwJfFNj5qqiYgKZw")
public class CollateralTreatment {
    public static String blueId() {
        return "EdX1FMZ4dKNPXQHdrC6jKHRgbpL1uwJfFNj5qqiYgKZw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralTreatment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralTreatment";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CollateralTreatment.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private List<ConcentrationLimit> concentrationLimit;

    private Boolean isIncluded;

    private CollateralValuationTreatment valuationTreatment;

    public String getNamespace() {
        return namespace;
    }

    public CollateralTreatment namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ConcentrationLimit> getConcentrationLimit() {
        return concentrationLimit;
    }

    public CollateralTreatment concentrationLimit(List<ConcentrationLimit> concentrationLimit) {
        this.concentrationLimit = concentrationLimit;
        return this;
    }

    public Boolean getIsIncluded() {
        return isIncluded;
    }

    public CollateralTreatment isIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
        return this;
    }

    public CollateralValuationTreatment getValuationTreatment() {
        return valuationTreatment;
    }

    public CollateralTreatment valuationTreatment(CollateralValuationTreatment valuationTreatment) {
        this.valuationTreatment = valuationTreatment;
        return this;
    }

}
