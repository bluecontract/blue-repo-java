package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.common.Currency;
import blue.repo.common.Document;
import blue.repo.common.DocumentAnchor;
import blue.repo.common.DocumentAnchors;
import blue.repo.common.NamedEvent;
import blue.repo.common.Payment;
import blue.repo.common.PermissionGrant;
import blue.repo.common.Profile;
import blue.repo.common.Record;
import blue.repo.common.Relationship;
import blue.repo.common.Request;
import blue.repo.common.Response;
import blue.repo.common.Service;
import blue.repo.common.Space;
import blue.repo.common.Task;
import blue.repo.common.Timestamp;

public final class CommonTypes {
    public static final RepositoryType CURRENCY = Currency.repositoryType();

    public static final RepositoryType DOCUMENT = Document.repositoryType();

    public static final RepositoryType DOCUMENT_ANCHOR = DocumentAnchor.repositoryType();

    public static final RepositoryType DOCUMENT_ANCHORS = DocumentAnchors.repositoryType();

    public static final RepositoryType NAMED_EVENT = NamedEvent.repositoryType();

    public static final RepositoryType PAYMENT = Payment.repositoryType();

    public static final RepositoryType PERMISSIONGRANT = PermissionGrant.repositoryType();

    public static final RepositoryType PROFILE = Profile.repositoryType();

    public static final RepositoryType RECORD = Record.repositoryType();

    public static final RepositoryType RELATIONSHIP = Relationship.repositoryType();

    public static final RepositoryType REQUEST = Request.repositoryType();

    public static final RepositoryType RESPONSE = Response.repositoryType();

    public static final RepositoryType SERVICE = Service.repositoryType();

    public static final RepositoryType SPACE = Space.repositoryType();

    public static final RepositoryType TASK = Task.repositoryType();

    public static final RepositoryType TIMESTAMP = Timestamp.repositoryType();

    private CommonTypes() {
    }
}
