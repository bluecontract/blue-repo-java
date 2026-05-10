package blue.repository.types;

import blue.repository.RepositoryType;

import blue.repository.v0_28_0.common.Currency;
import blue.repository.v0_28_0.common.Document;
import blue.repository.v0_28_0.common.DocumentAnchor;
import blue.repository.v0_28_0.common.DocumentAnchors;
import blue.repository.v0_28_0.common.NamedEvent;
import blue.repository.v0_28_0.common.Payment;
import blue.repository.v0_28_0.common.PermissionGrant;
import blue.repository.v0_28_0.common.Profile;
import blue.repository.v0_28_0.common.Record;
import blue.repository.v0_28_0.common.Relationship;
import blue.repository.v0_28_0.common.Request;
import blue.repository.v0_28_0.common.Response;
import blue.repository.v0_28_0.common.Service;
import blue.repository.v0_28_0.common.Space;
import blue.repository.v0_28_0.common.Task;
import blue.repository.v0_28_0.common.Timestamp;

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
