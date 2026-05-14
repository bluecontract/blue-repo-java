package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("34fG1hJEjHTwQhNCQVnQRJysknf9iHKGAh9yPh8wsD4R")
public class CollateralInterestParameters {
    public static String blueId() {
        return "34fG1hJEjHTwQhNCQVnQRJysknf9iHKGAh9yPh8wsD4R";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralInterestParameters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralInterestParameters";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CollateralInterestParameters.json";
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

    private String currency;

    private CalculationFrequency interestCalculationFrequency;

    private CollateralInterestCalculationParameters interestCalculationParameters;

    private CollateralInterestHandlingParameters interestHandlingParameters;

    private CollateralMarginTypeEnum marginType;

    private CounterpartyRoleEnum postingParty;

    public String getNamespace() {
        return namespace;
    }

    public CollateralInterestParameters namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public CollateralInterestParameters currency(String currency) {
        this.currency = currency;
        return this;
    }

    public CalculationFrequency getInterestCalculationFrequency() {
        return interestCalculationFrequency;
    }

    public CollateralInterestParameters interestCalculationFrequency(CalculationFrequency interestCalculationFrequency) {
        this.interestCalculationFrequency = interestCalculationFrequency;
        return this;
    }

    public CollateralInterestCalculationParameters getInterestCalculationParameters() {
        return interestCalculationParameters;
    }

    public CollateralInterestParameters interestCalculationParameters(CollateralInterestCalculationParameters interestCalculationParameters) {
        this.interestCalculationParameters = interestCalculationParameters;
        return this;
    }

    public CollateralInterestHandlingParameters getInterestHandlingParameters() {
        return interestHandlingParameters;
    }

    public CollateralInterestParameters interestHandlingParameters(CollateralInterestHandlingParameters interestHandlingParameters) {
        this.interestHandlingParameters = interestHandlingParameters;
        return this;
    }

    public CollateralMarginTypeEnum getMarginType() {
        return marginType;
    }

    public CollateralInterestParameters marginType(CollateralMarginTypeEnum marginType) {
        this.marginType = marginType;
        return this;
    }

    public CounterpartyRoleEnum getPostingParty() {
        return postingParty;
    }

    public CollateralInterestParameters postingParty(CounterpartyRoleEnum postingParty) {
        this.postingParty = postingParty;
        return this;
    }

}
