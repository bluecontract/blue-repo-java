package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("ESVYFHhwAEbDfHx7VpnDSeYjKbYM1yz22iidmSJwTbPR")
public class CdmEventCommonIndexTransitionInstruction {
    public static String blueId() {
        return "ESVYFHhwAEbDfHx7VpnDSeYjKbYM1yz22iidmSJwTbPR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/IndexTransitionInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/IndexTransitionInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonIndexTransitionInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonTransfer cashTransfer;

    private String effectiveDate;

    private List<CdmObservableAssetPriceQuantity> priceQuantity;

    public CdmEventCommonTransfer getCashTransfer() {
        return cashTransfer;
    }

    public CdmEventCommonIndexTransitionInstruction cashTransfer(CdmEventCommonTransfer cashTransfer) {
        this.cashTransfer = cashTransfer;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public CdmEventCommonIndexTransitionInstruction effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public List<CdmObservableAssetPriceQuantity> getPriceQuantity() {
        return priceQuantity;
    }

    public CdmEventCommonIndexTransitionInstruction priceQuantity(List<CdmObservableAssetPriceQuantity> priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

}
