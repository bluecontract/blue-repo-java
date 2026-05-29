package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B62tsckv8aQiyFAchgqgptfB5C6jtDPkS2pLT1h3G793")
public class Document {
    public static String blueId() {
        return "B62tsckv8aQiyFAchgqgptfB5C6jtDPkS2pLT1h3G793";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Document";
    }

    public static String qualifiedName() {
        return "Common/Document";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/Document.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String kind;

    public String getKind() {
        return kind;
    }

    public Document kind(String kind) {
        this.kind = kind;
        return this;
    }

}
