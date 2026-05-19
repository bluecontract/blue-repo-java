package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("C1XtexbuhCpek6CVWtKQkvq3uLAirsPUAYJ9iGGxCpAS")
public class FieldWithMetaObservable {
    public static String blueId() {
        return "C1XtexbuhCpek6CVWtKQkvq3uLAirsPUAYJ9iGGxCpAS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaObservable";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaObservable";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaObservable.json";
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

    private Observable val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaObservable namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaObservable meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public Observable getVal() {
        return val;
    }

    public FieldWithMetaObservable val(Observable val) {
        this.val = val;
        return this;
    }

}
