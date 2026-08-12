package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("BbM2nqKiVihnZtKM1sJKM3HK23io3UM784GeaXFmEKiY")
public class CdmObservableAssetValuationPostponement {
    public static String blueId() {
        return "BbM2nqKiVihnZtKM1sJKM3HK23io3UM784GeaXFmEKiY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/ValuationPostponement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/ValuationPostponement";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetValuationPostponement.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger maximumDaysOfPostponement;

    public BigInteger getMaximumDaysOfPostponement() {
        return maximumDaysOfPostponement;
    }

    public CdmObservableAssetValuationPostponement maximumDaysOfPostponement(BigInteger maximumDaysOfPostponement) {
        this.maximumDaysOfPostponement = maximumDaysOfPostponement;
        return this;
    }

}
