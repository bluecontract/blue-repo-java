package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("JBQsnuxVFxN3iNMcYdNDDrSvjPZ2uBGXmVMdq9rLwNYn")
public class CdmLegaldocumentationMasterTransactionAdditionalTerms {
    public static String blueId() {
        return "JBQsnuxVFxN3iNMcYdNDDrSvjPZ2uBGXmVMdq9rLwNYn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/TransactionAdditionalTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/TransactionAdditionalTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterTransactionAdditionalTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String commoditiesAdditionalTerms;

    private String creditAdditionalTerms;

    private String digitalAssetAdditionalTerms;

    private CdmLegaldocumentationMasterEquityAdditionalTerms equityAdditionalTerms;

    private CdmLegaldocumentationMasterFxAdditionalTerms foreignExchangeAdditionalTerms;

    private String interestRateAdditionalTerms;

    public String getCommoditiesAdditionalTerms() {
        return commoditiesAdditionalTerms;
    }

    public CdmLegaldocumentationMasterTransactionAdditionalTerms commoditiesAdditionalTerms(String commoditiesAdditionalTerms) {
        this.commoditiesAdditionalTerms = commoditiesAdditionalTerms;
        return this;
    }

    public String getCreditAdditionalTerms() {
        return creditAdditionalTerms;
    }

    public CdmLegaldocumentationMasterTransactionAdditionalTerms creditAdditionalTerms(String creditAdditionalTerms) {
        this.creditAdditionalTerms = creditAdditionalTerms;
        return this;
    }

    public String getDigitalAssetAdditionalTerms() {
        return digitalAssetAdditionalTerms;
    }

    public CdmLegaldocumentationMasterTransactionAdditionalTerms digitalAssetAdditionalTerms(String digitalAssetAdditionalTerms) {
        this.digitalAssetAdditionalTerms = digitalAssetAdditionalTerms;
        return this;
    }

    public CdmLegaldocumentationMasterEquityAdditionalTerms getEquityAdditionalTerms() {
        return equityAdditionalTerms;
    }

    public CdmLegaldocumentationMasterTransactionAdditionalTerms equityAdditionalTerms(CdmLegaldocumentationMasterEquityAdditionalTerms equityAdditionalTerms) {
        this.equityAdditionalTerms = equityAdditionalTerms;
        return this;
    }

    public CdmLegaldocumentationMasterFxAdditionalTerms getForeignExchangeAdditionalTerms() {
        return foreignExchangeAdditionalTerms;
    }

    public CdmLegaldocumentationMasterTransactionAdditionalTerms foreignExchangeAdditionalTerms(CdmLegaldocumentationMasterFxAdditionalTerms foreignExchangeAdditionalTerms) {
        this.foreignExchangeAdditionalTerms = foreignExchangeAdditionalTerms;
        return this;
    }

    public String getInterestRateAdditionalTerms() {
        return interestRateAdditionalTerms;
    }

    public CdmLegaldocumentationMasterTransactionAdditionalTerms interestRateAdditionalTerms(String interestRateAdditionalTerms) {
        this.interestRateAdditionalTerms = interestRateAdditionalTerms;
        return this;
    }

}
