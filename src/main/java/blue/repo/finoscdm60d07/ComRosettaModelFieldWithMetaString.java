package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("41cYcBEAn2p32fgph9hx7Ft9Hb9fBeJqisyDfMubRZ8R")
public class ComRosettaModelFieldWithMetaString {
    public static String blueId() {
        return "41cYcBEAn2p32fgph9hx7Ft9Hb9fBeJqisyDfMubRZ8R";
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
