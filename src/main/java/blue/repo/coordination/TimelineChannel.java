package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ab5kRCjTekQwTpWBgBv2ofJ6kgGbrbqMrdRPPJ4aKX3d")
public class TimelineChannel extends blue.language.processor.model.ChannelContract {
    public static String blueId() {
        return "Ab5kRCjTekQwTpWBgBv2ofJ6kgGbrbqMrdRPPJ4aKX3d";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Timeline Channel";
    }

    public static String qualifiedName() {
        return "Coordination/Timeline Channel";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/TimelineChannel.json";
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

    private Actor actor;

    public Timeline getTimeline() {
        return timeline;
    }

    public TimelineChannel timeline(Timeline timeline) {
        this.timeline = timeline;
        return this;
    }

    public Actor getActor() {
        return actor;
    }

    public TimelineChannel actor(Actor actor) {
        this.actor = actor;
        return this;
    }

}
