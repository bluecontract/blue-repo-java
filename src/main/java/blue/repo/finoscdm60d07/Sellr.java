package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GKPke2GakVWSUkF564qKoqGN6JFrNmQ4eSBVRCQjm2hN")
public class Sellr {
    public static String blueId() {
        return "GKPke2GakVWSUkF564qKoqGN6JFrNmQ4eSBVRCQjm2hN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Sellr";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Sellr";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Sellr.json";
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

    private AcctOwnr acctOwnr;

    public String getNamespace() {
        return namespace;
    }

    public Sellr namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AcctOwnr getAcctOwnr() {
        return acctOwnr;
    }

    public Sellr acctOwnr(AcctOwnr acctOwnr) {
        this.acctOwnr = acctOwnr;
        return this;
    }

}
