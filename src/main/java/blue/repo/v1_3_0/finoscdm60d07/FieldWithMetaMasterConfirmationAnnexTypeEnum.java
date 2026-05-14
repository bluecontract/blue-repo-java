package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DzXMS1nfi6ei9b7S3MewSQouA7MMwcuycJFb3ADkTBGz")
public class FieldWithMetaMasterConfirmationAnnexTypeEnum {
    public static String blueId() {
        return "DzXMS1nfi6ei9b7S3MewSQouA7MMwcuycJFb3ADkTBGz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaMasterConfirmationAnnexTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaMasterConfirmationAnnexTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaMasterConfirmationAnnexTypeEnum.json";
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

    private MasterConfirmationAnnexTypeEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaMasterConfirmationAnnexTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaMasterConfirmationAnnexTypeEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public MasterConfirmationAnnexTypeEnum getVal() {
        return val;
    }

    public FieldWithMetaMasterConfirmationAnnexTypeEnum val(MasterConfirmationAnnexTypeEnum val) {
        this.val = val;
        return this;
    }

}
