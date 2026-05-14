package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2rxLk5AwG6xqA857PmW6HZ4RHvrtS24FutcSy2UJ7niV")
public class OtherAgreementTerms {
    public static String blueId() {
        return "2rxLk5AwG6xqA857PmW6HZ4RHvrtS24FutcSy2UJ7niV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "OtherAgreementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/OtherAgreementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/OtherAgreementTerms.json";
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

    private Boolean isSpecified;

    private String legalDocument;

    public String getNamespace() {
        return namespace;
    }

    public OtherAgreementTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getIsSpecified() {
        return isSpecified;
    }

    public OtherAgreementTerms isSpecified(Boolean isSpecified) {
        this.isSpecified = isSpecified;
        return this;
    }

    public String getLegalDocument() {
        return legalDocument;
    }

    public OtherAgreementTerms legalDocument(String legalDocument) {
        this.legalDocument = legalDocument;
        return this;
    }

}
