package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Gwhruyi2cqX29mThcmD9cTU1veSQiZjYUi5hvnNqeVpY")
public class ValuationDate {
    public static String blueId() {
        return "Gwhruyi2cqX29mThcmD9cTU1veSQiZjYUi5hvnNqeVpY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ValuationDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ValuationDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ValuationDate.json";
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

    private FxFixingDate fxFixingDate;

    private AdjustableDates fxFixingSchedule;

    private MultipleValuationDates multipleValuationDates;

    private SingleValuationDate singleValuationDate;

    private RelativeDateOffset valuationDate;

    public String getNamespace() {
        return namespace;
    }

    public ValuationDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FxFixingDate getFxFixingDate() {
        return fxFixingDate;
    }

    public ValuationDate fxFixingDate(FxFixingDate fxFixingDate) {
        this.fxFixingDate = fxFixingDate;
        return this;
    }

    public AdjustableDates getFxFixingSchedule() {
        return fxFixingSchedule;
    }

    public ValuationDate fxFixingSchedule(AdjustableDates fxFixingSchedule) {
        this.fxFixingSchedule = fxFixingSchedule;
        return this;
    }

    public MultipleValuationDates getMultipleValuationDates() {
        return multipleValuationDates;
    }

    public ValuationDate multipleValuationDates(MultipleValuationDates multipleValuationDates) {
        this.multipleValuationDates = multipleValuationDates;
        return this;
    }

    public SingleValuationDate getSingleValuationDate() {
        return singleValuationDate;
    }

    public ValuationDate singleValuationDate(SingleValuationDate singleValuationDate) {
        this.singleValuationDate = singleValuationDate;
        return this;
    }

    public RelativeDateOffset getValuationDate() {
        return valuationDate;
    }

    public ValuationDate valuationDate(RelativeDateOffset valuationDate) {
        this.valuationDate = valuationDate;
        return this;
    }

}
