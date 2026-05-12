package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.v1_2_0.common.Currency;
import blue.repo.v1_2_0.common.Document;
import blue.repo.v1_2_0.common.DocumentAnchor;
import blue.repo.v1_2_0.common.DocumentAnchors;
import blue.repo.v1_2_0.common.NamedEvent;
import blue.repo.v1_2_0.common.Payment;
import blue.repo.v1_2_0.common.PermissionGrant;
import blue.repo.v1_2_0.common.Profile;
import blue.repo.v1_2_0.common.Record;
import blue.repo.v1_2_0.common.Relationship;
import blue.repo.v1_2_0.common.Request;
import blue.repo.v1_2_0.common.Response;
import blue.repo.v1_2_0.common.Service;
import blue.repo.v1_2_0.common.Space;
import blue.repo.v1_2_0.common.Task;
import blue.repo.v1_2_0.common.Timestamp;

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
