package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FXnC4V44iMPEEzRCuT7HaZPV6oQyrxYFSjNtrrkjZNFw")
public class CdmObservableAssetCreditRatingDebt {
    public static String blueId() {
        return "FXnC4V44iMPEEzRCuT7HaZPV6oQyrxYFSjNtrrkjZNFw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/CreditRatingDebt";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/CreditRatingDebt";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetCreditRatingDebt.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString debtType;

    private CdmObservableAssetMultipleDebtTypes debtTypes;

    public ComRosettaModelFieldWithMetaString getDebtType() {
        return debtType;
    }

    public CdmObservableAssetCreditRatingDebt debtType(ComRosettaModelFieldWithMetaString debtType) {
        this.debtType = debtType;
        return this;
    }

    public CdmObservableAssetMultipleDebtTypes getDebtTypes() {
        return debtTypes;
    }

    public CdmObservableAssetCreditRatingDebt debtTypes(CdmObservableAssetMultipleDebtTypes debtTypes) {
        this.debtTypes = debtTypes;
        return this;
    }

}
