package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Currency;

@TypeBlueId("6S6GNBUumRoRS4YWJxiiKeiyZ2dYH2nhcSpzGYvBJAha")
public class PayNote {
    public static String blueId() {
        return "6S6GNBUumRoRS4YWJxiiKeiyZ2dYH2nhcSpzGYvBJAha";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayNote.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node contracts;

    private String kind;

    private String status;

    private Currency currency;

    private Node amount;

    private Node transactionDetails;

    private Node controls;

    private Node payNoteInitialStateDescription;

    public Node getContracts() {
        return contracts;
    }

    public PayNote contracts(Node contracts) {
        this.contracts = contracts;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public PayNote kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PayNote status(String status) {
        this.status = status;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public PayNote currency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public Node getAmount() {
        return amount;
    }

    public PayNote amount(Node amount) {
        this.amount = amount;
        return this;
    }

    public Node getTransactionDetails() {
        return transactionDetails;
    }

    public PayNote transactionDetails(Node transactionDetails) {
        this.transactionDetails = transactionDetails;
        return this;
    }

    public Node getControls() {
        return controls;
    }

    public PayNote controls(Node controls) {
        this.controls = controls;
        return this;
    }

    public Node getPayNoteInitialStateDescription() {
        return payNoteInitialStateDescription;
    }

    public PayNote payNoteInitialStateDescription(Node payNoteInitialStateDescription) {
        this.payNoteInitialStateDescription = payNoteInitialStateDescription;
        return this;
    }

}
