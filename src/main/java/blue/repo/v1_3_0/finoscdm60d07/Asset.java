package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("Ha46gf3kVKXBNGggEB3oSexk9WX18MmmWrLadADimzeB")
public class Asset {
    public static String blueId() {
        return "Ha46gf3kVKXBNGggEB3oSexk9WX18MmmWrLadADimzeB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Asset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Asset";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Asset.json";
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

    // Original Blue property name: Instrument
    @JsonProperty("Instrument")
    private Instrument instrument;

    public String getNamespace() {
        return namespace;
    }

    public Asset namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Cash getCash() {
        return cash;
    }

    public Asset cash(Cash cash) {
        this.cash = cash;
        return this;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public Asset commodity(Commodity commodity) {
        this.commodity = commodity;
        return this;
    }

    public DigitalAsset getDigitalAsset() {
        return digitalAsset;
    }

    public Asset digitalAsset(DigitalAsset digitalAsset) {
        this.digitalAsset = digitalAsset;
        return this;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public Asset instrument(Instrument instrument) {
        this.instrument = instrument;
        return this;
    }

}
