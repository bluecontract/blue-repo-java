package blue.repository.v1_2_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("7htwgHAXA9FjUGRytXFfwYMUZz4R3BDMfmeHeGvpscLP")
public class DocumentUpdate {
    public static String blueId() {
        return "7htwgHAXA9FjUGRytXFfwYMUZz4R3BDMfmeHeGvpscLP";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Document Update";
    }

    public static String qualifiedName() {
        return "Core/Document Update";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/Core/DocumentUpdate.json";
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

    private Node before;

    private Node after;

    public String getOp() {
        return op;
    }

    public DocumentUpdate op(String op) {
        this.op = op;
        return this;
    }

    public String getPath() {
        return path;
    }

    public DocumentUpdate path(String path) {
        this.path = path;
        return this;
    }

    public Node getBefore() {
        return before;
    }

    public DocumentUpdate before(Node before) {
        this.before = before;
        return this;
    }

    public Node getAfter() {
        return after;
    }

    public DocumentUpdate after(Node after) {
        this.after = after;
        return this;
    }

}
