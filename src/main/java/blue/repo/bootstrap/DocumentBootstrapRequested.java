package blue.repo.bootstrap;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Message;
import blue.repo.coordination.Request;
import java.util.List;

@TypeBlueId("2a67bWEnUUaHNFM8MDaAKRCLnKQZKMcuifjT4mxAEnGt")
public class DocumentBootstrapRequested extends Request {
    public static String blueId() {
        return "2a67bWEnUUaHNFM8MDaAKRCLnKQZKMcuifjT4mxAEnGt";
    }

    public static String packageName() {
        return "Bootstrap";
    }

    public static String typeName() {
        return "Document Bootstrap Requested";
    }

    public static String qualifiedName() {
        return "Bootstrap/Document Bootstrap Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Bootstrap/DocumentBootstrapRequested.json";
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

    private List<ParticipantMapping> participantMappings;

    private List<Message> initialMessages;

    public Node getDocument() {
        return document;
    }

    public DocumentBootstrapRequested document(Node document) {
        this.document = document;
        return this;
    }

    public List<ParticipantMapping> getParticipantMappings() {
        return participantMappings;
    }

    public DocumentBootstrapRequested participantMappings(List<ParticipantMapping> participantMappings) {
        this.participantMappings = participantMappings;
        return this;
    }

    public List<Message> getInitialMessages() {
        return initialMessages;
    }

    public DocumentBootstrapRequested initialMessages(List<Message> initialMessages) {
        this.initialMessages = initialMessages;
        return this;
    }

}
