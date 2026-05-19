package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4VNdE89U5ujYdMdgwiQBZsjskT58RU6TfGdLXNSYffjY")
public class AssetLeg {
    public static String blueId() {
        return "4VNdE89U5ujYdMdgwiQBZsjskT58RU6TfGdLXNSYffjY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetLeg";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetLeg";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AssetLeg.json";
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

    private DeliveryMethodEnum deliveryMethod;

    private AdjustableOrRelativeDate settlementDate;

    public String getNamespace() {
        return namespace;
    }

    public AssetLeg namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DeliveryMethodEnum getDeliveryMethod() {
        return deliveryMethod;
    }

    public AssetLeg deliveryMethod(DeliveryMethodEnum deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
        return this;
    }

    public AdjustableOrRelativeDate getSettlementDate() {
        return settlementDate;
    }

    public AssetLeg settlementDate(AdjustableOrRelativeDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

}
