package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.bootstrap.DocumentBootstrap;
import blue.repo.bootstrap.DocumentBootstrapCompleted;
import blue.repo.bootstrap.DocumentBootstrapDeclined;
import blue.repo.bootstrap.DocumentBootstrapFailed;
import blue.repo.bootstrap.DocumentBootstrapInProgress;
import blue.repo.bootstrap.DocumentBootstrapRequested;
import blue.repo.bootstrap.ParticipantMapping;

public final class BootstrapTypes {
    public static final RepositoryType DOCUMENT_BOOTSTRAP = DocumentBootstrap.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_COMPLETED = DocumentBootstrapCompleted.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_DECLINED = DocumentBootstrapDeclined.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_FAILED = DocumentBootstrapFailed.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_IN_PROGRESS = DocumentBootstrapInProgress.repositoryType();

    public static final RepositoryType DOCUMENT_BOOTSTRAP_REQUESTED = DocumentBootstrapRequested.repositoryType();

    public static final RepositoryType PARTICIPANT_MAPPING = ParticipantMapping.repositoryType();

    private BootstrapTypes() {
    }
}
