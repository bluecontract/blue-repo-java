package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("J4wqPRqUgot11KtycNoGqM9u43KZrNSvWHAbzBSR4WNS")
public class CdmProductCommonScheduleAmountSchedule {
    public static String blueId() {
        return "J4wqPRqUgot11KtycNoGqM9u43KZrNSvWHAbzBSR4WNS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/AmountSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/AmountSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleAmountSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<ComRosettaModelFieldWithMetaString> currency;

    private List<CdmBaseMathDatedValue> datedValue;

    private Double val;

    public List<ComRosettaModelFieldWithMetaString> getCurrency() {
        return currency;
    }

    public CdmProductCommonScheduleAmountSchedule currency(List<ComRosettaModelFieldWithMetaString> currency) {
        this.currency = currency;
        return this;
    }

    public List<CdmBaseMathDatedValue> getDatedValue() {
        return datedValue;
    }

    public CdmProductCommonScheduleAmountSchedule datedValue(List<CdmBaseMathDatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public CdmProductCommonScheduleAmountSchedule val(Double val) {
        this.val = val;
        return this;
    }

}
