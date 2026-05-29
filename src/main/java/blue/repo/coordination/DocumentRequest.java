package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("8SXKDBF7Gmzcn9BwH3GxwUJMBCm8P7QJmXNyJpyreNUF")
public class DocumentRequest extends Source {
    public static String blueId() {
        return "8SXKDBF7Gmzcn9BwH3GxwUJMBCm8P7QJmXNyJpyreNUF";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Document Request";
    }

    public static String qualifiedName() {
        return "Coordination/Document Request";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/DocumentRequest.json";
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
