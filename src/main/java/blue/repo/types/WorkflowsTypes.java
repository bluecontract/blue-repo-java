package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.workflows.AcceptChangeOperation;
import blue.repo.workflows.AcceptChangeWorkflow;
import blue.repo.workflows.ChangeOperation;
import blue.repo.workflows.ChangeRequest;
import blue.repo.workflows.ChangeWorkflow;
import blue.repo.workflows.ContractsChangePolicy;
import blue.repo.workflows.CustomerConsent;
import blue.repo.workflows.DocumentSection;
import blue.repo.workflows.DocumentSectionChangeEntry;
import blue.repo.workflows.DocumentSectionChanges;
import blue.repo.workflows.ProposeChangeOperation;
import blue.repo.workflows.ProposeChangeWorkflow;
import blue.repo.workflows.ProposedChangeInvalid;
import blue.repo.workflows.RejectChangeOperation;
import blue.repo.workflows.RejectChangeWorkflow;

public final class WorkflowsTypes {
    public static final RepositoryType ACCEPT_CHANGE_OPERATION = AcceptChangeOperation.repositoryType();

    public static final RepositoryType ACCEPT_CHANGE_WORKFLOW = AcceptChangeWorkflow.repositoryType();

    public static final RepositoryType CHANGE_OPERATION = ChangeOperation.repositoryType();

    public static final RepositoryType CHANGE_REQUEST = ChangeRequest.repositoryType();

    public static final RepositoryType CHANGE_WORKFLOW = ChangeWorkflow.repositoryType();

    public static final RepositoryType CONTRACTS_CHANGE_POLICY = ContractsChangePolicy.repositoryType();

    public static final RepositoryType CUSTOMER_CONSENT = CustomerConsent.repositoryType();

    public static final RepositoryType DOCUMENT_SECTION = DocumentSection.repositoryType();

    public static final RepositoryType DOCUMENT_SECTION_CHANGE_ENTRY = DocumentSectionChangeEntry.repositoryType();

    public static final RepositoryType DOCUMENT_SECTION_CHANGES = DocumentSectionChanges.repositoryType();

    public static final RepositoryType PROPOSE_CHANGE_OPERATION = ProposeChangeOperation.repositoryType();

    public static final RepositoryType PROPOSE_CHANGE_WORKFLOW = ProposeChangeWorkflow.repositoryType();

    public static final RepositoryType PROPOSED_CHANGE_INVALID = ProposedChangeInvalid.repositoryType();

    public static final RepositoryType REJECT_CHANGE_OPERATION = RejectChangeOperation.repositoryType();

    public static final RepositoryType REJECT_CHANGE_WORKFLOW = RejectChangeWorkflow.repositoryType();

    private WorkflowsTypes() {
    }
}
