package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HujV8AsVsL95SXq576MXkCBisURg1LtR4C3KYbShcNUQ")
public class SettlementRateOption {
    public static String blueId() {
        return "HujV8AsVsL95SXq576MXkCBisURg1LtR4C3KYbShcNUQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SettlementRateOption";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SettlementRateOption";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SettlementRateOption.json";
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

    private PriceSourceDisruption priceSourceDisruption;

    private FieldWithMetaSettlementRateOptionEnum settlementRateOption;

    public String getNamespace() {
        return namespace;
    }

    public SettlementRateOption namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PriceSourceDisruption getPriceSourceDisruption() {
        return priceSourceDisruption;
    }

    public SettlementRateOption priceSourceDisruption(PriceSourceDisruption priceSourceDisruption) {
        this.priceSourceDisruption = priceSourceDisruption;
        return this;
    }

    public FieldWithMetaSettlementRateOptionEnum getSettlementRateOption() {
        return settlementRateOption;
    }

    public SettlementRateOption settlementRateOption(FieldWithMetaSettlementRateOptionEnum settlementRateOption) {
        this.settlementRateOption = settlementRateOption;
        return this;
    }

}
