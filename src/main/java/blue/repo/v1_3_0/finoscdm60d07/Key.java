package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4f3BH82QV3Jeiqq7YnkNLma3q324cBwzxu9HrWC6zKCY")
public class Key {
    public static String blueId() {
        return "4f3BH82QV3Jeiqq7YnkNLma3q324cBwzxu9HrWC6zKCY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Key";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Key";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Key.json";
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

    private String scope;

    private String val;

    public String getNamespace() {
        return namespace;
    }

    public Key namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public Key scope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getVal() {
        return val;
    }

    public Key val(String val) {
        this.val = val;
        return this;
    }

}
