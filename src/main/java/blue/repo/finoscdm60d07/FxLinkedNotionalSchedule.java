package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GxJKrxejsuBdnc5aEDjthazQ2NpDJAGjKFEBKF1EFJ4T")
public class FxLinkedNotionalSchedule {
    public static String blueId() {
        return "GxJKrxejsuBdnc5aEDjthazQ2NpDJAGjKFEBKF1EFJ4T";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FxLinkedNotionalSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FxLinkedNotionalSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FxLinkedNotionalSchedule.json";
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

    private BusinessCenterTime fixingTime;

    private FxSpotRateSource fxSpotRateSource;

    private FieldWithMetaString varyingNotionalCurrency;

    private RelativeDateOffset varyingNotionalFixingDates;

    private RelativeDateOffset varyingNotionalInterimExchangePaymentDates;

    public String getNamespace() {
        return namespace;
    }

    public FxLinkedNotionalSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessCenterTime getFixingTime() {
        return fixingTime;
    }

    public FxLinkedNotionalSchedule fixingTime(BusinessCenterTime fixingTime) {
        this.fixingTime = fixingTime;
        return this;
    }

    public FxSpotRateSource getFxSpotRateSource() {
        return fxSpotRateSource;
    }

    public FxLinkedNotionalSchedule fxSpotRateSource(FxSpotRateSource fxSpotRateSource) {
        this.fxSpotRateSource = fxSpotRateSource;
        return this;
    }

    public FieldWithMetaString getVaryingNotionalCurrency() {
        return varyingNotionalCurrency;
    }

    public FxLinkedNotionalSchedule varyingNotionalCurrency(FieldWithMetaString varyingNotionalCurrency) {
        this.varyingNotionalCurrency = varyingNotionalCurrency;
        return this;
    }

    public RelativeDateOffset getVaryingNotionalFixingDates() {
        return varyingNotionalFixingDates;
    }

    public FxLinkedNotionalSchedule varyingNotionalFixingDates(RelativeDateOffset varyingNotionalFixingDates) {
        this.varyingNotionalFixingDates = varyingNotionalFixingDates;
        return this;
    }

    public RelativeDateOffset getVaryingNotionalInterimExchangePaymentDates() {
        return varyingNotionalInterimExchangePaymentDates;
    }

    public FxLinkedNotionalSchedule varyingNotionalInterimExchangePaymentDates(RelativeDateOffset varyingNotionalInterimExchangePaymentDates) {
        this.varyingNotionalInterimExchangePaymentDates = varyingNotionalInterimExchangePaymentDates;
        return this;
    }

}
