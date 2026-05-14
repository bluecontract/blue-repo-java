package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H8tMLZL5utB9T5XRaXiQnSR5Gj394a364cNM72rjWtuY")
public class FixedRateSpecification {
    public static String blueId() {
        return "H8tMLZL5utB9T5XRaXiQnSR5Gj394a364cNM72rjWtuY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FixedRateSpecification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FixedRateSpecification";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FixedRateSpecification.json";
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

    private RateSchedule rateSchedule;

    public String getNamespace() {
        return namespace;
    }

    public FixedRateSpecification namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public RateSchedule getRateSchedule() {
        return rateSchedule;
    }

    public FixedRateSpecification rateSchedule(RateSchedule rateSchedule) {
        this.rateSchedule = rateSchedule;
        return this;
    }

}
