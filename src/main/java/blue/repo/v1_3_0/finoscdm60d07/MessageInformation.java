package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HV178mDLf4R74aFS6aQjjq6eAfeHhnh5unXYoZ9e3Zw5")
public class MessageInformation {
    public static String blueId() {
        return "HV178mDLf4R74aFS6aQjjq6eAfeHhnh5unXYoZ9e3Zw5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MessageInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MessageInformation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MessageInformation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private List<FieldWithMetaString> copyTo;

    private FieldWithMetaString messageId;

    private FieldWithMetaString sentBy;

    private List<FieldWithMetaString> sentTo;

    public String getNamespace() {
        return namespace;
    }

    public MessageInformation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<FieldWithMetaString> getCopyTo() {
        return copyTo;
    }

    public MessageInformation copyTo(List<FieldWithMetaString> copyTo) {
        this.copyTo = copyTo;
        return this;
    }

    public FieldWithMetaString getMessageId() {
        return messageId;
    }

    public MessageInformation messageId(FieldWithMetaString messageId) {
        this.messageId = messageId;
        return this;
    }

    public FieldWithMetaString getSentBy() {
        return sentBy;
    }

    public MessageInformation sentBy(FieldWithMetaString sentBy) {
        this.sentBy = sentBy;
        return this;
    }

    public List<FieldWithMetaString> getSentTo() {
        return sentTo;
    }

    public MessageInformation sentTo(List<FieldWithMetaString> sentTo) {
        this.sentTo = sentTo;
        return this;
    }

}
