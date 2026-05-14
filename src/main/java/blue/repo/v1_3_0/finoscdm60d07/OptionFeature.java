package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DJRieNsy1BeXH1TMAPqADHNx1Xgr16C8YjSheaUxy9bJ")
public class OptionFeature {
    public static String blueId() {
        return "DJRieNsy1BeXH1TMAPqADHNx1Xgr16C8YjSheaUxy9bJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "OptionFeature";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/OptionFeature";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/OptionFeature.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private AveragingCalculation averagingFeature;

    private Barrier barrier;

    private List<FxFeature> fxFeature;

    private Knock knock;

    private PassThrough passThrough;

    private StrategyFeature strategyFeature;

    public String getNamespace() {
        return namespace;
    }

    public OptionFeature namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AveragingCalculation getAveragingFeature() {
        return averagingFeature;
    }

    public OptionFeature averagingFeature(AveragingCalculation averagingFeature) {
        this.averagingFeature = averagingFeature;
        return this;
    }

    public Barrier getBarrier() {
        return barrier;
    }

    public OptionFeature barrier(Barrier barrier) {
        this.barrier = barrier;
        return this;
    }

    public List<FxFeature> getFxFeature() {
        return fxFeature;
    }

    public OptionFeature fxFeature(List<FxFeature> fxFeature) {
        this.fxFeature = fxFeature;
        return this;
    }

    public Knock getKnock() {
        return knock;
    }

    public OptionFeature knock(Knock knock) {
        this.knock = knock;
        return this;
    }

    public PassThrough getPassThrough() {
        return passThrough;
    }

    public OptionFeature passThrough(PassThrough passThrough) {
        this.passThrough = passThrough;
        return this;
    }

    public StrategyFeature getStrategyFeature() {
        return strategyFeature;
    }

    public OptionFeature strategyFeature(StrategyFeature strategyFeature) {
        this.strategyFeature = strategyFeature;
        return this;
    }

}
