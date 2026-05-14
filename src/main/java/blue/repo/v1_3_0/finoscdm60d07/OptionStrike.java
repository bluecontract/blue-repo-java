package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DF8xid4wc9CWZmqxSZvdtxxGvRJv7vWZ5WAqaqApNNvK")
public class OptionStrike {
    public static String blueId() {
        return "DF8xid4wc9CWZmqxSZvdtxxGvRJv7vWZ5WAqaqApNNvK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "OptionStrike";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/OptionStrike";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/OptionStrike.json";
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

    private AveragingStrikeFeature averagingStrikeFeature;

    private ReferenceSwapCurve referenceSwapCurve;

    private Price strikePrice;

    private ReferenceWithMetaFixedRateSpecification strikeReference;

    public String getNamespace() {
        return namespace;
    }

    public OptionStrike namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AveragingStrikeFeature getAveragingStrikeFeature() {
        return averagingStrikeFeature;
    }

    public OptionStrike averagingStrikeFeature(AveragingStrikeFeature averagingStrikeFeature) {
        this.averagingStrikeFeature = averagingStrikeFeature;
        return this;
    }

    public ReferenceSwapCurve getReferenceSwapCurve() {
        return referenceSwapCurve;
    }

    public OptionStrike referenceSwapCurve(ReferenceSwapCurve referenceSwapCurve) {
        this.referenceSwapCurve = referenceSwapCurve;
        return this;
    }

    public Price getStrikePrice() {
        return strikePrice;
    }

    public OptionStrike strikePrice(Price strikePrice) {
        this.strikePrice = strikePrice;
        return this;
    }

    public ReferenceWithMetaFixedRateSpecification getStrikeReference() {
        return strikeReference;
    }

    public OptionStrike strikeReference(ReferenceWithMetaFixedRateSpecification strikeReference) {
        this.strikeReference = strikeReference;
        return this;
    }

}
