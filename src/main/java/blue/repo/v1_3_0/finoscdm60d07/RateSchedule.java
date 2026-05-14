package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("99gatGS7rTE7ietGQC63KTgMHGR7ZEvwiMC26XTy9jqC")
public class RateSchedule {
    public static String blueId() {
        return "99gatGS7rTE7ietGQC63KTgMHGR7ZEvwiMC26XTy9jqC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RateSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RateSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RateSchedule.json";
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

    private ReferenceWithMetaPriceSchedule price;

    public String getNamespace() {
        return namespace;
    }

    public RateSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaPriceSchedule getPrice() {
        return price;
    }

    public RateSchedule price(ReferenceWithMetaPriceSchedule price) {
        this.price = price;
        return this;
    }

}
