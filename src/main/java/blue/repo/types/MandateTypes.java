package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.mandate.DocumentResponderMandate;
import blue.repo.mandate.Mandate;
import blue.repo.mandate.MandateActivated;
import blue.repo.mandate.MandateActivationRequested;
import blue.repo.mandate.MandateAuthority;
import blue.repo.mandate.MandateAuthorityConfirmed;
import blue.repo.mandate.MandateTerminated;
import blue.repo.mandate.MandateTerminationRequested;
import blue.repo.mandate.OperationMandate;
import blue.repo.mandate.StatusActive;
import blue.repo.mandate.StatusAuthorityConfirmed;
import blue.repo.mandate.StatusTerminated;

public final class MandateTypes {
    public static final RepositoryType DOCUMENT_RESPONDER_MANDATE = DocumentResponderMandate.repositoryType();

    public static final RepositoryType MANDATE = Mandate.repositoryType();

    public static final RepositoryType MANDATE_ACTIVATED = MandateActivated.repositoryType();

    public static final RepositoryType MANDATE_ACTIVATION_REQUESTED = MandateActivationRequested.repositoryType();

    public static final RepositoryType MANDATE_AUTHORITY = MandateAuthority.repositoryType();

    public static final RepositoryType MANDATE_AUTHORITY_CONFIRMED = MandateAuthorityConfirmed.repositoryType();

    public static final RepositoryType MANDATE_TERMINATED = MandateTerminated.repositoryType();

    public static final RepositoryType MANDATE_TERMINATION_REQUESTED = MandateTerminationRequested.repositoryType();

    public static final RepositoryType OPERATION_MANDATE = OperationMandate.repositoryType();

    public static final RepositoryType STATUS_ACTIVE = StatusActive.repositoryType();

    public static final RepositoryType STATUS_AUTHORITY_CONFIRMED = StatusAuthorityConfirmed.repositoryType();

    public static final RepositoryType STATUS_TERMINATED = StatusTerminated.repositoryType();

    private MandateTypes() {
    }
}
