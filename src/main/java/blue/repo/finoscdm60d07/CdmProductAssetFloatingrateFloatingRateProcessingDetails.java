package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("J69Sz4Uv6ctiB4mjnSwqhxeCfdaxH8nDcKbss99wExLC")
public class CdmProductAssetFloatingrateFloatingRateProcessingDetails {
    public static String blueId() {
        return "J69Sz4Uv6ctiB4mjnSwqhxeCfdaxH8nDcKbss99wExLC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/floatingrate/FloatingRateProcessingDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/floatingrate/FloatingRateProcessingDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetfloatingrateFloatingRateProcessingDetails.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double processedRate;

    private CdmProductAssetFloatingrateFloatingRateProcessingParameters processingParameters;

    private Double rawRate;

    private Double spreadExclusiveRate;

    public Double getProcessedRate() {
        return processedRate;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingDetails processedRate(Double processedRate) {
        this.processedRate = processedRate;
        return this;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingParameters getProcessingParameters() {
        return processingParameters;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingDetails processingParameters(CdmProductAssetFloatingrateFloatingRateProcessingParameters processingParameters) {
        this.processingParameters = processingParameters;
        return this;
    }

    public Double getRawRate() {
        return rawRate;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingDetails rawRate(Double rawRate) {
        this.rawRate = rawRate;
        return this;
    }

    public Double getSpreadExclusiveRate() {
        return spreadExclusiveRate;
    }

    public CdmProductAssetFloatingrateFloatingRateProcessingDetails spreadExclusiveRate(Double spreadExclusiveRate) {
        this.spreadExclusiveRate = spreadExclusiveRate;
        return this;
    }

}
