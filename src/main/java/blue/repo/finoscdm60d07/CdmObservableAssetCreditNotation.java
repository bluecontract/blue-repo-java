package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6DvMxWSu8NPPjxcsnCkgPnNoAfxF9WCaA14A1Gd6fLG6")
public class CdmObservableAssetCreditNotation {
    public static String blueId() {
        return "6DvMxWSu8NPPjxcsnCkgPnNoAfxF9WCaA14A1Gd6fLG6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/CreditNotation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/CreditNotation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetCreditNotation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetCreditRatingAgencyEnum agency;

    private CdmObservableAssetCreditRatingCreditWatchEnum creditWatch;

    private CdmObservableAssetCreditRatingDebt debt;

    private ComRosettaModelFieldWithMetaString notation;

    private CdmObservableAssetCreditRatingOutlookEnum outlook;

    private ComRosettaModelFieldWithMetaString scale;

    public CdmObservableAssetCreditRatingAgencyEnum getAgency() {
        return agency;
    }

    public CdmObservableAssetCreditNotation agency(CdmObservableAssetCreditRatingAgencyEnum agency) {
        this.agency = agency;
        return this;
    }

    public CdmObservableAssetCreditRatingCreditWatchEnum getCreditWatch() {
        return creditWatch;
    }

    public CdmObservableAssetCreditNotation creditWatch(CdmObservableAssetCreditRatingCreditWatchEnum creditWatch) {
        this.creditWatch = creditWatch;
        return this;
    }

    public CdmObservableAssetCreditRatingDebt getDebt() {
        return debt;
    }

    public CdmObservableAssetCreditNotation debt(CdmObservableAssetCreditRatingDebt debt) {
        this.debt = debt;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getNotation() {
        return notation;
    }

    public CdmObservableAssetCreditNotation notation(ComRosettaModelFieldWithMetaString notation) {
        this.notation = notation;
        return this;
    }

    public CdmObservableAssetCreditRatingOutlookEnum getOutlook() {
        return outlook;
    }

    public CdmObservableAssetCreditNotation outlook(CdmObservableAssetCreditRatingOutlookEnum outlook) {
        this.outlook = outlook;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getScale() {
        return scale;
    }

    public CdmObservableAssetCreditNotation scale(ComRosettaModelFieldWithMetaString scale) {
        this.scale = scale;
        return this;
    }

}
