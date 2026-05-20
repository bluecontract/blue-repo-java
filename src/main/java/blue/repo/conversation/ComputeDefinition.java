package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.core.Marker;
import java.util.Map;

@TypeBlueId("4fwPW7iJA5p7MuRhc3xpn43EsU3TkruGRpujcuwDGbw3")
public class ComputeDefinition extends Marker {
    public static String blueId() {
        return "4fwPW7iJA5p7MuRhc3xpn43EsU3TkruGRpujcuwDGbw3";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Compute Definition";
    }

    public static String qualifiedName() {
        return "Conversation/Compute Definition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Conversation/ComputeDefinition.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Map<String, Node> constants;

    private Map<String, Node> functions;

    public Map<String, Node> getConstants() {
        return constants;
    }

    public ComputeDefinition constants(Map<String, Node> constants) {
        this.constants = constants;
        return this;
    }

    public Map<String, Node> getFunctions() {
        return functions;
    }

    public ComputeDefinition functions(Map<String, Node> functions) {
        this.functions = functions;
        return this;
    }

}
