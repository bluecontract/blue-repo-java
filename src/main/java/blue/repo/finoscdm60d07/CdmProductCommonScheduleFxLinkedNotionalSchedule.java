package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("C8dYtpaC5sApKFHdfeTUgJGSS65ZpXVFkVQe4mhNjoUi")
public class CdmProductCommonScheduleFxLinkedNotionalSchedule {
    public static String blueId() {
        return "C8dYtpaC5sApKFHdfeTUgJGSS65ZpXVFkVQe4mhNjoUi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/FxLinkedNotionalSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/FxLinkedNotionalSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleFxLinkedNotionalSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeBusinessCenterTime fixingTime;

    private CdmObservableAssetFxSpotRateSource fxSpotRateSource;

    private ComRosettaModelFieldWithMetaString varyingNotionalCurrency;

    private CdmBaseDatetimeRelativeDateOffset varyingNotionalFixingDates;

    private CdmBaseDatetimeRelativeDateOffset varyingNotionalInterimExchangePaymentDates;

    public CdmBaseDatetimeBusinessCenterTime getFixingTime() {
        return fixingTime;
    }

    public CdmProductCommonScheduleFxLinkedNotionalSchedule fixingTime(CdmBaseDatetimeBusinessCenterTime fixingTime) {
        this.fixingTime = fixingTime;
        return this;
    }

    public CdmObservableAssetFxSpotRateSource getFxSpotRateSource() {
        return fxSpotRateSource;
    }

    public CdmProductCommonScheduleFxLinkedNotionalSchedule fxSpotRateSource(CdmObservableAssetFxSpotRateSource fxSpotRateSource) {
        this.fxSpotRateSource = fxSpotRateSource;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getVaryingNotionalCurrency() {
        return varyingNotionalCurrency;
    }

    public CdmProductCommonScheduleFxLinkedNotionalSchedule varyingNotionalCurrency(ComRosettaModelFieldWithMetaString varyingNotionalCurrency) {
        this.varyingNotionalCurrency = varyingNotionalCurrency;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getVaryingNotionalFixingDates() {
        return varyingNotionalFixingDates;
    }

    public CdmProductCommonScheduleFxLinkedNotionalSchedule varyingNotionalFixingDates(CdmBaseDatetimeRelativeDateOffset varyingNotionalFixingDates) {
        this.varyingNotionalFixingDates = varyingNotionalFixingDates;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getVaryingNotionalInterimExchangePaymentDates() {
        return varyingNotionalInterimExchangePaymentDates;
    }

    public CdmProductCommonScheduleFxLinkedNotionalSchedule varyingNotionalInterimExchangePaymentDates(CdmBaseDatetimeRelativeDateOffset varyingNotionalInterimExchangePaymentDates) {
        this.varyingNotionalInterimExchangePaymentDates = varyingNotionalInterimExchangePaymentDates;
        return this;
    }

}
