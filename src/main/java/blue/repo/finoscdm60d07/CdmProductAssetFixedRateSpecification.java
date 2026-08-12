package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EGYqbJxyubwqpMiSD4GyaqjF8JLLc2R5X7drZoPxyc1k")
public class CdmProductAssetFixedRateSpecification {
    public static String blueId() {
        return "EGYqbJxyubwqpMiSD4GyaqjF8JLLc2R5X7drZoPxyc1k";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FixedRateSpecification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FixedRateSpecification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFixedRateSpecification.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonScheduleRateSchedule rateSchedule;

    public CdmProductCommonScheduleRateSchedule getRateSchedule() {
        return rateSchedule;
    }

    public CdmProductAssetFixedRateSpecification rateSchedule(CdmProductCommonScheduleRateSchedule rateSchedule) {
        this.rateSchedule = rateSchedule;
        return this;
    }

}
