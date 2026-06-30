package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ec6MmK2TGnYoMytTLHEDcnQGwA2y427JhgfBex5P61Ax")
public class CdmProductCommonSettlementValuationDate {
    public static String blueId() {
        return "Ec6MmK2TGnYoMytTLHEDcnQGwA2y427JhgfBex5P61Ax";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/ValuationDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/ValuationDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementValuationDate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonSettlementFxFixingDate fxFixingDate;

    private CdmBaseDatetimeAdjustableDates fxFixingSchedule;

    private CdmObservableAssetMultipleValuationDates multipleValuationDates;

    private CdmObservableAssetSingleValuationDate singleValuationDate;

    private CdmBaseDatetimeRelativeDateOffset valuationDate;

    public CdmProductCommonSettlementFxFixingDate getFxFixingDate() {
        return fxFixingDate;
    }

    public CdmProductCommonSettlementValuationDate fxFixingDate(CdmProductCommonSettlementFxFixingDate fxFixingDate) {
        this.fxFixingDate = fxFixingDate;
        return this;
    }

    public CdmBaseDatetimeAdjustableDates getFxFixingSchedule() {
        return fxFixingSchedule;
    }

    public CdmProductCommonSettlementValuationDate fxFixingSchedule(CdmBaseDatetimeAdjustableDates fxFixingSchedule) {
        this.fxFixingSchedule = fxFixingSchedule;
        return this;
    }

    public CdmObservableAssetMultipleValuationDates getMultipleValuationDates() {
        return multipleValuationDates;
    }

    public CdmProductCommonSettlementValuationDate multipleValuationDates(CdmObservableAssetMultipleValuationDates multipleValuationDates) {
        this.multipleValuationDates = multipleValuationDates;
        return this;
    }

    public CdmObservableAssetSingleValuationDate getSingleValuationDate() {
        return singleValuationDate;
    }

    public CdmProductCommonSettlementValuationDate singleValuationDate(CdmObservableAssetSingleValuationDate singleValuationDate) {
        this.singleValuationDate = singleValuationDate;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getValuationDate() {
        return valuationDate;
    }

    public CdmProductCommonSettlementValuationDate valuationDate(CdmBaseDatetimeRelativeDateOffset valuationDate) {
        this.valuationDate = valuationDate;
        return this;
    }

}
