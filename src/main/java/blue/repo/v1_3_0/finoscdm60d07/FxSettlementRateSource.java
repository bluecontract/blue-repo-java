package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HvvBndGpGWsRYMWr5q31wskSPiDWhsFAFPJmZ6ES2VC5")
public class FxSettlementRateSource {
    public static String blueId() {
        return "HvvBndGpGWsRYMWr5q31wskSPiDWhsFAFPJmZ6ES2VC5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FxSettlementRateSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FxSettlementRateSource";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FxSettlementRateSource.json";
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

    private FxInformationSource nonstandardSettlementRate;

    private FieldWithMetaString settlementRateOption;

    public String getNamespace() {
        return namespace;
    }

    public FxSettlementRateSource namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FxInformationSource getNonstandardSettlementRate() {
        return nonstandardSettlementRate;
    }

    public FxSettlementRateSource nonstandardSettlementRate(FxInformationSource nonstandardSettlementRate) {
        this.nonstandardSettlementRate = nonstandardSettlementRate;
        return this;
    }

    public FieldWithMetaString getSettlementRateOption() {
        return settlementRateOption;
    }

    public FxSettlementRateSource settlementRateOption(FieldWithMetaString settlementRateOption) {
        this.settlementRateOption = settlementRateOption;
        return this;
    }

}
