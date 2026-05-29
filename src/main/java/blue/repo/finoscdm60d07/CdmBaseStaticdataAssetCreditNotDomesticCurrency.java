package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EnmDmtGmXdcSFM8ftSpCb7bs4zYCGfP7BzN4bLCgNayQ")
public class CdmBaseStaticdataAssetCreditNotDomesticCurrency {
    public static String blueId() {
        return "EnmDmtGmXdcSFM8ftSpCb7bs4zYCGfP7BzN4bLCgNayQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/credit/NotDomesticCurrency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/credit/NotDomesticCurrency";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcreditNotDomesticCurrency.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean applicable;

    private ComRosettaModelFieldWithMetaString currency;

    public Boolean getApplicable() {
        return applicable;
    }

    public CdmBaseStaticdataAssetCreditNotDomesticCurrency applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCurrency() {
        return currency;
    }

    public CdmBaseStaticdataAssetCreditNotDomesticCurrency currency(ComRosettaModelFieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

}
