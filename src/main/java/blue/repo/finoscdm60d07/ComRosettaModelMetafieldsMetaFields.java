package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DWEaxDaREtLrXbX5ueFbRfuQDdqm5uLR1YKxgfDm1Ehv")
public class ComRosettaModelMetafieldsMetaFields {
    public static String blueId() {
        return "DWEaxDaREtLrXbX5ueFbRfuQDdqm5uLR1YKxgfDm1Ehv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "com/rosetta/model/metafields/MetaFields";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/com/rosetta/model/metafields/MetaFields";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/comrosettamodelmetafieldsMetaFields.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String externalKey;

    private String globalKey;

    private List<ComRosettaModelLibMetaKey> key;

    private String scheme;

    public String getExternalKey() {
        return externalKey;
    }

    public ComRosettaModelMetafieldsMetaFields externalKey(String externalKey) {
        this.externalKey = externalKey;
        return this;
    }

    public String getGlobalKey() {
        return globalKey;
    }

    public ComRosettaModelMetafieldsMetaFields globalKey(String globalKey) {
        this.globalKey = globalKey;
        return this;
    }

    public List<ComRosettaModelLibMetaKey> getKey() {
        return key;
    }

    public ComRosettaModelMetafieldsMetaFields key(List<ComRosettaModelLibMetaKey> key) {
        this.key = key;
        return this;
    }

    public String getScheme() {
        return scheme;
    }

    public ComRosettaModelMetafieldsMetaFields scheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

}
