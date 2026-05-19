package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Cki4jRRxmsxusVhjTYpdh1UBKVNzfPinPNH5RH76PhfA")
public class EvergreenProvision {
    public static String blueId() {
        return "Cki4jRRxmsxusVhjTYpdh1UBKVNzfPinPNH5RH76PhfA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EvergreenProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EvergreenProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/EvergreenProvision.json";
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

    private AdjustableRelativeOrPeriodicDates extensionFrequency;

    private Price finalPeriodFeeAdjustment;

    private String noticeDeadlineDateTime;

    private RelativeDateOffset noticeDeadlinePeriod;

    private RelativeDateOffset noticePeriod;

    private PartyRole singlePartyOption;

    public String getNamespace() {
        return namespace;
    }

    public EvergreenProvision namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableRelativeOrPeriodicDates getExtensionFrequency() {
        return extensionFrequency;
    }

    public EvergreenProvision extensionFrequency(AdjustableRelativeOrPeriodicDates extensionFrequency) {
        this.extensionFrequency = extensionFrequency;
        return this;
    }

    public Price getFinalPeriodFeeAdjustment() {
        return finalPeriodFeeAdjustment;
    }

    public EvergreenProvision finalPeriodFeeAdjustment(Price finalPeriodFeeAdjustment) {
        this.finalPeriodFeeAdjustment = finalPeriodFeeAdjustment;
        return this;
    }

    public String getNoticeDeadlineDateTime() {
        return noticeDeadlineDateTime;
    }

    public EvergreenProvision noticeDeadlineDateTime(String noticeDeadlineDateTime) {
        this.noticeDeadlineDateTime = noticeDeadlineDateTime;
        return this;
    }

    public RelativeDateOffset getNoticeDeadlinePeriod() {
        return noticeDeadlinePeriod;
    }

    public EvergreenProvision noticeDeadlinePeriod(RelativeDateOffset noticeDeadlinePeriod) {
        this.noticeDeadlinePeriod = noticeDeadlinePeriod;
        return this;
    }

    public RelativeDateOffset getNoticePeriod() {
        return noticePeriod;
    }

    public EvergreenProvision noticePeriod(RelativeDateOffset noticePeriod) {
        this.noticePeriod = noticePeriod;
        return this;
    }

    public PartyRole getSinglePartyOption() {
        return singlePartyOption;
    }

    public EvergreenProvision singlePartyOption(PartyRole singlePartyOption) {
        this.singlePartyOption = singlePartyOption;
        return this;
    }

}
