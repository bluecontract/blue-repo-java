package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#7")
public class TransferableProduct {
    public static String blueId() {
        return "5kXk9Uzw8zdnt3rnmXD4h4i6DVxmrWtL7ZKyDsPx9nMf#7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TransferableProduct";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TransferableProduct";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TransferableProduct.json";
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

    // Original Blue property name: Cash
    @JsonProperty("Cash")
    private Cash cash;

    // Original Blue property name: Commodity
    @JsonProperty("Commodity")
    private Commodity commodity;

    // Original Blue property name: DigitalAsset
    @JsonProperty("DigitalAsset")
    private DigitalAsset digitalAsset;

    private EconomicTerms economicTerms;

    // Original Blue property name: Instrument
    @JsonProperty("Instrument")
    private Instrument instrument;

    public String getNamespace() {
        return namespace;
    }

    public TransferableProduct namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Cash getCash() {
        return cash;
    }

    public TransferableProduct cash(Cash cash) {
        this.cash = cash;
        return this;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public TransferableProduct commodity(Commodity commodity) {
        this.commodity = commodity;
        return this;
    }

    public DigitalAsset getDigitalAsset() {
        return digitalAsset;
    }

    public TransferableProduct digitalAsset(DigitalAsset digitalAsset) {
        this.digitalAsset = digitalAsset;
        return this;
    }

    public EconomicTerms getEconomicTerms() {
        return economicTerms;
    }

    public TransferableProduct economicTerms(EconomicTerms economicTerms) {
        this.economicTerms = economicTerms;
        return this;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public TransferableProduct instrument(Instrument instrument) {
        this.instrument = instrument;
        return this;
    }

}
