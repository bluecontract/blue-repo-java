package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Status;
import java.math.BigInteger;

@TypeBlueId("6cS7BANfxw87QmcKvCMUHxAQoqHuBmKMED1vWzk79BxJ")
public class Mandate {
    public static String blueId() {
        return "6cS7BANfxw87QmcKvCMUHxAQoqHuBmKMED1vWzk79BxJ";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Mandate";
    }

    public static String qualifiedName() {
        return "Mandate/Mandate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/Mandate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node contracts;

    private Status status;

    private String initializationError;

    private Boolean activateOnAuthorityConfirmation;

    private BigInteger authorityConfirmedAt;

    private BigInteger activatedAt;

    private BigInteger terminatedAt;

    private MandateValidation validation;

    public Node getContracts() {
        return contracts;
    }

    public Mandate contracts(Node contracts) {
        this.contracts = contracts;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Mandate status(Status status) {
        this.status = status;
        return this;
    }

    public String getInitializationError() {
        return initializationError;
    }

    public Mandate initializationError(String initializationError) {
        this.initializationError = initializationError;
        return this;
    }

    public Boolean getActivateOnAuthorityConfirmation() {
        return activateOnAuthorityConfirmation;
    }

    public Mandate activateOnAuthorityConfirmation(Boolean activateOnAuthorityConfirmation) {
        this.activateOnAuthorityConfirmation = activateOnAuthorityConfirmation;
        return this;
    }

    public BigInteger getAuthorityConfirmedAt() {
        return authorityConfirmedAt;
    }

    public Mandate authorityConfirmedAt(BigInteger authorityConfirmedAt) {
        this.authorityConfirmedAt = authorityConfirmedAt;
        return this;
    }

    public BigInteger getActivatedAt() {
        return activatedAt;
    }

    public Mandate activatedAt(BigInteger activatedAt) {
        this.activatedAt = activatedAt;
        return this;
    }

    public BigInteger getTerminatedAt() {
        return terminatedAt;
    }

    public Mandate terminatedAt(BigInteger terminatedAt) {
        this.terminatedAt = terminatedAt;
        return this;
    }

    public MandateValidation getValidation() {
        return validation;
    }

    public Mandate validation(MandateValidation validation) {
        this.validation = validation;
        return this;
    }

}
