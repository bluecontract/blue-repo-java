package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.conversation.DocumentStatus;
import blue.repo.core.Channel;
import java.util.List;
import java.util.Map;

@TypeBlueId("AhSRfEjNdQ8AvA3AFigjdyQzAtoc2J29jpacEcKBNa32")
public class DocumentSessionBootstrap extends MyOSAdminBase {
    public static String blueId() {
        return "AhSRfEjNdQ8AvA3AFigjdyQzAtoc2J29jpacEcKBNa32";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Document Session Bootstrap";
    }

    public static String qualifiedName() {
        return "MyOS/Document Session Bootstrap";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/DocumentSessionBootstrap.json";
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

    private String avatarUrl;

    private Map<String, Channel> channelBindings;

    private Node initialMessages;

    private Map<String, Boolean> capabilities;

    private DocumentStatus bootstrapStatus;

    private String bootstrapError;

    private List<String> initiatorSessionIds;

    private Map<String, ParticipantActivationState> participantsState;

    public Node getDocument() {
        return document;
    }

    public DocumentSessionBootstrap document(Node document) {
        this.document = document;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public DocumentSessionBootstrap avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public Map<String, Channel> getChannelBindings() {
        return channelBindings;
    }

    public DocumentSessionBootstrap channelBindings(Map<String, Channel> channelBindings) {
        this.channelBindings = channelBindings;
        return this;
    }

    public Node getInitialMessages() {
        return initialMessages;
    }

    public DocumentSessionBootstrap initialMessages(Node initialMessages) {
        this.initialMessages = initialMessages;
        return this;
    }

    public Map<String, Boolean> getCapabilities() {
        return capabilities;
    }

    public DocumentSessionBootstrap capabilities(Map<String, Boolean> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    public DocumentStatus getBootstrapStatus() {
        return bootstrapStatus;
    }

    public DocumentSessionBootstrap bootstrapStatus(DocumentStatus bootstrapStatus) {
        this.bootstrapStatus = bootstrapStatus;
        return this;
    }

    public String getBootstrapError() {
        return bootstrapError;
    }

    public DocumentSessionBootstrap bootstrapError(String bootstrapError) {
        this.bootstrapError = bootstrapError;
        return this;
    }

    public List<String> getInitiatorSessionIds() {
        return initiatorSessionIds;
    }

    public DocumentSessionBootstrap initiatorSessionIds(List<String> initiatorSessionIds) {
        this.initiatorSessionIds = initiatorSessionIds;
        return this;
    }

    public Map<String, ParticipantActivationState> getParticipantsState() {
        return participantsState;
    }

    public DocumentSessionBootstrap participantsState(Map<String, ParticipantActivationState> participantsState) {
        this.participantsState = participantsState;
        return this;
    }

}
