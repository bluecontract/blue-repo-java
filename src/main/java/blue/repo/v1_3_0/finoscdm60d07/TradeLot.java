package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5jAHuCzRAocr3vVW4Vpt7nNsfGwKpkt9DogoNwMSnQ5s")
public class TradeLot {
    public static String blueId() {
        return "5jAHuCzRAocr3vVW4Vpt7nNsfGwKpkt9DogoNwMSnQ5s";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TradeLot";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TradeLot";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TradeLot.json";
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

    private List<Identifier> lotIdentifier;

    private List<PriceQuantity> priceQuantity;

    public String getNamespace() {
        return namespace;
    }

    public TradeLot namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<Identifier> getLotIdentifier() {
        return lotIdentifier;
    }

    public TradeLot lotIdentifier(List<Identifier> lotIdentifier) {
        this.lotIdentifier = lotIdentifier;
        return this;
    }

    public List<PriceQuantity> getPriceQuantity() {
        return priceQuantity;
    }

    public TradeLot priceQuantity(List<PriceQuantity> priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

}
