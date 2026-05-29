package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3cBd99L7MyBiag7p8zzhjJ2u52Nh4xxGjoAn8dH7uy8p")
public class CdmObservableAssetValuationDates {
    public static String blueId() {
        return "3cBd99L7MyBiag7p8zzhjJ2u52Nh4xxGjoAn8dH7uy8p";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/ValuationDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/ValuationDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetValuationDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetPerformanceValuationDates finalValuationDate;

    private CdmObservableAssetPerformanceValuationDates initialValuationDate;

    private CdmObservableAssetPerformanceValuationDates interimValuationDate;

    public CdmObservableAssetPerformanceValuationDates getFinalValuationDate() {
        return finalValuationDate;
    }

    public CdmObservableAssetValuationDates finalValuationDate(CdmObservableAssetPerformanceValuationDates finalValuationDate) {
        this.finalValuationDate = finalValuationDate;
        return this;
    }

    public CdmObservableAssetPerformanceValuationDates getInitialValuationDate() {
        return initialValuationDate;
    }

    public CdmObservableAssetValuationDates initialValuationDate(CdmObservableAssetPerformanceValuationDates initialValuationDate) {
        this.initialValuationDate = initialValuationDate;
        return this;
    }

    public CdmObservableAssetPerformanceValuationDates getInterimValuationDate() {
        return interimValuationDate;
    }

    public CdmObservableAssetValuationDates interimValuationDate(CdmObservableAssetPerformanceValuationDates interimValuationDate) {
        this.interimValuationDate = interimValuationDate;
        return this;
    }

}
