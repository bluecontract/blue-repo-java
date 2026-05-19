package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BvMhdWJJQFA5bg6P6VDUvk1NKoGWhGdNj7ZVUPejsWJE")
public class Transfer {
    public static String blueId() {
        return "BvMhdWJJQFA5bg6P6VDUvk1NKoGWhGdNj7ZVUPejsWJE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Transfer";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Transfer";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Transfer.json";
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

    private Asset asset;

    private List<FieldWithMetaIdentifier> identifier;

    private PartyReferencePayerReceiver payerReceiver;

    private NonNegativeQuantity quantity;

    private Reset resetOrigin;

    private AdjustableOrAdjustedOrRelativeDate settlementDate;

    private ReferenceWithMetaPayout settlementOrigin;

    private TransferExpression transferExpression;

    public String getNamespace() {
        return namespace;
    }

    public Transfer namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Asset getAsset() {
        return asset;
    }

    public Transfer asset(Asset asset) {
        this.asset = asset;
        return this;
    }

    public List<FieldWithMetaIdentifier> getIdentifier() {
        return identifier;
    }

    public Transfer identifier(List<FieldWithMetaIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public PartyReferencePayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public Transfer payerReceiver(PartyReferencePayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public NonNegativeQuantity getQuantity() {
        return quantity;
    }

    public Transfer quantity(NonNegativeQuantity quantity) {
        this.quantity = quantity;
        return this;
    }

    public Reset getResetOrigin() {
        return resetOrigin;
    }

    public Transfer resetOrigin(Reset resetOrigin) {
        this.resetOrigin = resetOrigin;
        return this;
    }

    public AdjustableOrAdjustedOrRelativeDate getSettlementDate() {
        return settlementDate;
    }

    public Transfer settlementDate(AdjustableOrAdjustedOrRelativeDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    public ReferenceWithMetaPayout getSettlementOrigin() {
        return settlementOrigin;
    }

    public Transfer settlementOrigin(ReferenceWithMetaPayout settlementOrigin) {
        this.settlementOrigin = settlementOrigin;
        return this;
    }

    public TransferExpression getTransferExpression() {
        return transferExpression;
    }

    public Transfer transferExpression(TransferExpression transferExpression) {
        this.transferExpression = transferExpression;
        return this;
    }

}
