package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4RvVyoEwATa2dtpRRoXbnRLbizq2vqeeMQVmqUrCd8JN")
public class TargetDocumentSessionStarted {
    public static String blueId() {
        return "4RvVyoEwATa2dtpRRoXbnRLbizq2vqeeMQVmqUrCd8JN";
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
        return "blue/repo/definitions/MyOS/TargetDocumentSessionStarted.json";
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
