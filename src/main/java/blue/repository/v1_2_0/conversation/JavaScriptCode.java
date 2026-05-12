package blue.repository.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("ExZxT61PSpWHpEAtP2WKMXXqxEYN7Z13j7Zv36Dp99kS")
public class JavaScriptCode extends SequentialWorkflowStep {
    public static String blueId() {
        return "ExZxT61PSpWHpEAtP2WKMXXqxEYN7Z13j7Zv36Dp99kS";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "JavaScript Code";
    }

    public static String qualifiedName() {
        return "Conversation/JavaScript Code";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/Conversation/JavaScriptCode.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String code;

    public String getCode() {
        return code;
    }

    public JavaScriptCode code(String code) {
        this.code = code;
        return this;
    }

}
