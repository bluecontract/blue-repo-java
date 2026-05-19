package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3XMYuzxpk73SmAUNvcJHcSwFyqSqD6zX7ydyVGRqJzvA")
public class TransferStatusEnum {
    public static String blueId() {
        return "3XMYuzxpk73SmAUNvcJHcSwFyqSqD6zX7ydyVGRqJzvA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TransferStatusEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TransferStatusEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/TransferStatusEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public TransferStatusEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
