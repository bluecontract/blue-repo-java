package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4NGaBXKBS6QDTeN9ZdQEgWHvYg1Kd3Dqr86Xs9BpVh7A")
public class CdmBaseMathMoneyRange {
    public static String blueId() {
        return "4NGaBXKBS6QDTeN9ZdQEgWHvYg1Kd3Dqr86Xs9BpVh7A";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/MoneyRange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/MoneyRange";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathMoneyRange.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathMoneyBound lowerBound;

    private CdmBaseMathMoneyBound upperBound;

    public CdmBaseMathMoneyBound getLowerBound() {
        return lowerBound;
    }

    public CdmBaseMathMoneyRange lowerBound(CdmBaseMathMoneyBound lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    public CdmBaseMathMoneyBound getUpperBound() {
        return upperBound;
    }

    public CdmBaseMathMoneyRange upperBound(CdmBaseMathMoneyBound upperBound) {
        this.upperBound = upperBound;
        return this;
    }

}
