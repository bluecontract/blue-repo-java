package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EEamWGTMq4E2YzbSwSemTFs9Ao67H1N13ndqKGvxodGy")
public class OptionalEarlyTerminationAdjustedDates {
    public static String blueId() {
        return "EEamWGTMq4E2YzbSwSemTFs9Ao67H1N13ndqKGvxodGy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "OptionalEarlyTerminationAdjustedDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/OptionalEarlyTerminationAdjustedDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/OptionalEarlyTerminationAdjustedDates.json";
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

    private List<EarlyTerminationEvent> earlyTerminationEvent;

    public String getNamespace() {
        return namespace;
    }

    public OptionalEarlyTerminationAdjustedDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<EarlyTerminationEvent> getEarlyTerminationEvent() {
        return earlyTerminationEvent;
    }

    public OptionalEarlyTerminationAdjustedDates earlyTerminationEvent(List<EarlyTerminationEvent> earlyTerminationEvent) {
        this.earlyTerminationEvent = earlyTerminationEvent;
        return this;
    }

}
