package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("GEiYETZkL7VKU2MM1UAEcnjv6pLTquUhrhn3vWrBeUh")
public class CdmProductAssetFutureValueAmount {
    public static String blueId() {
        return "GEiYETZkL7VKU2MM1UAEcnjv6pLTquUhrhn3vWrBeUh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FutureValueAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FutureValueAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFutureValueAmount.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger calculationPeriodNumberOfDays;

    private ComRosettaModelFieldWithMetaString currency;

    private CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule quantity;

    private String valueDate;

    public BigInteger getCalculationPeriodNumberOfDays() {
        return calculationPeriodNumberOfDays;
    }

    public CdmProductAssetFutureValueAmount calculationPeriodNumberOfDays(BigInteger calculationPeriodNumberOfDays) {
        this.calculationPeriodNumberOfDays = calculationPeriodNumberOfDays;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getCurrency() {
        return currency;
    }

    public CdmProductAssetFutureValueAmount currency(ComRosettaModelFieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule getQuantity() {
        return quantity;
    }

    public CdmProductAssetFutureValueAmount quantity(CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getValueDate() {
        return valueDate;
    }

    public CdmProductAssetFutureValueAmount valueDate(String valueDate) {
        this.valueDate = valueDate;
        return this;
    }

}
