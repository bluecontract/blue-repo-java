package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FQCzuDd5gyDEJaMtqPs53Rd7rm1rp2QEJfd4RDbqmmhj")
public class ObservationDates {
    public static String blueId() {
        return "FQCzuDd5gyDEJaMtqPs53Rd7rm1rp2QEJfd4RDbqmmhj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ObservationDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ObservationDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ObservationDates.json";
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

    private ObservationSchedule observationSchedule;

    private ParametricDates parametricDates;

    private PeriodicDates periodicSchedule;

    public String getNamespace() {
        return namespace;
    }

    public ObservationDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ObservationSchedule getObservationSchedule() {
        return observationSchedule;
    }

    public ObservationDates observationSchedule(ObservationSchedule observationSchedule) {
        this.observationSchedule = observationSchedule;
        return this;
    }

    public ParametricDates getParametricDates() {
        return parametricDates;
    }

    public ObservationDates parametricDates(ParametricDates parametricDates) {
        this.parametricDates = parametricDates;
        return this;
    }

    public PeriodicDates getPeriodicSchedule() {
        return periodicSchedule;
    }

    public ObservationDates periodicSchedule(PeriodicDates periodicSchedule) {
        this.periodicSchedule = periodicSchedule;
        return this;
    }

}
