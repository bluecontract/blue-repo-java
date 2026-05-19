package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("951t8BxzVAQujgxDBEEfugD87B6zUu6LJZf1ZvCtCjrz")
public class ReferenceObligation {
    public static String blueId() {
        return "951t8BxzVAQujgxDBEEfugD87B6zUu6LJZf1ZvCtCjrz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceObligation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceObligation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferenceObligation.json";
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

    private LegalEntity guarantor;

    private String guarantorReference;

    private Loan loan;

    private LegalEntity primaryObligor;

    private ReferenceWithMetaLegalEntity primaryObligorReference;

    private Security security;

    private Boolean standardReferenceObligation;

    public String getNamespace() {
        return namespace;
    }

    public ReferenceObligation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public LegalEntity getGuarantor() {
        return guarantor;
    }

    public ReferenceObligation guarantor(LegalEntity guarantor) {
        this.guarantor = guarantor;
        return this;
    }

    public String getGuarantorReference() {
        return guarantorReference;
    }

    public ReferenceObligation guarantorReference(String guarantorReference) {
        this.guarantorReference = guarantorReference;
        return this;
    }

    public Loan getLoan() {
        return loan;
    }

    public ReferenceObligation loan(Loan loan) {
        this.loan = loan;
        return this;
    }

    public LegalEntity getPrimaryObligor() {
        return primaryObligor;
    }

    public ReferenceObligation primaryObligor(LegalEntity primaryObligor) {
        this.primaryObligor = primaryObligor;
        return this;
    }

    public ReferenceWithMetaLegalEntity getPrimaryObligorReference() {
        return primaryObligorReference;
    }

    public ReferenceObligation primaryObligorReference(ReferenceWithMetaLegalEntity primaryObligorReference) {
        this.primaryObligorReference = primaryObligorReference;
        return this;
    }

    public Security getSecurity() {
        return security;
    }

    public ReferenceObligation security(Security security) {
        this.security = security;
        return this;
    }

    public Boolean getStandardReferenceObligation() {
        return standardReferenceObligation;
    }

    public ReferenceObligation standardReferenceObligation(Boolean standardReferenceObligation) {
        this.standardReferenceObligation = standardReferenceObligation;
        return this;
    }

}
