package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CSi1zVBbqZCscLxTVhCBPKgZGMA7GMAyzHCFGBevWhbd")
public class FieldWithMetaPersonIdentifier {
    public static String blueId() {
        return "CSi1zVBbqZCscLxTVhCBPKgZGMA7GMAyzHCFGBevWhbd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaPersonIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaPersonIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaPersonIdentifier.json";
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

    private PersonIdentifier val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaPersonIdentifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaPersonIdentifier meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public PersonIdentifier getVal() {
        return val;
    }

    public FieldWithMetaPersonIdentifier val(PersonIdentifier val) {
        this.val = val;
        return this;
    }

}
