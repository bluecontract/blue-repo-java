package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GzR7cbwzNiQXhjYVBoCoZjjS5gQuW2pqty2pX2zHCkJ7")
public class CdmEventCommonBillingSummaryInstruction {
    public static String blueId() {
        return "GzR7cbwzNiQXhjYVBoCoZjjS5gQuW2pqty2pX2zHCkJ7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/BillingSummaryInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/BillingSummaryInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonBillingSummaryInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonRecordAmountTypeEnum summaryAmountType;

    public CdmEventCommonRecordAmountTypeEnum getSummaryAmountType() {
        return summaryAmountType;
    }

    public CdmEventCommonBillingSummaryInstruction summaryAmountType(CdmEventCommonRecordAmountTypeEnum summaryAmountType) {
        this.summaryAmountType = summaryAmountType;
        return this;
    }

}
