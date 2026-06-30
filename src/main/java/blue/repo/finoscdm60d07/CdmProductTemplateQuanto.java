package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Hkq47ArK1FdesDuspFiSZKL2AMTNWMyH2tNfymLamXvR")
public class CdmProductTemplateQuanto {
    public static String blueId() {
        return "Hkq47ArK1FdesDuspFiSZKL2AMTNWMyH2tNfymLamXvR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/Quanto";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/Quanto";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateQuanto.json";
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

    private List<CdmObservableAssetFxRate> fxRate;

    private CdmObservableAssetFxSpotRateSource fxSpotRateSource;

    public CdmBaseDatetimeBusinessCenterTime getFixingTime() {
        return fixingTime;
    }

    public CdmProductTemplateQuanto fixingTime(CdmBaseDatetimeBusinessCenterTime fixingTime) {
        this.fixingTime = fixingTime;
        return this;
    }

    public List<CdmObservableAssetFxRate> getFxRate() {
        return fxRate;
    }

    public CdmProductTemplateQuanto fxRate(List<CdmObservableAssetFxRate> fxRate) {
        this.fxRate = fxRate;
        return this;
    }

    public CdmObservableAssetFxSpotRateSource getFxSpotRateSource() {
        return fxSpotRateSource;
    }

    public CdmProductTemplateQuanto fxSpotRateSource(CdmObservableAssetFxSpotRateSource fxSpotRateSource) {
        this.fxSpotRateSource = fxSpotRateSource;
        return this;
    }

}
