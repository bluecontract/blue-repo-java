package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EUqBG18Xjhv7bvKn6QSE1KwaeoDMV6d8huDoduUY6Ti6")
public class PurposeStatement {
    public static String blueId() {
        return "EUqBG18Xjhv7bvKn6QSE1KwaeoDMV6d8huDoduUY6Ti6";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Purpose Statement";
    }

    public static String qualifiedName() {
        return "Coordination/Purpose Statement";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/PurposeStatement.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Authority onBehalfOf;

    private Node event;

    private List<Operation> respondsWith;

    private String summary;

    public Authority getOnBehalfOf() {
        return onBehalfOf;
    }

    public PurposeStatement onBehalfOf(Authority onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public Node getEvent() {
        return event;
    }

    public PurposeStatement event(Node event) {
        this.event = event;
        return this;
    }

    public List<Operation> getRespondsWith() {
        return respondsWith;
    }

    public PurposeStatement respondsWith(List<Operation> respondsWith) {
        this.respondsWith = respondsWith;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public PurposeStatement summary(String summary) {
        this.summary = summary;
        return this;
    }

}
