package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CxawcSK9GgyrrhWfwLyiHhNz9ZHRznnariMNfr919RoW")
public class Reference {
    public static String blueId() {
        return "CxawcSK9GgyrrhWfwLyiHhNz9ZHRznnariMNfr919RoW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Reference";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Reference";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Reference.json";
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

    public Reference namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public Reference scope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getVal() {
        return val;
    }

    public Reference val(String val) {
        this.val = val;
        return this;
    }

}
