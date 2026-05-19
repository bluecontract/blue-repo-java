package blue.repo.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.Map;

@TypeBlueId("5dvPe44DscitgTA17nv7sa8Wzq2oiwKvaxeDnGc4DtaL")
public class ComputeDefinition {
    public static String blueId() {
        return "5dvPe44DscitgTA17nv7sa8Wzq2oiwKvaxeDnGc4DtaL";
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
