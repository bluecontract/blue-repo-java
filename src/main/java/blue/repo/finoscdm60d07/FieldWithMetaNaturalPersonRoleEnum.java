package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BDndxt85f58vJqNtkiyHuU2aVpXhzPJiiyauHjMi8Dnm")
public class FieldWithMetaNaturalPersonRoleEnum {
    public static String blueId() {
        return "BDndxt85f58vJqNtkiyHuU2aVpXhzPJiiyauHjMi8Dnm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaNaturalPersonRoleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaNaturalPersonRoleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaNaturalPersonRoleEnum.json";
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

    private NaturalPersonRoleEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaNaturalPersonRoleEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaNaturalPersonRoleEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public NaturalPersonRoleEnum getVal() {
        return val;
    }

    public FieldWithMetaNaturalPersonRoleEnum val(NaturalPersonRoleEnum val) {
        this.val = val;
        return this;
    }

}
