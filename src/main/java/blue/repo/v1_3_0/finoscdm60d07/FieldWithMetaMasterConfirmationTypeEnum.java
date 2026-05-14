package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DBc4zoB2wTeJiVazBHPHg5qS2Ay7NfpjNezJh3vShu2K")
public class FieldWithMetaMasterConfirmationTypeEnum {
    public static String blueId() {
        return "DBc4zoB2wTeJiVazBHPHg5qS2Ay7NfpjNezJh3vShu2K";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaMasterConfirmationTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaMasterConfirmationTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaMasterConfirmationTypeEnum.json";
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

    private MasterConfirmationTypeEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaMasterConfirmationTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaMasterConfirmationTypeEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public MasterConfirmationTypeEnum getVal() {
        return val;
    }

    public FieldWithMetaMasterConfirmationTypeEnum val(MasterConfirmationTypeEnum val) {
        this.val = val;
        return this;
    }

}
