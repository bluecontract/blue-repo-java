package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("73jmPJ7x1sgA5yLjv74ZrRGHpUXgUYfQHyAp6SArKwWW")
public class MyOSAgentOperationRule {
    public static String blueId() {
        return "73jmPJ7x1sgA5yLjv74ZrRGHpUXgUYfQHyAp6SArKwWW";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Agent Operation Rule";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Agent Operation Rule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSAgentOperationRule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String id;

    private String text;

    public String getId() {
        return id;
    }

    public MyOSAgentOperationRule id(String id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public MyOSAgentOperationRule text(String text) {
        this.text = text;
        return this;
    }

}
