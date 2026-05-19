package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H7Qme61VgkFMR4cZh9Xsw2SWDY2ks3hkhEN56GA6gSDR")
public class Nm {
    public static String blueId() {
        return "H7Qme61VgkFMR4cZh9Xsw2SWDY2ks3hkhEN56GA6gSDR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Nm";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Nm";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Nm.json";
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

    private RefRate refRate;

    private Term term;

    public String getNamespace() {
        return namespace;
    }

    public Nm namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public RefRate getRefRate() {
        return refRate;
    }

    public Nm refRate(RefRate refRate) {
        this.refRate = refRate;
        return this;
    }

    public Term getTerm() {
        return term;
    }

    public Nm term(Term term) {
        this.term = term;
        return this;
    }

}
