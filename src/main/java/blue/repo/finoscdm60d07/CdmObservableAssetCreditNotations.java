package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("64YKsMz4yU1FijWUEv9SJYbetCXtnJHCaKj3ar3r49hi")
public class CdmObservableAssetCreditNotations {
    public static String blueId() {
        return "64YKsMz4yU1FijWUEv9SJYbetCXtnJHCaKj3ar3r49hi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/CreditNotations";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/CreditNotations";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetCreditNotations.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetCreditNotation creditNotation;

    private CdmObservableAssetMultipleCreditNotations creditNotations;

    public CdmObservableAssetCreditNotation getCreditNotation() {
        return creditNotation;
    }

    public CdmObservableAssetCreditNotations creditNotation(CdmObservableAssetCreditNotation creditNotation) {
        this.creditNotation = creditNotation;
        return this;
    }

    public CdmObservableAssetMultipleCreditNotations getCreditNotations() {
        return creditNotations;
    }

    public CdmObservableAssetCreditNotations creditNotations(CdmObservableAssetMultipleCreditNotations creditNotations) {
        this.creditNotations = creditNotations;
        return this;
    }

}
