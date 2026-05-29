package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ha6Tqhjz1UHFLv8HHkvJRZfyUyGhWefXqcUSiETMrniq")
public class ComRosettaModelLibMetaReference {
    public static String blueId() {
        return "Ha6Tqhjz1UHFLv8HHkvJRZfyUyGhWefXqcUSiETMrniq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "com/rosetta/model/lib/meta/Reference";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/com/rosetta/model/lib/meta/Reference";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/comrosettamodellibmetaReference.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String scope;

    private String val;

    public String getScope() {
        return scope;
    }

    public ComRosettaModelLibMetaReference scope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getVal() {
        return val;
    }

    public ComRosettaModelLibMetaReference val(String val) {
        this.val = val;
        return this;
    }

}
