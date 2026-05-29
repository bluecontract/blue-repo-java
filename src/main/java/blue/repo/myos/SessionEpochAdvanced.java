package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Event;
import java.math.BigInteger;

@TypeBlueId("7WJnGdq3txEhXb6P2vXLAMUhPBCWQzHsz416cDfKGcUm")
public class SessionEpochAdvanced extends Event {
    public static String blueId() {
        return "7WJnGdq3txEhXb6P2vXLAMUhPBCWQzHsz416cDfKGcUm";
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
        return "blue/repo/definitions/MyOS/SessionEpochAdvanced.json";
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
