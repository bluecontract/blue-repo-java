package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ad6xt3gxZGZhgoVLeMQ7CEg6aLkmfkexpd4EFmE4kLzn")
public class VolatilityCapFloor {
    public static String blueId() {
        return "Ad6xt3gxZGZhgoVLeMQ7CEg6aLkmfkexpd4EFmE4kLzn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "VolatilityCapFloor";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/VolatilityCapFloor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/VolatilityCapFloor.json";
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

    private Boolean applicable;

    private Double totalVolatilityCap;

    private Double volatilityCapFactor;

    public String getNamespace() {
        return namespace;
    }

    public VolatilityCapFloor namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getApplicable() {
        return applicable;
    }

    public VolatilityCapFloor applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public Double getTotalVolatilityCap() {
        return totalVolatilityCap;
    }

    public VolatilityCapFloor totalVolatilityCap(Double totalVolatilityCap) {
        this.totalVolatilityCap = totalVolatilityCap;
        return this;
    }

    public Double getVolatilityCapFactor() {
        return volatilityCapFactor;
    }

    public VolatilityCapFloor volatilityCapFactor(Double volatilityCapFactor) {
        this.volatilityCapFactor = volatilityCapFactor;
        return this;
    }

}
