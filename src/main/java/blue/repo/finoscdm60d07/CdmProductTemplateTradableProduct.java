package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5L5ELtTjqEroydK4qXv9bitzL5wJ8yY6yjAhFum13A7U")
public class CdmProductTemplateTradableProduct {
    public static String blueId() {
        return "5L5ELtTjqEroydK4qXv9bitzL5wJ8yY6yjAhFum13A7U";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/TradableProduct";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/TradableProduct";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateTradableProduct.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonNotionalAdjustmentEnum adjustment;

    private List<CdmBaseStaticdataPartyAncillaryParty> ancillaryParty;

    private List<CdmBaseStaticdataPartyCounterparty> counterparty;

    private CdmProductTemplateNonTransferableProduct product;

    private List<CdmProductTemplateTradeLot> tradeLot;

    public CdmProductCommonNotionalAdjustmentEnum getAdjustment() {
        return adjustment;
    }

    public CdmProductTemplateTradableProduct adjustment(CdmProductCommonNotionalAdjustmentEnum adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    public List<CdmBaseStaticdataPartyAncillaryParty> getAncillaryParty() {
        return ancillaryParty;
    }

    public CdmProductTemplateTradableProduct ancillaryParty(List<CdmBaseStaticdataPartyAncillaryParty> ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public List<CdmBaseStaticdataPartyCounterparty> getCounterparty() {
        return counterparty;
    }

    public CdmProductTemplateTradableProduct counterparty(List<CdmBaseStaticdataPartyCounterparty> counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public CdmProductTemplateNonTransferableProduct getProduct() {
        return product;
    }

    public CdmProductTemplateTradableProduct product(CdmProductTemplateNonTransferableProduct product) {
        this.product = product;
        return this;
    }

    public List<CdmProductTemplateTradeLot> getTradeLot() {
        return tradeLot;
    }

    public CdmProductTemplateTradableProduct tradeLot(List<CdmProductTemplateTradeLot> tradeLot) {
        this.tradeLot = tradeLot;
        return this;
    }

}
