package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("98dPVuFQFzp6TPmhAh6zjz4zFp8sdg597uHrfF3ztLkP")
public class CdmEventWorkflowMessageInformation {
    public static String blueId() {
        return "98dPVuFQFzp6TPmhAh6zjz4zFp8sdg597uHrfF3ztLkP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/MessageInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/MessageInformation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowMessageInformation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<ComRosettaModelFieldWithMetaString> copyTo;

    private ComRosettaModelFieldWithMetaString messageId;

    private ComRosettaModelFieldWithMetaString sentBy;

    private List<ComRosettaModelFieldWithMetaString> sentTo;

    public List<ComRosettaModelFieldWithMetaString> getCopyTo() {
        return copyTo;
    }

    public CdmEventWorkflowMessageInformation copyTo(List<ComRosettaModelFieldWithMetaString> copyTo) {
        this.copyTo = copyTo;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getMessageId() {
        return messageId;
    }

    public CdmEventWorkflowMessageInformation messageId(ComRosettaModelFieldWithMetaString messageId) {
        this.messageId = messageId;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getSentBy() {
        return sentBy;
    }

    public CdmEventWorkflowMessageInformation sentBy(ComRosettaModelFieldWithMetaString sentBy) {
        this.sentBy = sentBy;
        return this;
    }

    public List<ComRosettaModelFieldWithMetaString> getSentTo() {
        return sentTo;
    }

    public CdmEventWorkflowMessageInformation sentTo(List<ComRosettaModelFieldWithMetaString> sentTo) {
        this.sentTo = sentTo;
        return this;
    }

}
