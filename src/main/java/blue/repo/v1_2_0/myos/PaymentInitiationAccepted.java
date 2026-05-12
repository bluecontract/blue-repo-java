package blue.repo.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.v1_2_0.conversation.Response;

@TypeBlueId("GiEwEdvT2jPoT4bK8hvmjTBJUVQqRtHoAejfdpM7HtuD")
public class PaymentInitiationAccepted extends Response {
    public static String blueId() {
        return "GiEwEdvT2jPoT4bK8hvmjTBJUVQqRtHoAejfdpM7HtuD";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Payment Initiation Accepted";
    }

    public static String qualifiedName() {
        return "MyOS/Payment Initiation Accepted";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/MyOS/PaymentInitiationAccepted.json";
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
