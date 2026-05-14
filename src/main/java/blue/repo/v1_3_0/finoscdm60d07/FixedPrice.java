package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8h23GSzksysmaiRzHPHkidCFMpuPRAjBD9116rpnDZ37")
public class FixedPrice {
    public static String blueId() {
        return "8h23GSzksysmaiRzHPHkidCFMpuPRAjBD9116rpnDZ37";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FixedPrice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FixedPrice";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FixedPrice.json";
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

    public FixedPrice namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaPriceSchedule getPrice() {
        return price;
    }

    public FixedPrice price(ReferenceWithMetaPriceSchedule price) {
        this.price = price;
        return this;
    }

}
