package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Cr4KtAH7mu5MMJfyawwrJAhvpaJgfc1nuafU9htHysds")
public class Buyr {
    public static String blueId() {
        return "Cr4KtAH7mu5MMJfyawwrJAhvpaJgfc1nuafU9htHysds";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Buyr";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Buyr";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Buyr.json";
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

    public Buyr namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AcctOwnr getAcctOwnr() {
        return acctOwnr;
    }

    public Buyr acctOwnr(AcctOwnr acctOwnr) {
        this.acctOwnr = acctOwnr;
        return this;
    }

}
