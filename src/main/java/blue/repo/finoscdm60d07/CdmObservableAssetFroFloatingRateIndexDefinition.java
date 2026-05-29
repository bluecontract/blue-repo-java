package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2PP1toZ7Db5His7rcYPDRBBLZzRFb5BuSaYCk4vYc1mu")
public class CdmObservableAssetFroFloatingRateIndexDefinition {
    public static String blueId() {
        return "2PP1toZ7Db5His7rcYPDRBBLZzRFb5BuSaYCk4vYc1mu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/fro/FloatingRateIndexDefinition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/fro/FloatingRateIndexDefinition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetfroFloatingRateIndexDefinition.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetFroFloatingRateIndexCalculationDefaults calculationDefaults;

    private CdmObservableAssetFroFloatingRateIndexIdentification fro;

    public CdmObservableAssetFroFloatingRateIndexCalculationDefaults getCalculationDefaults() {
        return calculationDefaults;
    }

    public CdmObservableAssetFroFloatingRateIndexDefinition calculationDefaults(CdmObservableAssetFroFloatingRateIndexCalculationDefaults calculationDefaults) {
        this.calculationDefaults = calculationDefaults;
        return this;
    }

    public CdmObservableAssetFroFloatingRateIndexIdentification getFro() {
        return fro;
    }

    public CdmObservableAssetFroFloatingRateIndexDefinition fro(CdmObservableAssetFroFloatingRateIndexIdentification fro) {
        this.fro = fro;
        return this;
    }

}
