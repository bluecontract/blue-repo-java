package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("FNvJ5Bykw9Ak2JRJJJ1nizpUFbufUY7ciCjGoMLUAQzA")
public class CdmObservableAssetCalculatedrateOffsetCalculation {
    public static String blueId() {
        return "FNvJ5Bykw9Ak2JRJJJ1nizpUFbufUY7ciCjGoMLUAQzA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/calculatedrate/OffsetCalculation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/calculatedrate/OffsetCalculation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetcalculatedrateOffsetCalculation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger offsetDays;

    public BigInteger getOffsetDays() {
        return offsetDays;
    }

    public CdmObservableAssetCalculatedrateOffsetCalculation offsetDays(BigInteger offsetDays) {
        this.offsetDays = offsetDays;
        return this;
    }

}
