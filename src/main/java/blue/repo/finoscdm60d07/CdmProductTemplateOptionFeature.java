package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8NbBnoWUBC2RHr2XX7MrdT2qU4Nm4L5ZU4GHjeCXevBm")
public class CdmProductTemplateOptionFeature {
    public static String blueId() {
        return "8NbBnoWUBC2RHr2XX7MrdT2qU4Nm4L5ZU4GHjeCXevBm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/OptionFeature";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/OptionFeature";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateOptionFeature.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateAveragingCalculation averagingFeature;

    private CdmProductTemplateBarrier barrier;

    private List<CdmProductTemplateFxFeature> fxFeature;

    private CdmProductTemplateKnock knock;

    private CdmProductTemplatePassThrough passThrough;

    private CdmProductTemplateStrategyFeature strategyFeature;

    public CdmProductTemplateAveragingCalculation getAveragingFeature() {
        return averagingFeature;
    }

    public CdmProductTemplateOptionFeature averagingFeature(CdmProductTemplateAveragingCalculation averagingFeature) {
        this.averagingFeature = averagingFeature;
        return this;
    }

    public CdmProductTemplateBarrier getBarrier() {
        return barrier;
    }

    public CdmProductTemplateOptionFeature barrier(CdmProductTemplateBarrier barrier) {
        this.barrier = barrier;
        return this;
    }

    public List<CdmProductTemplateFxFeature> getFxFeature() {
        return fxFeature;
    }

    public CdmProductTemplateOptionFeature fxFeature(List<CdmProductTemplateFxFeature> fxFeature) {
        this.fxFeature = fxFeature;
        return this;
    }

    public CdmProductTemplateKnock getKnock() {
        return knock;
    }

    public CdmProductTemplateOptionFeature knock(CdmProductTemplateKnock knock) {
        this.knock = knock;
        return this;
    }

    public CdmProductTemplatePassThrough getPassThrough() {
        return passThrough;
    }

    public CdmProductTemplateOptionFeature passThrough(CdmProductTemplatePassThrough passThrough) {
        this.passThrough = passThrough;
        return this;
    }

    public CdmProductTemplateStrategyFeature getStrategyFeature() {
        return strategyFeature;
    }

    public CdmProductTemplateOptionFeature strategyFeature(CdmProductTemplateStrategyFeature strategyFeature) {
        this.strategyFeature = strategyFeature;
        return this;
    }

}
