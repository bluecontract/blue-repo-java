package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FPAxoqFyYpjnbrD4hp7sdsMoL6MnajJZwnG6tKxuUJDe")
public class FieldWithMetaIdentifier {
    public static String blueId() {
        return "FPAxoqFyYpjnbrD4hp7sdsMoL6MnajJZwnG6tKxuUJDe";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaIdentifier.json";
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

    private MetaFields meta;

    private Identifier val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaIdentifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaIdentifier meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public Identifier getVal() {
        return val;
    }

    public FieldWithMetaIdentifier val(Identifier val) {
        this.val = val;
        return this;
    }

}
