package blue.repository.v1_2_0.conversation;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("7jZFAkmthHTeg6zAu5kBCDHswd2J5HNVnYPo9y435sin")
public class DocumentRequest extends Source {
    public static String blueId() {
        return "7jZFAkmthHTeg6zAu5kBCDHswd2J5HNVnYPo9y435sin";
    }

    public static String packageName() {
        return "Conversation";
    }

    public static String typeName() {
        return "Document Request";
    }

    public static String qualifiedName() {
        return "Conversation/Document Request";
    }

    public static String resourcePath() {
        return "blue/repository/v1_2_0/definitions/Conversation/DocumentRequest.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String documentId;

    private BigInteger epoch;

    public String getDocumentId() {
        return documentId;
    }

    public DocumentRequest documentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    public BigInteger getEpoch() {
        return epoch;
    }

    public DocumentRequest epoch(BigInteger epoch) {
        this.epoch = epoch;
        return this;
    }

}
