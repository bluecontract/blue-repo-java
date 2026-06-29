package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5x9dr8ixBaX8QXWdiNGeuyFn1GS9wN5xkpfrxHhKLC2y")
public class CdmObservableAssetInformationSource {
    public static String blueId() {
        return "5x9dr8ixBaX8QXWdiNGeuyFn1GS9wN5xkpfrxHhKLC2y";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/InformationSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/InformationSource";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetInformationSource.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString sourcePage;

    private String sourcePageHeading;

    private CdmObservableAssetFieldWithMetaInformationProviderEnum sourceProvider;

    public ComRosettaModelFieldWithMetaString getSourcePage() {
        return sourcePage;
    }

    public CdmObservableAssetInformationSource sourcePage(ComRosettaModelFieldWithMetaString sourcePage) {
        this.sourcePage = sourcePage;
        return this;
    }

    public String getSourcePageHeading() {
        return sourcePageHeading;
    }

    public CdmObservableAssetInformationSource sourcePageHeading(String sourcePageHeading) {
        this.sourcePageHeading = sourcePageHeading;
        return this;
    }

    public CdmObservableAssetFieldWithMetaInformationProviderEnum getSourceProvider() {
        return sourceProvider;
    }

    public CdmObservableAssetInformationSource sourceProvider(CdmObservableAssetFieldWithMetaInformationProviderEnum sourceProvider) {
        this.sourceProvider = sourceProvider;
        return this;
    }

}
