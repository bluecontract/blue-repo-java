package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CZrFeAfW5MgoKi9ED165pJm5GiYaLF46FP9DShA93TmX")
public class StockSplitInstruction {
    public static String blueId() {
        return "CZrFeAfW5MgoKi9ED165pJm5GiYaLF46FP9DShA93TmX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StockSplitInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StockSplitInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/StockSplitInstruction.json";
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

    private Double adjustmentRatio;

    private String effectiveDate;

    public String getNamespace() {
        return namespace;
    }

    public StockSplitInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getAdjustmentRatio() {
        return adjustmentRatio;
    }

    public StockSplitInstruction adjustmentRatio(Double adjustmentRatio) {
        this.adjustmentRatio = adjustmentRatio;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public StockSplitInstruction effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

}
