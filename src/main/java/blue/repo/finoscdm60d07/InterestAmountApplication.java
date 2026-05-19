package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4CV3rgHHruHMxUMr3yM2HhsxrTUUKeivJu1CB7RdM71t")
public class InterestAmountApplication {
    public static String blueId() {
        return "4CV3rgHHruHMxUMr3yM2HhsxrTUUKeivJu1CB7RdM71t";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InterestAmountApplication";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InterestAmountApplication";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/InterestAmountApplication.json";
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

    private DeliveryAmount deliveryAmount;

    private ReturnAmount returnAmount;

    public String getNamespace() {
        return namespace;
    }

    public InterestAmountApplication namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DeliveryAmount getDeliveryAmount() {
        return deliveryAmount;
    }

    public InterestAmountApplication deliveryAmount(DeliveryAmount deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
        return this;
    }

    public ReturnAmount getReturnAmount() {
        return returnAmount;
    }

    public InterestAmountApplication returnAmount(ReturnAmount returnAmount) {
        this.returnAmount = returnAmount;
        return this;
    }

}
