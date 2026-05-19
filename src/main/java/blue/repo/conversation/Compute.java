package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@TypeBlueId("43pL2gQm5LahhsD7wGhTRxdH8DyfSEvpe2xx2rW2PHJS")
public class Compute extends SequentialWorkflowStep {
    public static String blueId() {
        return "43pL2gQm5LahhsD7wGhTRxdH8DyfSEvpe2xx2rW2PHJS";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Compute";
    }

    public static String qualifiedName() {
        return "Conversation/Compute";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/Compute.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node expr;

    // Original Blue property name: do
    @JsonProperty("do")
    private List<Node> doValue;

    private Node definition;

    private String entry;

    private Map<String, Node> constants;

    private Map<String, Node> functions;

    private Boolean emitEvents;

    private Boolean returnResult;

    private BigInteger gasLimit;

    public Node getExpr() {
        return expr;
    }

    public Compute expr(Node expr) {
        this.expr = expr;
        return this;
    }

    public List<Node> getDoValue() {
        return doValue;
    }

    public Compute doValue(List<Node> doValue) {
        this.doValue = doValue;
        return this;
    }

    public Node getDefinition() {
        return definition;
    }

    public Compute definition(Node definition) {
        this.definition = definition;
        return this;
    }

    public String getEntry() {
        return entry;
    }

    public Compute entry(String entry) {
        this.entry = entry;
        return this;
    }

    public Map<String, Node> getConstants() {
        return constants;
    }

    public Compute constants(Map<String, Node> constants) {
        this.constants = constants;
        return this;
    }

    public Map<String, Node> getFunctions() {
        return functions;
    }

    public Compute functions(Map<String, Node> functions) {
        this.functions = functions;
        return this;
    }

    public Boolean getEmitEvents() {
        return emitEvents;
    }

    public Compute emitEvents(Boolean emitEvents) {
        this.emitEvents = emitEvents;
        return this;
    }

    public Boolean getReturnResult() {
        return returnResult;
    }

    public Compute returnResult(Boolean returnResult) {
        this.returnResult = returnResult;
        return this;
    }

    public BigInteger getGasLimit() {
        return gasLimit;
    }

    public Compute gasLimit(BigInteger gasLimit) {
        this.gasLimit = gasLimit;
        return this;
    }

}
