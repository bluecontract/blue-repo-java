package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3dJskTcZWkGvVvc2CnvQkC12gkgaSGjZ8ix7XR2XxxjR")
public class ComRosettaModelLibMetaKey {
    public static String blueId() {
        return "3dJskTcZWkGvVvc2CnvQkC12gkgaSGjZ8ix7XR2XxxjR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "com/rosetta/model/lib/meta/Key";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/com/rosetta/model/lib/meta/Key";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/comrosettamodellibmetaKey.json";
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

    public ComRosettaModelLibMetaKey scope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getVal() {
        return val;
    }

    public ComRosettaModelLibMetaKey val(String val) {
        this.val = val;
        return this;
    }

}
