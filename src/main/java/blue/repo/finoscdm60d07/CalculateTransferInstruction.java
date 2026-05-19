package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("H8F6VBgW4qnZgcXmqjHQtaDumbdwi395GGKycEMfgfBt")
public class CalculateTransferInstruction {
    public static String blueId() {
        return "H8F6VBgW4qnZgcXmqjHQtaDumbdwi395GGKycEMfgfBt";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculateTransferInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculateTransferInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CalculateTransferInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private String date;

    private PayerReceiver payerReceiver;

    private ReferenceWithMetaPayout payout;

    private Quantity quantity;

    private List<Reset> resets;

    private TradeState tradeState;

    public String getNamespace() {
        return namespace;
    }

    public CalculateTransferInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getDate() {
        return date;
    }

    public CalculateTransferInstruction date(String date) {
        this.date = date;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CalculateTransferInstruction payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public ReferenceWithMetaPayout getPayout() {
        return payout;
    }

    public CalculateTransferInstruction payout(ReferenceWithMetaPayout payout) {
        this.payout = payout;
        return this;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public CalculateTransferInstruction quantity(Quantity quantity) {
        this.quantity = quantity;
        return this;
    }

    public List<Reset> getResets() {
        return resets;
    }

    public CalculateTransferInstruction resets(List<Reset> resets) {
        this.resets = resets;
        return this;
    }

    public TradeState getTradeState() {
        return tradeState;
    }

    public CalculateTransferInstruction tradeState(TradeState tradeState) {
        this.tradeState = tradeState;
        return this;
    }

}
