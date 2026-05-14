package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("4TkQqBVPMgEdzPok16vjVk4mkCqDZppDE5LtZpJeHL3m")
public class MultipleValuationDates {
    public static String blueId() {
        return "4TkQqBVPMgEdzPok16vjVk4mkCqDZppDE5LtZpJeHL3m";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MultipleValuationDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MultipleValuationDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MultipleValuationDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private BigInteger businessDays;

    private BigInteger businessDaysThereafter;

    private BigInteger numberValuationDates;

    public String getNamespace() {
        return namespace;
    }

    public MultipleValuationDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getBusinessDays() {
        return businessDays;
    }

    public MultipleValuationDates businessDays(BigInteger businessDays) {
        this.businessDays = businessDays;
        return this;
    }

    public BigInteger getBusinessDaysThereafter() {
        return businessDaysThereafter;
    }

    public MultipleValuationDates businessDaysThereafter(BigInteger businessDaysThereafter) {
        this.businessDaysThereafter = businessDaysThereafter;
        return this;
    }

    public BigInteger getNumberValuationDates() {
        return numberValuationDates;
    }

    public MultipleValuationDates numberValuationDates(BigInteger numberValuationDates) {
        this.numberValuationDates = numberValuationDates;
        return this;
    }

}
