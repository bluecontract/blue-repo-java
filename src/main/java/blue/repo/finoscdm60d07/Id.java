package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4rrAX1jmCCSty4Lam2jtxW9cXnWwNDueibcuin1vVmNK")
public class Id {
    public static String blueId() {
        return "4rrAX1jmCCSty4Lam2jtxW9cXnWwNDueibcuin1vVmNK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Id";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Id";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Id.json";
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

    private String lei;

    public String getNamespace() {
        return namespace;
    }

    public Id namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getLei() {
        return lei;
    }

    public Id lei(String lei) {
        this.lei = lei;
        return this;
    }

}
