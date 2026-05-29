package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8Kw75fnpiVHQevvWVc9xbHLEiK9fBKTFJvMiEQQeX7Xp")
public class CdmProductTemplateStrikeSchedule {
    public static String blueId() {
        return "8Kw75fnpiVHQevvWVc9xbHLEiK9fBKTFJvMiEQQeX7Xp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/StrikeSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/StrikeSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateStrikeSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyPayerReceiverEnum buyer;

    private CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule price;

    private CdmBaseStaticdataPartyPayerReceiverEnum seller;

    public CdmBaseStaticdataPartyPayerReceiverEnum getBuyer() {
        return buyer;
    }

    public CdmProductTemplateStrikeSchedule buyer(CdmBaseStaticdataPartyPayerReceiverEnum buyer) {
        this.buyer = buyer;
        return this;
    }

    public CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule getPrice() {
        return price;
    }

    public CdmProductTemplateStrikeSchedule price(CdmObservableAssetMetafieldsReferenceWithMetaPriceSchedule price) {
        this.price = price;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiverEnum getSeller() {
        return seller;
    }

    public CdmProductTemplateStrikeSchedule seller(CdmBaseStaticdataPartyPayerReceiverEnum seller) {
        this.seller = seller;
        return this;
    }

}
