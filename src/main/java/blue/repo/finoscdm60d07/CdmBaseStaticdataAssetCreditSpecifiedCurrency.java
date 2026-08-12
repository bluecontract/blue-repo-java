package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hm8WzZ2vt1scZRpgZ9XjxKEcvsf2oXa8icw3PC9JPL2C")
public class CdmBaseStaticdataAssetCreditSpecifiedCurrency {
    public static String blueId() {
        return "Hm8WzZ2vt1scZRpgZ9XjxKEcvsf2oXa8icw3PC9JPL2C";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/credit/SpecifiedCurrency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/credit/SpecifiedCurrency";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcreditSpecifiedCurrency.json";
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

    public CdmBaseStaticdataAssetCreditSpecifiedCurrency applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCurrency() {
        return currency;
    }

    public CdmBaseStaticdataAssetCreditSpecifiedCurrency currency(ComRosettaModelFieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

}
