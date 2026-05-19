package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("J9v21jTGg2frTkMWdhpXbby4zSbeC8WRKbP4pMvovvYL")
public class SpecificAsset {
    public static String blueId() {
        return "J9v21jTGg2frTkMWdhpXbby4zSbeC8WRKbP4pMvovvYL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SpecificAsset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SpecificAsset";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SpecificAsset.json";
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

    public SpecificAsset namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Cash getCash() {
        return cash;
    }

    public SpecificAsset cash(Cash cash) {
        this.cash = cash;
        return this;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public SpecificAsset commodity(Commodity commodity) {
        this.commodity = commodity;
        return this;
    }

    public DigitalAsset getDigitalAsset() {
        return digitalAsset;
    }

    public SpecificAsset digitalAsset(DigitalAsset digitalAsset) {
        this.digitalAsset = digitalAsset;
        return this;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public SpecificAsset instrument(Instrument instrument) {
        this.instrument = instrument;
        return this;
    }

}
