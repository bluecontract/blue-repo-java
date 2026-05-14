package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("F4yDfXhRMJ7rWfFao221xsyExgJe4UkdAuUrzom9YsiD")
public class PricingDates {
    public static String blueId() {
        return "F4yDfXhRMJ7rWfFao221xsyExgJe4UkdAuUrzom9YsiD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PricingDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PricingDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PricingDates.json";
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

    private ParametricDates parametricDates;

    private List<AdjustableDates> specifiedDates;

    public String getNamespace() {
        return namespace;
    }

    public PricingDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ParametricDates getParametricDates() {
        return parametricDates;
    }

    public PricingDates parametricDates(ParametricDates parametricDates) {
        this.parametricDates = parametricDates;
        return this;
    }

    public List<AdjustableDates> getSpecifiedDates() {
        return specifiedDates;
    }

    public PricingDates specifiedDates(List<AdjustableDates> specifiedDates) {
        this.specifiedDates = specifiedDates;
        return this;
    }

}
