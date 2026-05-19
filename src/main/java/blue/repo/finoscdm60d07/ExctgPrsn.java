package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("D2wrSojNSx8pKr1trPfk2RDk58KSyDtxqyvr5TqFLejF")
public class ExctgPrsn {
    public static String blueId() {
        return "D2wrSojNSx8pKr1trPfk2RDk58KSyDtxqyvr5TqFLejF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExctgPrsn";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExctgPrsn";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExctgPrsn.json";
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

    public ExctgPrsn namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Prsn getPrsn() {
        return prsn;
    }

    public ExctgPrsn prsn(Prsn prsn) {
        this.prsn = prsn;
        return this;
    }

}
