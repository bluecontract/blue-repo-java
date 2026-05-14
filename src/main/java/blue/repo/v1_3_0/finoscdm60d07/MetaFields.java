package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("JD8ko8cUQ19mR5qp9RzbrvvRZvuXuQ6zGjMNd5e4cbmF")
public class MetaFields {
    public static String blueId() {
        return "JD8ko8cUQ19mR5qp9RzbrvvRZvuXuQ6zGjMNd5e4cbmF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MetaFields";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MetaFields";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MetaFields.json";
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

    private String externalKey;

    private String globalKey;

    private List<Key> key;

    private String scheme;

    public String getNamespace() {
        return namespace;
    }

    public MetaFields namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getExternalKey() {
        return externalKey;
    }

    public MetaFields externalKey(String externalKey) {
        this.externalKey = externalKey;
        return this;
    }

    public String getGlobalKey() {
        return globalKey;
    }

    public MetaFields globalKey(String globalKey) {
        this.globalKey = globalKey;
        return this;
    }

    public List<Key> getKey() {
        return key;
    }

    public MetaFields key(List<Key> key) {
        this.key = key;
        return this;
    }

    public String getScheme() {
        return scheme;
    }

    public MetaFields scheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

}
