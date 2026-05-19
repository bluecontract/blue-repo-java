package blue.repo.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Bz49DbfqKC1yJeCfv5RYPZUKTfb7rtZnmreCaz4RsXn5")
public class JsonPatchEntry {
    public static String blueId() {
        return "Bz49DbfqKC1yJeCfv5RYPZUKTfb7rtZnmreCaz4RsXn5";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Json Patch Entry";
    }

    public static String qualifiedName() {
        return "Core/Json Patch Entry";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Core/JsonPatchEntry.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String op;

    private String path;

    private Node val;

    public String getOp() {
        return op;
    }

    public JsonPatchEntry op(String op) {
        this.op = op;
        return this;
    }

    public String getPath() {
        return path;
    }

    public JsonPatchEntry path(String path) {
        this.path = path;
        return this;
    }

    public Node getVal() {
        return val;
    }

    public JsonPatchEntry val(Node val) {
        this.val = val;
        return this;
    }

}
