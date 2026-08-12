package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8TNFT6qjXdfZNgL4bunQri1ur1xvRxi49fozSfY6F39g")
public class CdmProductTemplateComposite {
    public static String blueId() {
        return "8TNFT6qjXdfZNgL4bunQri1ur1xvRxi49fozSfY6F39g";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/Composite";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/Composite";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateComposite.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableCommonDeterminationMethodEnum determinationMethod;

    private CdmBaseDatetimeBusinessCenterTime fixingTime;

    private CdmObservableAssetFxSpotRateSource fxSpotRateSource;

    private CdmBaseDatetimeRelativeDateOffset relativeDate;

    public CdmObservableCommonDeterminationMethodEnum getDeterminationMethod() {
        return determinationMethod;
    }

    public CdmProductTemplateComposite determinationMethod(CdmObservableCommonDeterminationMethodEnum determinationMethod) {
        this.determinationMethod = determinationMethod;
        return this;
    }

    public CdmBaseDatetimeBusinessCenterTime getFixingTime() {
        return fixingTime;
    }

    public CdmProductTemplateComposite fixingTime(CdmBaseDatetimeBusinessCenterTime fixingTime) {
        this.fixingTime = fixingTime;
        return this;
    }

    public CdmObservableAssetFxSpotRateSource getFxSpotRateSource() {
        return fxSpotRateSource;
    }

    public CdmProductTemplateComposite fxSpotRateSource(CdmObservableAssetFxSpotRateSource fxSpotRateSource) {
        this.fxSpotRateSource = fxSpotRateSource;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getRelativeDate() {
        return relativeDate;
    }

    public CdmProductTemplateComposite relativeDate(CdmBaseDatetimeRelativeDateOffset relativeDate) {
        this.relativeDate = relativeDate;
        return this;
    }

}
