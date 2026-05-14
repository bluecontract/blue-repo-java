package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("65N198JRU5EtKKyZiyHVodRYJXU6cw1WWvJStDGNXE5a")
public class ValuationSource {
    public static String blueId() {
        return "65N198JRU5EtKKyZiyHVodRYJXU6cw1WWvJStDGNXE5a";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ValuationSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ValuationSource";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ValuationSource.json";
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

    private AncillaryEntity dealerOrCCP;

    private FxSpotRateSource informationSource;

    private ReferenceWithMetaQuotedCurrencyPair quotedCurrencyPair;

    private ReferenceBanks referenceBanks;

    private SettlementRateOption settlementRateOption;

    public String getNamespace() {
        return namespace;
    }

    public ValuationSource namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AncillaryEntity getDealerOrCCP() {
        return dealerOrCCP;
    }

    public ValuationSource dealerOrCCP(AncillaryEntity dealerOrCCP) {
        this.dealerOrCCP = dealerOrCCP;
        return this;
    }

    public FxSpotRateSource getInformationSource() {
        return informationSource;
    }

    public ValuationSource informationSource(FxSpotRateSource informationSource) {
        this.informationSource = informationSource;
        return this;
    }

    public ReferenceWithMetaQuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    public ValuationSource quotedCurrencyPair(ReferenceWithMetaQuotedCurrencyPair quotedCurrencyPair) {
        this.quotedCurrencyPair = quotedCurrencyPair;
        return this;
    }

    public ReferenceBanks getReferenceBanks() {
        return referenceBanks;
    }

    public ValuationSource referenceBanks(ReferenceBanks referenceBanks) {
        this.referenceBanks = referenceBanks;
        return this;
    }

    public SettlementRateOption getSettlementRateOption() {
        return settlementRateOption;
    }

    public ValuationSource settlementRateOption(SettlementRateOption settlementRateOption) {
        this.settlementRateOption = settlementRateOption;
        return this;
    }

}
