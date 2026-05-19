package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FQTFct7VgtvDNqQWVUgLA6qStQf2vZgCDS2rivDj5sHd")
public class ExecutionDetails {
    public static String blueId() {
        return "FQTFct7VgtvDNqQWVUgLA6qStQf2vZgCDS2rivDj5sHd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExecutionDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExecutionDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExecutionDetails.json";
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

    private ExecutionTypeEnum executionType;

    private LegalEntity executionVenue;

    private IdentifiedList packageReference;

    public String getNamespace() {
        return namespace;
    }

    public ExecutionDetails namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ExecutionTypeEnum getExecutionType() {
        return executionType;
    }

    public ExecutionDetails executionType(ExecutionTypeEnum executionType) {
        this.executionType = executionType;
        return this;
    }

    public LegalEntity getExecutionVenue() {
        return executionVenue;
    }

    public ExecutionDetails executionVenue(LegalEntity executionVenue) {
        this.executionVenue = executionVenue;
        return this;
    }

    public IdentifiedList getPackageReference() {
        return packageReference;
    }

    public ExecutionDetails packageReference(IdentifiedList packageReference) {
        this.packageReference = packageReference;
        return this;
    }

}
