package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import blue.repository.v1_2_0.conversation.Event;
import java.math.BigInteger;

@TypeBlueId("9CvxqAMJhqcFoLr5nXSEdWDZUMD383xhJtyFwXsCqD9E")
public class SessionEpochAdvanced extends Event {
    public static String blueId() {
        return "9CvxqAMJhqcFoLr5nXSEdWDZUMD383xhJtyFwXsCqD9E";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Session Epoch Advanced";
    }

    public static String qualifiedName() {
        return "MyOS/Session Epoch Advanced";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/MyOS/SessionEpochAdvanced.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String sessionId;

    private String timestamp;

    private BigInteger epoch;

    private Node document;

    public String getSessionId() {
        return sessionId;
    }

    public SessionEpochAdvanced sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public SessionEpochAdvanced timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public BigInteger getEpoch() {
        return epoch;
    }

    public SessionEpochAdvanced epoch(BigInteger epoch) {
        this.epoch = epoch;
        return this;
    }

    public Node getDocument() {
        return document;
    }

    public SessionEpochAdvanced document(Node document) {
        this.document = document;
        return this;
    }

}
