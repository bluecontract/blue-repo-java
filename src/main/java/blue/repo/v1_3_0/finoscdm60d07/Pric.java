package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4dhwy8BUcY3M4KufsSaVwKk8qFbto9CLN4YnnWCYfVfE#0")
public class Pric {
    public static String blueId() {
        return "4dhwy8BUcY3M4KufsSaVwKk8qFbto9CLN4YnnWCYfVfE#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Pric";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Pric";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Pric.json";
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

    private String bsisPts;

    private Pric pric;

    public String getNamespace() {
        return namespace;
    }

    public Pric namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getBsisPts() {
        return bsisPts;
    }

    public Pric bsisPts(String bsisPts) {
        this.bsisPts = bsisPts;
        return this;
    }

    public Pric getPric() {
        return pric;
    }

    public Pric pric(Pric pric) {
        this.pric = pric;
        return this;
    }

}
