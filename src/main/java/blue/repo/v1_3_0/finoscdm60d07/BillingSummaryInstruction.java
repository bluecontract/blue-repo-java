package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("92frznAni4zu6Z9tGmoWnxiZppVT6HtEDwsVjFqBZHjG")
public class BillingSummaryInstruction {
    public static String blueId() {
        return "92frznAni4zu6Z9tGmoWnxiZppVT6HtEDwsVjFqBZHjG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BillingSummaryInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BillingSummaryInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BillingSummaryInstruction.json";
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

    private RecordAmountTypeEnum summaryAmountType;

    public String getNamespace() {
        return namespace;
    }

    public BillingSummaryInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public RecordAmountTypeEnum getSummaryAmountType() {
        return summaryAmountType;
    }

    public BillingSummaryInstruction summaryAmountType(RecordAmountTypeEnum summaryAmountType) {
        this.summaryAmountType = summaryAmountType;
        return this;
    }

}
