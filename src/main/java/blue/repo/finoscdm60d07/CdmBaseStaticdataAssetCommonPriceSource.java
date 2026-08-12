package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6ndw1qraVosKGtrHUyCSNZ4yHpydKg4aKVNdbEEZfoMd")
public class CdmBaseStaticdataAssetCommonPriceSource {
    public static String blueId() {
        return "6ndw1qraVosKGtrHUyCSNZ4yHpydKg4aKVNdbEEZfoMd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/PriceSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/PriceSource";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonPriceSource.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString pricePublisher;

    private String priceSourceHeading;

    private String priceSourceLocation;

    private String priceSourceTime;

    public ComRosettaModelFieldWithMetaString getPricePublisher() {
        return pricePublisher;
    }

    public CdmBaseStaticdataAssetCommonPriceSource pricePublisher(ComRosettaModelFieldWithMetaString pricePublisher) {
        this.pricePublisher = pricePublisher;
        return this;
    }

    public String getPriceSourceHeading() {
        return priceSourceHeading;
    }

    public CdmBaseStaticdataAssetCommonPriceSource priceSourceHeading(String priceSourceHeading) {
        this.priceSourceHeading = priceSourceHeading;
        return this;
    }

    public String getPriceSourceLocation() {
        return priceSourceLocation;
    }

    public CdmBaseStaticdataAssetCommonPriceSource priceSourceLocation(String priceSourceLocation) {
        this.priceSourceLocation = priceSourceLocation;
        return this;
    }

    public String getPriceSourceTime() {
        return priceSourceTime;
    }

    public CdmBaseStaticdataAssetCommonPriceSource priceSourceTime(String priceSourceTime) {
        this.priceSourceTime = priceSourceTime;
        return this;
    }

}
