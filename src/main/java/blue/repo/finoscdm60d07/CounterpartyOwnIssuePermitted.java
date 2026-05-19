package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GdQdHRzaV1nDruUPUKDZcDZPnB1HTB2zX2FM1iVWaqJM")
public class CounterpartyOwnIssuePermitted {
    public static String blueId() {
        return "GdQdHRzaV1nDruUPUKDZcDZPnB1HTB2zX2FM1iVWaqJM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CounterpartyOwnIssuePermitted";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CounterpartyOwnIssuePermitted";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CounterpartyOwnIssuePermitted.json";
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

    private Boolean counterpartyOwnIssuePermitted;

    public String getNamespace() {
        return namespace;
    }

    public CounterpartyOwnIssuePermitted namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getCounterpartyOwnIssuePermitted() {
        return counterpartyOwnIssuePermitted;
    }

    public CounterpartyOwnIssuePermitted counterpartyOwnIssuePermitted(Boolean counterpartyOwnIssuePermitted) {
        this.counterpartyOwnIssuePermitted = counterpartyOwnIssuePermitted;
        return this;
    }

}
