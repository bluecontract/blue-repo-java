package blue.repo.v1_2_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Co5guWscbTav1tmXvQPb4k3wtrsQEdxjDaj6WPPWpPo8")
public class Document {
    public static String blueId() {
        return "Co5guWscbTav1tmXvQPb4k3wtrsQEdxjDaj6WPPWpPo8";
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
        return "blue/repo/v1_2_0/definitions/Common/Document.json";
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
