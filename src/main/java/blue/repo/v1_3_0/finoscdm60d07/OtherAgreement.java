package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("52yVTue9jH6t43hXgEi7hAadBGpzXEpNuJPXG8YCZrkU")
public class OtherAgreement {
    public static String blueId() {
        return "52yVTue9jH6t43hXgEi7hAadBGpzXEpNuJPXG8YCZrkU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "OtherAgreement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/OtherAgreement";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/OtherAgreement.json";
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

    private String date;

    private FieldWithMetaString identifier;

    private FieldWithMetaString otherAgreementType;

    private FieldWithMetaString version;

    public String getNamespace() {
        return namespace;
    }

    public OtherAgreement namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getDate() {
        return date;
    }

    public OtherAgreement date(String date) {
        this.date = date;
        return this;
    }

    public FieldWithMetaString getIdentifier() {
        return identifier;
    }

    public OtherAgreement identifier(FieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public FieldWithMetaString getOtherAgreementType() {
        return otherAgreementType;
    }

    public OtherAgreement otherAgreementType(FieldWithMetaString otherAgreementType) {
        this.otherAgreementType = otherAgreementType;
        return this;
    }

    public FieldWithMetaString getVersion() {
        return version;
    }

    public OtherAgreement version(FieldWithMetaString version) {
        this.version = version;
        return this;
    }

}
