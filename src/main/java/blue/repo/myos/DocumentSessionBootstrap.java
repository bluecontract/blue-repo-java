package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.DocumentStatus;
import java.util.List;
import java.util.Map;

@TypeBlueId("5ZaWtZY29h6mm6KGKJsxcfDLF3TMS3XgFVJ7nxwZgDLB")
public class DocumentSessionBootstrap extends MyOSAdminBase {
    public static String blueId() {
        return "5ZaWtZY29h6mm6KGKJsxcfDLF3TMS3XgFVJ7nxwZgDLB";
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

    private Map<String, Node> channelBindings;

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

    public Map<String, Node> getChannelBindings() {
        return channelBindings;
    }

    public DocumentSessionBootstrap channelBindings(Map<String, Node> channelBindings) {
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
