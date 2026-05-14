package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6aZzYYyNuoKw8bvxCPBQJgyHKbSQwXXM87grnMzKZxR4")
public class ExtendibleProvisionAdjustedDates {
    public static String blueId() {
        return "6aZzYYyNuoKw8bvxCPBQJgyHKbSQwXXM87grnMzKZxR4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExtendibleProvisionAdjustedDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExtendibleProvisionAdjustedDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ExtendibleProvisionAdjustedDates.json";
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

    private List<ExtensionEvent> extensionEvent;

    public String getNamespace() {
        return namespace;
    }

    public ExtendibleProvisionAdjustedDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ExtensionEvent> getExtensionEvent() {
        return extensionEvent;
    }

    public ExtendibleProvisionAdjustedDates extensionEvent(List<ExtensionEvent> extensionEvent) {
        this.extensionEvent = extensionEvent;
        return this;
    }

}
