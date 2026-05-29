package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("14czdjerkJ6X1HwgQE2RFvCte476RbB2aWmpUby9D7bG")
public class CdmObservableAssetSingleValuationDate {
    public static String blueId() {
        return "14czdjerkJ6X1HwgQE2RFvCte476RbB2aWmpUby9D7bG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/SingleValuationDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/SingleValuationDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetSingleValuationDate.json";
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

    public BigInteger getBusinessDays() {
        return businessDays;
    }

    public CdmObservableAssetSingleValuationDate businessDays(BigInteger businessDays) {
        this.businessDays = businessDays;
        return this;
    }

}
