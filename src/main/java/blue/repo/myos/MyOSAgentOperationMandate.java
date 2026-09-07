package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.mandate.OperationMandate;
import java.util.List;

@TypeBlueId("8Vu5E76pHqmQtuvB3oSfZk4MTC44vwLTf8cDWgteQuJK")
public class MyOSAgentOperationMandate extends OperationMandate {
    public static String blueId() {
        return "8Vu5E76pHqmQtuvB3oSfZk4MTC44vwLTf8cDWgteQuJK";
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

    private List<MyOSAgentOperationRule> rules;

    public List<MyOSAgentOperationRule> getRules() {
        return rules;
    }

    public MyOSAgentOperationMandate rules(List<MyOSAgentOperationRule> rules) {
        this.rules = rules;
        return this;
    }

}
