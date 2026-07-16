package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("BipDEsAgTsG3HSm5CL4KAMeAWBkzRetdKdtnixAwJW9y#0")
public class TimelineEntry {
    public static String blueId() {
        return "BipDEsAgTsG3HSm5CL4KAMeAWBkzRetdKdtnixAwJW9y#0";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Timeline Entry";
    }

    public static String qualifiedName() {
        return "Coordination/Timeline Entry";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/TimelineEntry.json";
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

    private TimelineEntry prevEntry;

    private BigInteger timestamp;

    private Actor actor;

    private Source source;

    private Authority onBehalfOf;

    private Node message;

    public Timeline getTimeline() {
        return timeline;
    }

    public TimelineEntry timeline(Timeline timeline) {
        this.timeline = timeline;
        return this;
    }

    public TimelineEntry getPrevEntry() {
        return prevEntry;
    }

    public TimelineEntry prevEntry(TimelineEntry prevEntry) {
        this.prevEntry = prevEntry;
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

    public Source getSource() {
        return source;
    }

    public TimelineEntry source(Source source) {
        this.source = source;
        return this;
    }

    public Authority getOnBehalfOf() {
        return onBehalfOf;
    }

    public TimelineEntry onBehalfOf(Authority onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public Node getMessage() {
        return message;
    }

    public TimelineEntry message(Node message) {
        this.message = message;
        return this;
    }

}
