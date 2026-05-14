package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2uCH7UMBFzW5NHpD7awFiGu8nPyCtYgGcVxmntj5ecZg")
public class Term {
    public static String blueId() {
        return "2uCH7UMBFzW5NHpD7awFiGu8nPyCtYgGcVxmntj5ecZg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Term";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Term";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Term.json";
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

    private String unit;

    private String val;

    public String getNamespace() {
        return namespace;
    }

    public Term namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public Term unit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getVal() {
        return val;
    }

    public Term val(String val) {
        this.val = val;
        return this;
    }

}
