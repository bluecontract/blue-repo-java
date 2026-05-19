package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BbbrRL9YPJ5qsP4ZZngyrrC3UkuCscRTQpRSt5mF5LAL")
public class DateRelativeToCalculationPeriodDates {
    public static String blueId() {
        return "BbbrRL9YPJ5qsP4ZZngyrrC3UkuCscRTQpRSt5mF5LAL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DateRelativeToCalculationPeriodDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DateRelativeToCalculationPeriodDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DateRelativeToCalculationPeriodDates.json";
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

    private List<ReferenceWithMetaCalculationPeriodDates> calculationPeriodDatesReference;

    public String getNamespace() {
        return namespace;
    }

    public DateRelativeToCalculationPeriodDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ReferenceWithMetaCalculationPeriodDates> getCalculationPeriodDatesReference() {
        return calculationPeriodDatesReference;
    }

    public DateRelativeToCalculationPeriodDates calculationPeriodDatesReference(List<ReferenceWithMetaCalculationPeriodDates> calculationPeriodDatesReference) {
        this.calculationPeriodDatesReference = calculationPeriodDatesReference;
        return this;
    }

}
