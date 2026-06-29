package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Amvx9G3h2wHURbQkfGuuEwHYch5CWjYiD1ooToEb9FAn")
public class CdmProductCommonScheduleDateRelativeToValuationDates {
    public static String blueId() {
        return "Amvx9G3h2wHURbQkfGuuEwHYch5CWjYiD1ooToEb9FAn";
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
