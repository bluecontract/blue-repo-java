package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FZijMkQPrtZQaEQjCE7pXzh3u7cK2CoCy2dG3PDmNQc6")
public class CdmObservableAssetMetafieldsReferenceWithMetaPerformanceValuationDates {
    public static String blueId() {
        return "FZijMkQPrtZQaEQjCE7pXzh3u7cK2CoCy2dG3PDmNQc6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/metafields/ReferenceWithMetaPerformanceValuationDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/metafields/ReferenceWithMetaPerformanceValuationDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetmetafieldsReferenceWithMetaPerformanceValuationDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelLibMetaReference address;

    private String externalReference;

    private String globalReference;

    public ComRosettaModelLibMetaReference getAddress() {
        return address;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaPerformanceValuationDates address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaPerformanceValuationDates externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaPerformanceValuationDates globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
