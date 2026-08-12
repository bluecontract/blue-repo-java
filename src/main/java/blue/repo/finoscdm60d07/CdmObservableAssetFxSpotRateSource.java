package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4Jbze8eVmcTD1NE4zxdWWA7NuWrvuqjSc5a68zCAQD7h")
public class CdmObservableAssetFxSpotRateSource {
    public static String blueId() {
        return "4Jbze8eVmcTD1NE4zxdWWA7NuWrvuqjSc5a68zCAQD7h";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FxSpotRateSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FxSpotRateSource";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFxSpotRateSource.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetInformationSource primarySource;

    private CdmObservableAssetInformationSource secondarySource;

    public CdmObservableAssetInformationSource getPrimarySource() {
        return primarySource;
    }

    public CdmObservableAssetFxSpotRateSource primarySource(CdmObservableAssetInformationSource primarySource) {
        this.primarySource = primarySource;
        return this;
    }

    public CdmObservableAssetInformationSource getSecondarySource() {
        return secondarySource;
    }

    public CdmObservableAssetFxSpotRateSource secondarySource(CdmObservableAssetInformationSource secondarySource) {
        this.secondarySource = secondarySource;
        return this;
    }

}
