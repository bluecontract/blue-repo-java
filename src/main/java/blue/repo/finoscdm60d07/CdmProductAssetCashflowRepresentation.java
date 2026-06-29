package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DTtWhJnXuoKubPMxQyji2Nw7Ci2mGd6RoJWN5EbzReoR")
public class CdmProductAssetCashflowRepresentation {
    public static String blueId() {
        return "DTtWhJnXuoKubPMxQyji2Nw7Ci2mGd6RoJWN5EbzReoR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/CashflowRepresentation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/CashflowRepresentation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetCashflowRepresentation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean cashflowsMatchParameters;

    private List<CdmProductCommonSchedulePaymentCalculationPeriod> paymentCalculationPeriod;

    public Boolean getCashflowsMatchParameters() {
        return cashflowsMatchParameters;
    }

    public CdmProductAssetCashflowRepresentation cashflowsMatchParameters(Boolean cashflowsMatchParameters) {
        this.cashflowsMatchParameters = cashflowsMatchParameters;
        return this;
    }

    public List<CdmProductCommonSchedulePaymentCalculationPeriod> getPaymentCalculationPeriod() {
        return paymentCalculationPeriod;
    }

    public CdmProductAssetCashflowRepresentation paymentCalculationPeriod(List<CdmProductCommonSchedulePaymentCalculationPeriod> paymentCalculationPeriod) {
        this.paymentCalculationPeriod = paymentCalculationPeriod;
        return this;
    }

}
