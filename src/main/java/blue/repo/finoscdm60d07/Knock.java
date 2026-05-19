package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CmhyMFWHpSz7snSPjZB1tRSK6XMGnEFCmW9kXNLcjUNj")
public class Knock {
    public static String blueId() {
        return "CmhyMFWHpSz7snSPjZB1tRSK6XMGnEFCmW9kXNLcjUNj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Knock";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Knock";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Knock.json";
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

    private TriggerEvent knockIn;

    private TriggerEvent knockOut;

    public String getNamespace() {
        return namespace;
    }

    public Knock namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public TriggerEvent getKnockIn() {
        return knockIn;
    }

    public Knock knockIn(TriggerEvent knockIn) {
        this.knockIn = knockIn;
        return this;
    }

    public TriggerEvent getKnockOut() {
        return knockOut;
    }

    public Knock knockOut(TriggerEvent knockOut) {
        this.knockOut = knockOut;
        return this;
    }

}
