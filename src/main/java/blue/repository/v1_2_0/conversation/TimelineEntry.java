package blue.repository.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("29tcU8MkrV3KL5HqH6DHJDPPfJMheoqwiKJsaHnrp9hT")
public class TimelineEntry {
    public static String blueId() {
        return "29tcU8MkrV3KL5HqH6DHJDPPfJMheoqwiKJsaHnrp9hT";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Timeline Entry";
    }

    public static String qualifiedName() {
        return "Conversation/Timeline Entry";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/Conversation/TimelineEntry.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Timeline timeline;

    private Node prevEntry;

    private Node message;

    private BigInteger timestamp;

    private Actor actor;

    private Node source;

    public Timeline getTimeline() {
        return timeline;
    }

    public TimelineEntry timeline(Timeline timeline) {
        this.timeline = timeline;
        return this;
    }

    public Node getPrevEntry() {
        return prevEntry;
    }

    public TimelineEntry prevEntry(Node prevEntry) {
        this.prevEntry = prevEntry;
        return this;
    }

    public Node getMessage() {
        return message;
    }

    public TimelineEntry message(Node message) {
        this.message = message;
        return this;
    }

    public BigInteger getTimestamp() {
        return timestamp;
    }

    public TimelineEntry timestamp(BigInteger timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Actor getActor() {
        return actor;
    }

    public TimelineEntry actor(Actor actor) {
        this.actor = actor;
        return this;
    }

    public Node getSource() {
        return source;
    }

    public TimelineEntry source(Node source) {
        this.source = source;
        return this;
    }

}
