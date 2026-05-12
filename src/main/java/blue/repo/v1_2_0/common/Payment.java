package blue.repo.v1_2_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DoDF7Hm2Ss7ikirPwXZ7KFiWNmdwtb53vHCSwYFbCdPk")
public class Payment extends Document {
    public static String blueId() {
        return "DoDF7Hm2Ss7ikirPwXZ7KFiWNmdwtb53vHCSwYFbCdPk";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Payment";
    }

    public static String qualifiedName() {
        return "Common/Payment";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Common/Payment.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
