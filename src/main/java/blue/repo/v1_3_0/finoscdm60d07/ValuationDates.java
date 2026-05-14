package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AQsrmM7XHGxtEASNNVzwTrUsAM1LM1HipSB7KkRoHZwy")
public class ValuationDates {
    public static String blueId() {
        return "AQsrmM7XHGxtEASNNVzwTrUsAM1LM1HipSB7KkRoHZwy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ValuationDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ValuationDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ValuationDates.json";
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

    private PerformanceValuationDates finalValuationDate;

    private PerformanceValuationDates initialValuationDate;

    private PerformanceValuationDates interimValuationDate;

    public String getNamespace() {
        return namespace;
    }

    public ValuationDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PerformanceValuationDates getFinalValuationDate() {
        return finalValuationDate;
    }

    public ValuationDates finalValuationDate(PerformanceValuationDates finalValuationDate) {
        this.finalValuationDate = finalValuationDate;
        return this;
    }

    public PerformanceValuationDates getInitialValuationDate() {
        return initialValuationDate;
    }

    public ValuationDates initialValuationDate(PerformanceValuationDates initialValuationDate) {
        this.initialValuationDate = initialValuationDate;
        return this;
    }

    public PerformanceValuationDates getInterimValuationDate() {
        return interimValuationDate;
    }

    public ValuationDates interimValuationDate(PerformanceValuationDates interimValuationDate) {
        this.interimValuationDate = interimValuationDate;
        return this;
    }

}
