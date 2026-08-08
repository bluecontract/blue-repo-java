package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.mandate.OperationMandate;
import java.util.List;

@TypeBlueId("F21DrLDLAG3VWeZntTQEWvaAVpWfsyP5Q6FUiTqM7bBw")
public class MyOSAgentOperationMandate extends OperationMandate {
    public static String blueId() {
        return "F21DrLDLAG3VWeZntTQEWvaAVpWfsyP5Q6FUiTqM7bBw";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Agent Operation Mandate";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Agent Operation Mandate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSAgentOperationMandate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<Node> rules;

    public List<Node> getRules() {
        return rules;
    }

    public MyOSAgentOperationMandate rules(List<Node> rules) {
        this.rules = rules;
        return this;
    }

}
