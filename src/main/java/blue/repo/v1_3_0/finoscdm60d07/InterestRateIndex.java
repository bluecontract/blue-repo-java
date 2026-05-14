package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("5H9s4M17sm1hip58MAWHhPPSkhcUJFU8itdTmKrx7Bfb")
public class InterestRateIndex {
    public static String blueId() {
        return "5H9s4M17sm1hip58MAWHhPPSkhcUJFU8itdTmKrx7Bfb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InterestRateIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InterestRateIndex";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/InterestRateIndex.json";
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

    // Original Blue property name: FloatingRateIndex
    @JsonProperty("FloatingRateIndex")
    private FloatingRateIndex floatingRateIndex;

    // Original Blue property name: InflationIndex
    @JsonProperty("InflationIndex")
    private InflationIndex inflationIndex;

    public String getNamespace() {
        return namespace;
    }

    public InterestRateIndex namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FloatingRateIndex getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public InterestRateIndex floatingRateIndex(FloatingRateIndex floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public InflationIndex getInflationIndex() {
        return inflationIndex;
    }

    public InterestRateIndex inflationIndex(InflationIndex inflationIndex) {
        this.inflationIndex = inflationIndex;
        return this;
    }

}
