package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("gPKADJjCsJ1kDz6yzRGD1GPY9UCAfkVeQ4hCAtuGiqH")
public class AdditionalFixedPayments {
    public static String blueId() {
        return "gPKADJjCsJ1kDz6yzRGD1GPY9UCAfkVeQ4hCAtuGiqH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AdditionalFixedPayments";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AdditionalFixedPayments";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AdditionalFixedPayments.json";
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

    private Boolean interestShortfallReimbursement;

    private Boolean principalShortfallReimbursement;

    private Boolean writedownReimbursement;

    public String getNamespace() {
        return namespace;
    }

    public AdditionalFixedPayments namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getInterestShortfallReimbursement() {
        return interestShortfallReimbursement;
    }

    public AdditionalFixedPayments interestShortfallReimbursement(Boolean interestShortfallReimbursement) {
        this.interestShortfallReimbursement = interestShortfallReimbursement;
        return this;
    }

    public Boolean getPrincipalShortfallReimbursement() {
        return principalShortfallReimbursement;
    }

    public AdditionalFixedPayments principalShortfallReimbursement(Boolean principalShortfallReimbursement) {
        this.principalShortfallReimbursement = principalShortfallReimbursement;
        return this;
    }

    public Boolean getWritedownReimbursement() {
        return writedownReimbursement;
    }

    public AdditionalFixedPayments writedownReimbursement(Boolean writedownReimbursement) {
        this.writedownReimbursement = writedownReimbursement;
        return this;
    }

}
