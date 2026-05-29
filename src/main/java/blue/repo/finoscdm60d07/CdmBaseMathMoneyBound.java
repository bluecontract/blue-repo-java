package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7fjmvKiqx1TwtYgy86sfyPzzakM8kb7mJyqivhWxsLDv")
public class CdmBaseMathMoneyBound {
    public static String blueId() {
        return "7fjmvKiqx1TwtYgy86sfyPzzakM8kb7mJyqivhWxsLDv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/MoneyBound";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/MoneyBound";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathMoneyBound.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean inclusive;

    private CdmObservableAssetMoney money;

    public Boolean getInclusive() {
        return inclusive;
    }

    public CdmBaseMathMoneyBound inclusive(Boolean inclusive) {
        this.inclusive = inclusive;
        return this;
    }

    public CdmObservableAssetMoney getMoney() {
        return money;
    }

    public CdmBaseMathMoneyBound money(CdmObservableAssetMoney money) {
        this.money = money;
        return this;
    }

}
