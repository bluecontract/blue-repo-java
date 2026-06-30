package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("J3qzEabcpDNDy884Jd998xkJpMR5zFZJuiaxAq95ZLLx")
public class CdmEventCommonCalculateTransferInstruction {
    public static String blueId() {
        return "J3qzEabcpDNDy884Jd998xkJpMR5zFZJuiaxAq95ZLLx";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/CalculateTransferInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/CalculateTransferInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonCalculateTransferInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String date;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    private CdmProductTemplateMetafieldsReferenceWithMetaPayout payout;

    private CdmBaseMathQuantity quantity;

    private List<CdmEventCommonReset> resets;

    private CdmEventCommonTradeState tradeState;

    public String getDate() {
        return date;
    }

    public CdmEventCommonCalculateTransferInstruction date(String date) {
        this.date = date;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmEventCommonCalculateTransferInstruction payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmProductTemplateMetafieldsReferenceWithMetaPayout getPayout() {
        return payout;
    }

    public CdmEventCommonCalculateTransferInstruction payout(CdmProductTemplateMetafieldsReferenceWithMetaPayout payout) {
        this.payout = payout;
        return this;
    }

    public CdmBaseMathQuantity getQuantity() {
        return quantity;
    }

    public CdmEventCommonCalculateTransferInstruction quantity(CdmBaseMathQuantity quantity) {
        this.quantity = quantity;
        return this;
    }

    public List<CdmEventCommonReset> getResets() {
        return resets;
    }

    public CdmEventCommonCalculateTransferInstruction resets(List<CdmEventCommonReset> resets) {
        this.resets = resets;
        return this;
    }

    public CdmEventCommonTradeState getTradeState() {
        return tradeState;
    }

    public CdmEventCommonCalculateTransferInstruction tradeState(CdmEventCommonTradeState tradeState) {
        this.tradeState = tradeState;
        return this;
    }

}
