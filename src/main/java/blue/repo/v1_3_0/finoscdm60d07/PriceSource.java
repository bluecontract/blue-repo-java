package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2WgYoMsUjW6UXfJ4pAW4yvMgaRkqytZWhWGQZzbQTMJr")
public class PriceSource {
    public static String blueId() {
        return "2WgYoMsUjW6UXfJ4pAW4yvMgaRkqytZWhWGQZzbQTMJr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PriceSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PriceSource";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PriceSource.json";
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

    private FieldWithMetaString pricePublisher;

    private String priceSourceHeading;

    private String priceSourceLocation;

    private String priceSourceTime;

    public String getNamespace() {
        return namespace;
    }

    public PriceSource namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getPricePublisher() {
        return pricePublisher;
    }

    public PriceSource pricePublisher(FieldWithMetaString pricePublisher) {
        this.pricePublisher = pricePublisher;
        return this;
    }

    public String getPriceSourceHeading() {
        return priceSourceHeading;
    }

    public PriceSource priceSourceHeading(String priceSourceHeading) {
        this.priceSourceHeading = priceSourceHeading;
        return this;
    }

    public String getPriceSourceLocation() {
        return priceSourceLocation;
    }

    public PriceSource priceSourceLocation(String priceSourceLocation) {
        this.priceSourceLocation = priceSourceLocation;
        return this;
    }

    public String getPriceSourceTime() {
        return priceSourceTime;
    }

    public PriceSource priceSourceTime(String priceSourceTime) {
        this.priceSourceTime = priceSourceTime;
        return this;
    }

}
