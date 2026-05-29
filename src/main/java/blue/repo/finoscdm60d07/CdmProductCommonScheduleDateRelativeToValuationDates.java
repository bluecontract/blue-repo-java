package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8zGdKv3MPkKYSyGusHre3ynLVYDgNskgxifH6DUD34C5")
public class CdmProductCommonScheduleDateRelativeToValuationDates {
    public static String blueId() {
        return "8zGdKv3MPkKYSyGusHre3ynLVYDgNskgxifH6DUD34C5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/DateRelativeToValuationDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/DateRelativeToValuationDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleDateRelativeToValuationDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmObservableAssetMetafieldsReferenceWithMetaPerformanceValuationDates> valuationDatesReference;

    public List<CdmObservableAssetMetafieldsReferenceWithMetaPerformanceValuationDates> getValuationDatesReference() {
        return valuationDatesReference;
    }

    public CdmProductCommonScheduleDateRelativeToValuationDates valuationDatesReference(List<CdmObservableAssetMetafieldsReferenceWithMetaPerformanceValuationDates> valuationDatesReference) {
        this.valuationDatesReference = valuationDatesReference;
        return this;
    }

}
