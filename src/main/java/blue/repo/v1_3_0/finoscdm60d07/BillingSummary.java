package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9SNaLqG6dGmpAKjdLoz74qKyXHKy4mCnfr445SvopvBJ")
public class BillingSummary {
    public static String blueId() {
        return "9SNaLqG6dGmpAKjdLoz74qKyXHKy4mCnfr445SvopvBJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BillingSummary";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BillingSummary";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BillingSummary.json";
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

    private Transfer summaryTransfer;

    public String getNamespace() {
        return namespace;
    }

    public BillingSummary namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public RecordAmountTypeEnum getSummaryAmountType() {
        return summaryAmountType;
    }

    public BillingSummary summaryAmountType(RecordAmountTypeEnum summaryAmountType) {
        this.summaryAmountType = summaryAmountType;
        return this;
    }

    public Transfer getSummaryTransfer() {
        return summaryTransfer;
    }

    public BillingSummary summaryTransfer(Transfer summaryTransfer) {
        this.summaryTransfer = summaryTransfer;
        return this;
    }

}
