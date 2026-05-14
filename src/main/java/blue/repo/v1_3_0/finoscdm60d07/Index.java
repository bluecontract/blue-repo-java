package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("DeVKbrFxpkLrJLp6obbqxxaMSeVsG4mwnFMbbwutoGF5")
public class Index {
    public static String blueId() {
        return "DeVKbrFxpkLrJLp6obbqxxaMSeVsG4mwnFMbbwutoGF5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Index";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Index";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Index.json";
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

    // Original Blue property name: CreditIndex
    @JsonProperty("CreditIndex")
    private CreditIndex creditIndex;

    // Original Blue property name: EquityIndex
    @JsonProperty("EquityIndex")
    private EquityIndex equityIndex;

    // Original Blue property name: ForeignExchangeRateIndex
    @JsonProperty("ForeignExchangeRateIndex")
    private ForeignExchangeRateIndex foreignExchangeRateIndex;

    // Original Blue property name: InterestRateIndex
    @JsonProperty("InterestRateIndex")
    private FieldWithMetaInterestRateIndex interestRateIndex;

    // Original Blue property name: OtherIndex
    @JsonProperty("OtherIndex")
    private OtherIndex otherIndex;

    public String getNamespace() {
        return namespace;
    }

    public Index namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CreditIndex getCreditIndex() {
        return creditIndex;
    }

    public Index creditIndex(CreditIndex creditIndex) {
        this.creditIndex = creditIndex;
        return this;
    }

    public EquityIndex getEquityIndex() {
        return equityIndex;
    }

    public Index equityIndex(EquityIndex equityIndex) {
        this.equityIndex = equityIndex;
        return this;
    }

    public ForeignExchangeRateIndex getForeignExchangeRateIndex() {
        return foreignExchangeRateIndex;
    }

    public Index foreignExchangeRateIndex(ForeignExchangeRateIndex foreignExchangeRateIndex) {
        this.foreignExchangeRateIndex = foreignExchangeRateIndex;
        return this;
    }

    public FieldWithMetaInterestRateIndex getInterestRateIndex() {
        return interestRateIndex;
    }

    public Index interestRateIndex(FieldWithMetaInterestRateIndex interestRateIndex) {
        this.interestRateIndex = interestRateIndex;
        return this;
    }

    public OtherIndex getOtherIndex() {
        return otherIndex;
    }

    public Index otherIndex(OtherIndex otherIndex) {
        this.otherIndex = otherIndex;
        return this;
    }

}
