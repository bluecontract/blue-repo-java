package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EaG3scavhmH8PqESnV6TerpquLZKwhGBhsFrmQAKDPiP")
public class InvstmtDcsnPrsn {
    public static String blueId() {
        return "EaG3scavhmH8PqESnV6TerpquLZKwhGBhsFrmQAKDPiP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InvstmtDcsnPrsn";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InvstmtDcsnPrsn";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/InvstmtDcsnPrsn.json";
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

    private Prsn prsn;

    public String getNamespace() {
        return namespace;
    }

    public InvstmtDcsnPrsn namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Prsn getPrsn() {
        return prsn;
    }

    public InvstmtDcsnPrsn prsn(Prsn prsn) {
        this.prsn = prsn;
        return this;
    }

}
