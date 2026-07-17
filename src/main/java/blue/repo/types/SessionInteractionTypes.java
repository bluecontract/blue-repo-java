package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.sessioninteraction.DocumentSessionReference;

public final class SessionInteractionTypes {
    public static final RepositoryType DOCUMENT_SESSION_REFERENCE = DocumentSessionReference.repositoryType();

    private SessionInteractionTypes() {
    }
}
