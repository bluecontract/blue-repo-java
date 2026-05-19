package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4tU5cfKeZno5jB7UN5smWaAt85EutMjDqZuWCsFcxUmX")
public class CollateralBalance {
    public static String blueId() {
        return "4tU5cfKeZno5jB7UN5smWaAt85EutMjDqZuWCsFcxUmX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralBalance";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralBalance";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralBalance.json";
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

    private Money amountBaseCurrency;

    private CollateralStatusEnum collateralBalanceStatus;

    private HaircutIndicatorEnum haircutIndicator;

    private PartyReferencePayerReceiver payerReceiver;

    public String getNamespace() {
        return namespace;
    }

    public CollateralBalance namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getAmountBaseCurrency() {
        return amountBaseCurrency;
    }

    public CollateralBalance amountBaseCurrency(Money amountBaseCurrency) {
        this.amountBaseCurrency = amountBaseCurrency;
        return this;
    }

    public CollateralStatusEnum getCollateralBalanceStatus() {
        return collateralBalanceStatus;
    }

    public CollateralBalance collateralBalanceStatus(CollateralStatusEnum collateralBalanceStatus) {
        this.collateralBalanceStatus = collateralBalanceStatus;
        return this;
    }

    public HaircutIndicatorEnum getHaircutIndicator() {
        return haircutIndicator;
    }

    public CollateralBalance haircutIndicator(HaircutIndicatorEnum haircutIndicator) {
        this.haircutIndicator = haircutIndicator;
        return this;
    }

    public PartyReferencePayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CollateralBalance payerReceiver(PartyReferencePayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

}
