package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("FoHDf4WzS4idtPc8rWwVFFvALQ27WzMHxPdXovy7DH4p")
public class TargetDocumentSessionStarted {
    public static String blueId() {
        return "FoHDf4WzS4idtPc8rWwVFFvALQ27WzMHxPdXovy7DH4p";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Target Document Session Started";
    }

    public static String qualifiedName() {
        return "MyOS/Target Document Session Started";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/TargetDocumentSessionStarted.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node document;

    private List<String> initiatorSessionIds;

    public Node getDocument() {
        return document;
    }

    public TargetDocumentSessionStarted document(Node document) {
        this.document = document;
        return this;
    }

    public List<String> getInitiatorSessionIds() {
        return initiatorSessionIds;
    }

    public TargetDocumentSessionStarted initiatorSessionIds(List<String> initiatorSessionIds) {
        this.initiatorSessionIds = initiatorSessionIds;
        return this;
    }

}
