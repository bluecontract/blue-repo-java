package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8RaYn7dAapW3dFmuG6AwXr5mpv24qXUMLg5Y8yn3ULA4")
public class CdmObservableAssetFxInformationSource {
    public static String blueId() {
        return "8RaYn7dAapW3dFmuG6AwXr5mpv24qXUMLg5Y8yn3ULA4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/FxInformationSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/FxInformationSource";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetFxInformationSource.json";
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

    private ComRosettaModelFieldWithMetaString sourcePage;

    private String sourcePageHeading;

    private CdmObservableAssetFieldWithMetaInformationProviderEnum sourceProvider;

    public CdmBaseDatetimeBusinessCenterTime getFixingTime() {
        return fixingTime;
    }

    public CdmObservableAssetFxInformationSource fixingTime(CdmBaseDatetimeBusinessCenterTime fixingTime) {
        this.fixingTime = fixingTime;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getSourcePage() {
        return sourcePage;
    }

    public CdmObservableAssetFxInformationSource sourcePage(ComRosettaModelFieldWithMetaString sourcePage) {
        this.sourcePage = sourcePage;
        return this;
    }

    public String getSourcePageHeading() {
        return sourcePageHeading;
    }

    public CdmObservableAssetFxInformationSource sourcePageHeading(String sourcePageHeading) {
        this.sourcePageHeading = sourcePageHeading;
        return this;
    }

    public CdmObservableAssetFieldWithMetaInformationProviderEnum getSourceProvider() {
        return sourceProvider;
    }

    public CdmObservableAssetFxInformationSource sourceProvider(CdmObservableAssetFieldWithMetaInformationProviderEnum sourceProvider) {
        this.sourceProvider = sourceProvider;
        return this;
    }

}
