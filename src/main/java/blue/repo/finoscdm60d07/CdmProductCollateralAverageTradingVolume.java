package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6fscFVW5aHmtMRKjEQ93zMSWd6uq8CvM8i8Zkvtjbm5d")
public class CdmProductCollateralAverageTradingVolume {
    public static String blueId() {
        return "6fscFVW5aHmtMRKjEQ93zMSWd6uq8CvM8i8Zkvtjbm5d";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/AverageTradingVolume";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/AverageTradingVolume";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralAverageTradingVolume.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralAverageTradingVolumeMethodologyEnum methodology;

    private CdmBaseDatetimePeriod period;

    public CdmProductCollateralAverageTradingVolumeMethodologyEnum getMethodology() {
        return methodology;
    }

    public CdmProductCollateralAverageTradingVolume methodology(CdmProductCollateralAverageTradingVolumeMethodologyEnum methodology) {
        this.methodology = methodology;
        return this;
    }

    public CdmBaseDatetimePeriod getPeriod() {
        return period;
    }

    public CdmProductCollateralAverageTradingVolume period(CdmBaseDatetimePeriod period) {
        this.period = period;
        return this;
    }

}
