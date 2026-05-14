package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5B7jWbf2hMHCW6UKnodeGt7ZTCmYqPLkmfx9M9bZbgNE")
public class CreditLimitUtilisation {
    public static String blueId() {
        return "5B7jWbf2hMHCW6UKnodeGt7ZTCmYqPLkmfx9M9bZbgNE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditLimitUtilisation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditLimitUtilisation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CreditLimitUtilisation.json";
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

    private CreditLimitUtilisationPosition executed;

    private CreditLimitUtilisationPosition pending;

    public String getNamespace() {
        return namespace;
    }

    public CreditLimitUtilisation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CreditLimitUtilisationPosition getExecuted() {
        return executed;
    }

    public CreditLimitUtilisation executed(CreditLimitUtilisationPosition executed) {
        this.executed = executed;
        return this;
    }

    public CreditLimitUtilisationPosition getPending() {
        return pending;
    }

    public CreditLimitUtilisation pending(CreditLimitUtilisationPosition pending) {
        this.pending = pending;
        return this;
    }

}
