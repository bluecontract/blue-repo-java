package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.Map;

@TypeBlueId("3ihLKENZHtZsbkA2Aa1pLxBHxibJ5jTFEhYLGFuEtpjr")
public class ComputeDefinition extends blue.language.processor.model.MarkerContract {
    public static String blueId() {
        return "3ihLKENZHtZsbkA2Aa1pLxBHxibJ5jTFEhYLGFuEtpjr";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Compute Definition";
    }

    public static String qualifiedName() {
        return "Coordination/Compute Definition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/ComputeDefinition.json";
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
