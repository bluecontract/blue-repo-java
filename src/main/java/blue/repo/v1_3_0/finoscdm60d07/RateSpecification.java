package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("5b1sBpDmPtZNLSXHjCftLc1CGwWiVu3ocrddEJnCLiX5")
public class RateSpecification {
    public static String blueId() {
        return "5b1sBpDmPtZNLSXHjCftLc1CGwWiVu3ocrddEJnCLiX5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RateSpecification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RateSpecification";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RateSpecification.json";
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

    // Original Blue property name: FixedRateSpecification
    @JsonProperty("FixedRateSpecification")
    private FixedRateSpecification fixedRateSpecification;

    // Original Blue property name: FloatingRateSpecification
    @JsonProperty("FloatingRateSpecification")
    private FloatingRateSpecification floatingRateSpecification;

    // Original Blue property name: InflationRateSpecification
    @JsonProperty("InflationRateSpecification")
    private InflationRateSpecification inflationRateSpecification;

    public String getNamespace() {
        return namespace;
    }

    public RateSpecification namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FixedRateSpecification getFixedRateSpecification() {
        return fixedRateSpecification;
    }

    public RateSpecification fixedRateSpecification(FixedRateSpecification fixedRateSpecification) {
        this.fixedRateSpecification = fixedRateSpecification;
        return this;
    }

    public FloatingRateSpecification getFloatingRateSpecification() {
        return floatingRateSpecification;
    }

    public RateSpecification floatingRateSpecification(FloatingRateSpecification floatingRateSpecification) {
        this.floatingRateSpecification = floatingRateSpecification;
        return this;
    }

    public InflationRateSpecification getInflationRateSpecification() {
        return inflationRateSpecification;
    }

    public RateSpecification inflationRateSpecification(InflationRateSpecification inflationRateSpecification) {
        this.inflationRateSpecification = inflationRateSpecification;
        return this;
    }

}
