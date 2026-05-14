package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4GkQ8r7UEsbZTgqppbrpdT5yEiSRqyjMK6Wmbaf6iJoe")
public class ObservationIdentifier {
    public static String blueId() {
        return "4GkQ8r7UEsbZTgqppbrpdT5yEiSRqyjMK6Wmbaf6iJoe";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ObservationIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ObservationIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ObservationIdentifier.json";
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

    private DeterminationMethodology determinationMethodology;

    private InformationSource informationSource;

    private Observable observable;

    private String observationDate;

    private TimeZone observationTime;

    public String getNamespace() {
        return namespace;
    }

    public ObservationIdentifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DeterminationMethodology getDeterminationMethodology() {
        return determinationMethodology;
    }

    public ObservationIdentifier determinationMethodology(DeterminationMethodology determinationMethodology) {
        this.determinationMethodology = determinationMethodology;
        return this;
    }

    public InformationSource getInformationSource() {
        return informationSource;
    }

    public ObservationIdentifier informationSource(InformationSource informationSource) {
        this.informationSource = informationSource;
        return this;
    }

    public Observable getObservable() {
        return observable;
    }

    public ObservationIdentifier observable(Observable observable) {
        this.observable = observable;
        return this;
    }

    public String getObservationDate() {
        return observationDate;
    }

    public ObservationIdentifier observationDate(String observationDate) {
        this.observationDate = observationDate;
        return this;
    }

    public TimeZone getObservationTime() {
        return observationTime;
    }

    public ObservationIdentifier observationTime(TimeZone observationTime) {
        this.observationTime = observationTime;
        return this;
    }

}
