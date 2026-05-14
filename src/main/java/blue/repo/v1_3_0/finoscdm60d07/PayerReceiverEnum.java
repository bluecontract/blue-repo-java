package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9bXcaYmwvkS3KCJb3p6Sds4vZCPM9BdeunpoKUjkrnNh")
public class PayerReceiverEnum {
    public static String blueId() {
        return "9bXcaYmwvkS3KCJb3p6Sds4vZCPM9BdeunpoKUjkrnNh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PayerReceiverEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PayerReceiverEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PayerReceiverEnum.json";
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

    public PayerReceiverEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
