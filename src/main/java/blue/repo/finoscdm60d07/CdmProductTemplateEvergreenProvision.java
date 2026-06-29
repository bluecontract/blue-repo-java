package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CMm4iPYPHqRhURXoiwZTTM4mvuLvUGKoBVRb6e2NhZEa")
public class CdmProductTemplateEvergreenProvision {
    public static String blueId() {
        return "CMm4iPYPHqRhURXoiwZTTM4mvuLvUGKoBVRb6e2NhZEa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/EvergreenProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/EvergreenProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateEvergreenProvision.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeAdjustableRelativeOrPeriodicDates extensionFrequency;

    private CdmObservableAssetPrice finalPeriodFeeAdjustment;

    private String noticeDeadlineDateTime;

    private CdmBaseDatetimeRelativeDateOffset noticeDeadlinePeriod;

    private CdmBaseDatetimeRelativeDateOffset noticePeriod;

    private CdmBaseStaticdataPartyPartyRole singlePartyOption;

    public CdmBaseDatetimeAdjustableRelativeOrPeriodicDates getExtensionFrequency() {
        return extensionFrequency;
    }

    public CdmProductTemplateEvergreenProvision extensionFrequency(CdmBaseDatetimeAdjustableRelativeOrPeriodicDates extensionFrequency) {
        this.extensionFrequency = extensionFrequency;
        return this;
    }

    public CdmObservableAssetPrice getFinalPeriodFeeAdjustment() {
        return finalPeriodFeeAdjustment;
    }

    public CdmProductTemplateEvergreenProvision finalPeriodFeeAdjustment(CdmObservableAssetPrice finalPeriodFeeAdjustment) {
        this.finalPeriodFeeAdjustment = finalPeriodFeeAdjustment;
        return this;
    }

    public String getNoticeDeadlineDateTime() {
        return noticeDeadlineDateTime;
    }

    public CdmProductTemplateEvergreenProvision noticeDeadlineDateTime(String noticeDeadlineDateTime) {
        this.noticeDeadlineDateTime = noticeDeadlineDateTime;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getNoticeDeadlinePeriod() {
        return noticeDeadlinePeriod;
    }

    public CdmProductTemplateEvergreenProvision noticeDeadlinePeriod(CdmBaseDatetimeRelativeDateOffset noticeDeadlinePeriod) {
        this.noticeDeadlinePeriod = noticeDeadlinePeriod;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getNoticePeriod() {
        return noticePeriod;
    }

    public CdmProductTemplateEvergreenProvision noticePeriod(CdmBaseDatetimeRelativeDateOffset noticePeriod) {
        this.noticePeriod = noticePeriod;
        return this;
    }

    public CdmBaseStaticdataPartyPartyRole getSinglePartyOption() {
        return singlePartyOption;
    }

    public CdmProductTemplateEvergreenProvision singlePartyOption(CdmBaseStaticdataPartyPartyRole singlePartyOption) {
        this.singlePartyOption = singlePartyOption;
        return this;
    }

}
