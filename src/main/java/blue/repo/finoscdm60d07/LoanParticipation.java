package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GXHw8PfKsMBwzS2ARFiK38v52PBuU5KKyYoGACDqkqT7")
public class LoanParticipation {
    public static String blueId() {
        return "GXHw8PfKsMBwzS2ARFiK38v52PBuU5KKyYoGACDqkqT7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LoanParticipation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LoanParticipation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/LoanParticipation.json";
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

    private Boolean applicable;

    private Boolean partialCashSettlement;

    private String qualifyingParticipationSeller;

    public String getNamespace() {
        return namespace;
    }

    public LoanParticipation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getApplicable() {
        return applicable;
    }

    public LoanParticipation applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public Boolean getPartialCashSettlement() {
        return partialCashSettlement;
    }

    public LoanParticipation partialCashSettlement(Boolean partialCashSettlement) {
        this.partialCashSettlement = partialCashSettlement;
        return this;
    }

    public String getQualifyingParticipationSeller() {
        return qualifyingParticipationSeller;
    }

    public LoanParticipation qualifyingParticipationSeller(String qualifyingParticipationSeller) {
        this.qualifyingParticipationSeller = qualifyingParticipationSeller;
        return this;
    }

}
