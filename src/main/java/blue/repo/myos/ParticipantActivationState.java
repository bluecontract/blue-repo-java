package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CocmZUt2K7LuGukwuPSAFC7EFo5HZonozAm4tUsSmuFB")
public class ParticipantActivationState {
    public static String blueId() {
        return "CocmZUt2K7LuGukwuPSAFC7EFo5HZonozAm4tUsSmuFB";
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
