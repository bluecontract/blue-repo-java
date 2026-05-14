package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4rYmZmkajnSzuUXxDdS4KBurqCWAhwJ1MvB32sABC32f")
public class FloatingRateProcessingDetails {
    public static String blueId() {
        return "4rYmZmkajnSzuUXxDdS4KBurqCWAhwJ1MvB32sABC32f";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateProcessingDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateProcessingDetails";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FloatingRateProcessingDetails.json";
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

    private Double processedRate;

    private FloatingRateProcessingParameters processingParameters;

    private Double rawRate;

    private Double spreadExclusiveRate;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateProcessingDetails namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getProcessedRate() {
        return processedRate;
    }

    public FloatingRateProcessingDetails processedRate(Double processedRate) {
        this.processedRate = processedRate;
        return this;
    }

    public FloatingRateProcessingParameters getProcessingParameters() {
        return processingParameters;
    }

    public FloatingRateProcessingDetails processingParameters(FloatingRateProcessingParameters processingParameters) {
        this.processingParameters = processingParameters;
        return this;
    }

    public Double getRawRate() {
        return rawRate;
    }

    public FloatingRateProcessingDetails rawRate(Double rawRate) {
        this.rawRate = rawRate;
        return this;
    }

    public Double getSpreadExclusiveRate() {
        return spreadExclusiveRate;
    }

    public FloatingRateProcessingDetails spreadExclusiveRate(Double spreadExclusiveRate) {
        this.spreadExclusiveRate = spreadExclusiveRate;
        return this;
    }

}
