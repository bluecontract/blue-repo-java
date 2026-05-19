package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("49indJWF5Ln1tEKwieWYsqq9PsqURh9jMWNGMX6TLxFF")
public class ObservationSchedule {
    public static String blueId() {
        return "49indJWF5Ln1tEKwieWYsqq9PsqURh9jMWNGMX6TLxFF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ObservationSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ObservationSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ObservationSchedule.json";
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

    private BusinessDayAdjustments dateAdjustments;

    private List<ObservationDate> observationDate;

    public String getNamespace() {
        return namespace;
    }

    public ObservationSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    public ObservationSchedule dateAdjustments(BusinessDayAdjustments dateAdjustments) {
        this.dateAdjustments = dateAdjustments;
        return this;
    }

    public List<ObservationDate> getObservationDate() {
        return observationDate;
    }

    public ObservationSchedule observationDate(List<ObservationDate> observationDate) {
        this.observationDate = observationDate;
        return this;
    }

}
