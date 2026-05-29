package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("31wmtJAeXRd4r6bP7fDwukh6t2izGMUD9vBPNfD6hVrt")
public class CdmObservableAssetMultipleCreditNotations {
    public static String blueId() {
        return "31wmtJAeXRd4r6bP7fDwukh6t2izGMUD9vBPNfD6hVrt";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/MultipleCreditNotations";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/MultipleCreditNotations";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetMultipleCreditNotations.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathQuantifierEnum condition;

    private List<CdmObservableAssetFieldWithMetaCreditNotation> creditNotation;

    private CdmObservableAssetCreditNotationMismatchResolutionEnum mismatchResolution;

    private CdmObservableAssetCreditRatingAgencyEnum referenceAgency;

    public CdmBaseMathQuantifierEnum getCondition() {
        return condition;
    }

    public CdmObservableAssetMultipleCreditNotations condition(CdmBaseMathQuantifierEnum condition) {
        this.condition = condition;
        return this;
    }

    public List<CdmObservableAssetFieldWithMetaCreditNotation> getCreditNotation() {
        return creditNotation;
    }

    public CdmObservableAssetMultipleCreditNotations creditNotation(List<CdmObservableAssetFieldWithMetaCreditNotation> creditNotation) {
        this.creditNotation = creditNotation;
        return this;
    }

    public CdmObservableAssetCreditNotationMismatchResolutionEnum getMismatchResolution() {
        return mismatchResolution;
    }

    public CdmObservableAssetMultipleCreditNotations mismatchResolution(CdmObservableAssetCreditNotationMismatchResolutionEnum mismatchResolution) {
        this.mismatchResolution = mismatchResolution;
        return this;
    }

    public CdmObservableAssetCreditRatingAgencyEnum getReferenceAgency() {
        return referenceAgency;
    }

    public CdmObservableAssetMultipleCreditNotations referenceAgency(CdmObservableAssetCreditRatingAgencyEnum referenceAgency) {
        this.referenceAgency = referenceAgency;
        return this;
    }

}
