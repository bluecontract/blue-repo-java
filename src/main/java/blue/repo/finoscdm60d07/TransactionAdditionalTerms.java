package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ct2Kzh1bDYFmhyzp3fjt7AFsyi2zLf9f8YU9UiNWRFR6")
public class TransactionAdditionalTerms {
    public static String blueId() {
        return "Ct2Kzh1bDYFmhyzp3fjt7AFsyi2zLf9f8YU9UiNWRFR6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TransactionAdditionalTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TransactionAdditionalTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/TransactionAdditionalTerms.json";
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

    private String commoditiesAdditionalTerms;

    private String creditAdditionalTerms;

    private String digitalAssetAdditionalTerms;

    private EquityAdditionalTerms equityAdditionalTerms;

    private FxAdditionalTerms foreignExchangeAdditionalTerms;

    private String interestRateAdditionalTerms;

    public String getNamespace() {
        return namespace;
    }

    public TransactionAdditionalTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getCommoditiesAdditionalTerms() {
        return commoditiesAdditionalTerms;
    }

    public TransactionAdditionalTerms commoditiesAdditionalTerms(String commoditiesAdditionalTerms) {
        this.commoditiesAdditionalTerms = commoditiesAdditionalTerms;
        return this;
    }

    public String getCreditAdditionalTerms() {
        return creditAdditionalTerms;
    }

    public TransactionAdditionalTerms creditAdditionalTerms(String creditAdditionalTerms) {
        this.creditAdditionalTerms = creditAdditionalTerms;
        return this;
    }

    public String getDigitalAssetAdditionalTerms() {
        return digitalAssetAdditionalTerms;
    }

    public TransactionAdditionalTerms digitalAssetAdditionalTerms(String digitalAssetAdditionalTerms) {
        this.digitalAssetAdditionalTerms = digitalAssetAdditionalTerms;
        return this;
    }

    public EquityAdditionalTerms getEquityAdditionalTerms() {
        return equityAdditionalTerms;
    }

    public TransactionAdditionalTerms equityAdditionalTerms(EquityAdditionalTerms equityAdditionalTerms) {
        this.equityAdditionalTerms = equityAdditionalTerms;
        return this;
    }

    public FxAdditionalTerms getForeignExchangeAdditionalTerms() {
        return foreignExchangeAdditionalTerms;
    }

    public TransactionAdditionalTerms foreignExchangeAdditionalTerms(FxAdditionalTerms foreignExchangeAdditionalTerms) {
        this.foreignExchangeAdditionalTerms = foreignExchangeAdditionalTerms;
        return this;
    }

    public String getInterestRateAdditionalTerms() {
        return interestRateAdditionalTerms;
    }

    public TransactionAdditionalTerms interestRateAdditionalTerms(String interestRateAdditionalTerms) {
        this.interestRateAdditionalTerms = interestRateAdditionalTerms;
        return this;
    }

}
