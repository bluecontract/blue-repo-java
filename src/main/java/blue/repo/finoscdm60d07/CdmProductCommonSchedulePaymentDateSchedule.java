package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("H2x8AcpWBE1vPg4EgJ99gzTwGrWbNkrkhsgom7gvbRLB")
public class CdmProductCommonSchedulePaymentDateSchedule {
    public static String blueId() {
        return "H2x8AcpWBE1vPg4EgJ99gzTwGrWbNkrkhsgom7gvbRLB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/PaymentDateSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/PaymentDateSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonschedulePaymentDateSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeAdjustableOrRelativeDate finalPaymentDate;

    private List<CdmBaseDatetimeAdjustableRelativeOrPeriodicDates> interimPaymentDates;

    public CdmBaseDatetimeAdjustableOrRelativeDate getFinalPaymentDate() {
        return finalPaymentDate;
    }

    public CdmProductCommonSchedulePaymentDateSchedule finalPaymentDate(CdmBaseDatetimeAdjustableOrRelativeDate finalPaymentDate) {
        this.finalPaymentDate = finalPaymentDate;
        return this;
    }

    public List<CdmBaseDatetimeAdjustableRelativeOrPeriodicDates> getInterimPaymentDates() {
        return interimPaymentDates;
    }

    public CdmProductCommonSchedulePaymentDateSchedule interimPaymentDates(List<CdmBaseDatetimeAdjustableRelativeOrPeriodicDates> interimPaymentDates) {
        this.interimPaymentDates = interimPaymentDates;
        return this;
    }

}
