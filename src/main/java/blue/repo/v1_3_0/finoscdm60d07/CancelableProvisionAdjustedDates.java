package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("F9d2XZAefENKrZuu5FgKipQvzCkxHGqHhV4EQuBQaLs3")
public class CancelableProvisionAdjustedDates {
    public static String blueId() {
        return "F9d2XZAefENKrZuu5FgKipQvzCkxHGqHhV4EQuBQaLs3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CancelableProvisionAdjustedDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CancelableProvisionAdjustedDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CancelableProvisionAdjustedDates.json";
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

    private List<CancellationEvent> cancellationEvent;

    public String getNamespace() {
        return namespace;
    }

    public CancelableProvisionAdjustedDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CancellationEvent> getCancellationEvent() {
        return cancellationEvent;
    }

    public CancelableProvisionAdjustedDates cancellationEvent(List<CancellationEvent> cancellationEvent) {
        this.cancellationEvent = cancellationEvent;
        return this;
    }

}
