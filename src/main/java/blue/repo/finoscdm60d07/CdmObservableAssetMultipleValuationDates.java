package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("HyKWLzqSMdXydTHsC9zJwdiVi6KcdZVngY9WJ5PV3xMR")
public class CdmObservableAssetMultipleValuationDates {
    public static String blueId() {
        return "HyKWLzqSMdXydTHsC9zJwdiVi6KcdZVngY9WJ5PV3xMR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/MultipleValuationDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/MultipleValuationDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetMultipleValuationDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger businessDays;

    private BigInteger businessDaysThereafter;

    private BigInteger numberValuationDates;

    public BigInteger getBusinessDays() {
        return businessDays;
    }

    public CdmObservableAssetMultipleValuationDates businessDays(BigInteger businessDays) {
        this.businessDays = businessDays;
        return this;
    }

    public BigInteger getBusinessDaysThereafter() {
        return businessDaysThereafter;
    }

    public CdmObservableAssetMultipleValuationDates businessDaysThereafter(BigInteger businessDaysThereafter) {
        this.businessDaysThereafter = businessDaysThereafter;
        return this;
    }

    public BigInteger getNumberValuationDates() {
        return numberValuationDates;
    }

    public CdmObservableAssetMultipleValuationDates numberValuationDates(BigInteger numberValuationDates) {
        this.numberValuationDates = numberValuationDates;
        return this;
    }

}
