package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HvrBWWRL9WzJPU9bs48T3Uf9CcUgCfqtEszZPN3tYS3n")
public class ComRosettaModelFieldWithMetaString {
    public static String blueId() {
        return "HvrBWWRL9WzJPU9bs48T3Uf9CcUgCfqtEszZPN3tYS3n";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "com/rosetta/model/FieldWithMetaString";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/com/rosetta/model/FieldWithMetaString";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/comrosettamodelFieldWithMetaString.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelMetafieldsMetaFields meta;

    private String val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public ComRosettaModelFieldWithMetaString meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public String getVal() {
        return val;
    }

    public ComRosettaModelFieldWithMetaString val(String val) {
        this.val = val;
        return this;
    }

}
