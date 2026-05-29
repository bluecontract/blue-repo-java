package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GHahiPamcMGVtC2F4f54bze85zJyz1yAze7Jipij2QFu")
public class CdmProductCommonSettlementComputedAmount {
    public static String blueId() {
        return "GHahiPamcMGVtC2F4f54bze85zJyz1yAze7Jipij2QFu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/ComputedAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/ComputedAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementComputedAmount.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double amount;

    private String callFunction;

    private ComRosettaModelFieldWithMetaString currency;

    public Double getAmount() {
        return amount;
    }

    public CdmProductCommonSettlementComputedAmount amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public String getCallFunction() {
        return callFunction;
    }

    public CdmProductCommonSettlementComputedAmount callFunction(String callFunction) {
        this.callFunction = callFunction;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCurrency() {
        return currency;
    }

    public CdmProductCommonSettlementComputedAmount currency(ComRosettaModelFieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

}
