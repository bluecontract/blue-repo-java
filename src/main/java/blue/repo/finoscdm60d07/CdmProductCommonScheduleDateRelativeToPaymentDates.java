package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DW32pDb5aR7QPQPk2s5ybQJuzPvqzb6S2WMHyY7WLBP7")
public class CdmProductCommonScheduleDateRelativeToPaymentDates {
    public static String blueId() {
        return "DW32pDb5aR7QPQPk2s5ybQJuzPvqzb6S2WMHyY7WLBP7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/DateRelativeToPaymentDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/DateRelativeToPaymentDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleDateRelativeToPaymentDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductCommonScheduleMetafieldsReferenceWithMetaPaymentDates> paymentDatesReference;

    public List<CdmProductCommonScheduleMetafieldsReferenceWithMetaPaymentDates> getPaymentDatesReference() {
        return paymentDatesReference;
    }

    public CdmProductCommonScheduleDateRelativeToPaymentDates paymentDatesReference(List<CdmProductCommonScheduleMetafieldsReferenceWithMetaPaymentDates> paymentDatesReference) {
        this.paymentDatesReference = paymentDatesReference;
        return this;
    }

}
