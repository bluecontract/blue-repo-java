package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;
import java.util.List;

@TypeBlueId("J9a8qD8javfYK6nRDq9YZRA8LDuzZzq7QS7DB73Pm4Lv")
public class TargetDocumentSessionStarted extends Event {
    public static String blueId() {
        return "J9a8qD8javfYK6nRDq9YZRA8LDuzZzq7QS7DB73Pm4Lv";
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
