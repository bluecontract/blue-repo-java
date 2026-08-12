package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("299jVUofgxbkqW1JY3zxHjc4ivtdUPsNns5ow8dT6prR")
public class CdmEventCommonStockSplitInstruction {
    public static String blueId() {
        return "299jVUofgxbkqW1JY3zxHjc4ivtdUPsNns5ow8dT6prR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/StockSplitInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/StockSplitInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonStockSplitInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double adjustmentRatio;

    private String effectiveDate;

    public Double getAdjustmentRatio() {
        return adjustmentRatio;
    }

    public CdmEventCommonStockSplitInstruction adjustmentRatio(Double adjustmentRatio) {
        this.adjustmentRatio = adjustmentRatio;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public CdmEventCommonStockSplitInstruction effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

}
