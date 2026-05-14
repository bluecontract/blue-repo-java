package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("FhCmi92P8iKsnZPP6scsD5AeDwwPxFHkMyBfKrDSDnoh")
public class TradableProduct {
    public static String blueId() {
        return "FhCmi92P8iKsnZPP6scsD5AeDwwPxFHkMyBfKrDSDnoh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TradableProduct";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TradableProduct";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TradableProduct.json";
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

    private NotionalAdjustmentEnum adjustment;

    private List<AncillaryParty> ancillaryParty;

    private List<Counterparty> counterparty;

    private NonTransferableProduct product;

    private List<TradeLot> tradeLot;

    public String getNamespace() {
        return namespace;
    }

    public TradableProduct namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public NotionalAdjustmentEnum getAdjustment() {
        return adjustment;
    }

    public TradableProduct adjustment(NotionalAdjustmentEnum adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    public List<AncillaryParty> getAncillaryParty() {
        return ancillaryParty;
    }

    public TradableProduct ancillaryParty(List<AncillaryParty> ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public List<Counterparty> getCounterparty() {
        return counterparty;
    }

    public TradableProduct counterparty(List<Counterparty> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public NonTransferableProduct getProduct() {
        return product;
    }

    public TradableProduct product(NonTransferableProduct product) {
        this.product = product;
        return this;
    }

    public List<TradeLot> getTradeLot() {
        return tradeLot;
    }

    public TradableProduct tradeLot(List<TradeLot> tradeLot) {
        this.tradeLot = tradeLot;
        return this;
    }

}
