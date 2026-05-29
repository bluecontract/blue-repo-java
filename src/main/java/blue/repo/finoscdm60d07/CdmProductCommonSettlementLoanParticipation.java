package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G14P9maXfUePjqhHWmNFfQEWPG5NJ18iL3rpGBMoLyDZ")
public class CdmProductCommonSettlementLoanParticipation {
    public static String blueId() {
        return "G14P9maXfUePjqhHWmNFfQEWPG5NJ18iL3rpGBMoLyDZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/LoanParticipation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/LoanParticipation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementLoanParticipation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean applicable;

    private Boolean partialCashSettlement;

    private String qualifyingParticipationSeller;

    public Boolean getApplicable() {
        return applicable;
    }

    public CdmProductCommonSettlementLoanParticipation applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public Boolean getPartialCashSettlement() {
        return partialCashSettlement;
    }

    public CdmProductCommonSettlementLoanParticipation partialCashSettlement(Boolean partialCashSettlement) {
        this.partialCashSettlement = partialCashSettlement;
        return this;
    }

    public String getQualifyingParticipationSeller() {
        return qualifyingParticipationSeller;
    }

    public CdmProductCommonSettlementLoanParticipation qualifyingParticipationSeller(String qualifyingParticipationSeller) {
        this.qualifyingParticipationSeller = qualifyingParticipationSeller;
        return this;
    }

}
