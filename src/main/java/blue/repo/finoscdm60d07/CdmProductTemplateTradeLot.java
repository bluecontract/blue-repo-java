package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BmdnVkDXfdg2N2r7qgbCGTcmvRVJJCeGYWgqPEVPtqns")
public class CdmProductTemplateTradeLot {
    public static String blueId() {
        return "BmdnVkDXfdg2N2r7qgbCGTcmvRVJJCeGYWgqPEVPtqns";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/TradeLot";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/TradeLot";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateTradeLot.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataIdentifierIdentifier> lotIdentifier;

    private List<CdmObservableAssetPriceQuantity> priceQuantity;

    public List<CdmBaseStaticdataIdentifierIdentifier> getLotIdentifier() {
        return lotIdentifier;
    }

    public CdmProductTemplateTradeLot lotIdentifier(List<CdmBaseStaticdataIdentifierIdentifier> lotIdentifier) {
        this.lotIdentifier = lotIdentifier;
        return this;
    }

    public List<CdmObservableAssetPriceQuantity> getPriceQuantity() {
        return priceQuantity;
    }

    public CdmProductTemplateTradeLot priceQuantity(List<CdmObservableAssetPriceQuantity> priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

}
