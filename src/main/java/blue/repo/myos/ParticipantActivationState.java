package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ASa82RtPSXwdys7M5Xs5s3brTjYgJmQqJt2uyraQGrNA")
public class ParticipantActivationState {
    public static String blueId() {
        return "ASa82RtPSXwdys7M5Xs5s3brTjYgJmQqJt2uyraQGrNA";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Participant Activation State";
    }

    public static String qualifiedName() {
        return "MyOS/Participant Activation State";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/ParticipantActivationState.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String accountStatus;

    private String errorMessage;

    public String getAccountStatus() {
        return accountStatus;
    }

    public ParticipantActivationState accountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public ParticipantActivationState errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

}
