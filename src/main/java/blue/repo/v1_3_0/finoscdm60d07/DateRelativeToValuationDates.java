package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AnYaECBLsJQmWto7amXzwEeNr81c6HHFrVw7UNtpByab")
public class DateRelativeToValuationDates {
    public static String blueId() {
        return "AnYaECBLsJQmWto7amXzwEeNr81c6HHFrVw7UNtpByab";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DateRelativeToValuationDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DateRelativeToValuationDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DateRelativeToValuationDates.json";
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

    private List<ReferenceWithMetaPerformanceValuationDates> valuationDatesReference;

    public String getNamespace() {
        return namespace;
    }

    public DateRelativeToValuationDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ReferenceWithMetaPerformanceValuationDates> getValuationDatesReference() {
        return valuationDatesReference;
    }

    public DateRelativeToValuationDates valuationDatesReference(List<ReferenceWithMetaPerformanceValuationDates> valuationDatesReference) {
        this.valuationDatesReference = valuationDatesReference;
        return this;
    }

}
