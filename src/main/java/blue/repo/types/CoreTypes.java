package blue.repo.types;

import blue.repo.RepositoryType;

import blue.repo.v1_2_0.core.Channel;
import blue.repo.v1_2_0.core.ChannelEventCheckpoint;
import blue.repo.v1_2_0.core.Contract;
import blue.repo.v1_2_0.core.DocumentProcessingInitiated;
import blue.repo.v1_2_0.core.DocumentProcessingTerminated;
import blue.repo.v1_2_0.core.DocumentUpdate;
import blue.repo.v1_2_0.core.DocumentUpdateChannel;
import blue.repo.v1_2_0.core.EmbeddedNodeChannel;
import blue.repo.v1_2_0.core.Handler;
import blue.repo.v1_2_0.core.JsonPatchEntry;
import blue.repo.v1_2_0.core.LifecycleEventChannel;
import blue.repo.v1_2_0.core.Marker;
import blue.repo.v1_2_0.core.ProcessEmbedded;
import blue.repo.v1_2_0.core.ProcessingInitializedMarker;
import blue.repo.v1_2_0.core.ProcessingTerminatedMarker;
import blue.repo.v1_2_0.core.TriggeredEventChannel;

public final class CoreTypes {
    public static final RepositoryType CHANNEL = Channel.repositoryType();

    public static final RepositoryType CHANNEL_EVENT_CHECKPOINT = ChannelEventCheckpoint.repositoryType();

    public static final RepositoryType CONTRACT = Contract.repositoryType();

    public static final RepositoryType DOCUMENT_PROCESSING_INITIATED = DocumentProcessingInitiated.repositoryType();

    public static final RepositoryType DOCUMENT_PROCESSING_TERMINATED = DocumentProcessingTerminated.repositoryType();

    public static final RepositoryType DOCUMENT_UPDATE = DocumentUpdate.repositoryType();

    public static final RepositoryType DOCUMENT_UPDATE_CHANNEL = DocumentUpdateChannel.repositoryType();

    public static final RepositoryType EMBEDDED_NODE_CHANNEL = EmbeddedNodeChannel.repositoryType();

    public static final RepositoryType HANDLER = Handler.repositoryType();

    public static final RepositoryType JSON_PATCH_ENTRY = JsonPatchEntry.repositoryType();

    public static final RepositoryType LIFECYCLE_EVENT_CHANNEL = LifecycleEventChannel.repositoryType();

    public static final RepositoryType MARKER = Marker.repositoryType();

    public static final RepositoryType PROCESS_EMBEDDED = ProcessEmbedded.repositoryType();

    public static final RepositoryType PROCESSING_INITIALIZED_MARKER = ProcessingInitializedMarker.repositoryType();

    public static final RepositoryType PROCESSING_TERMINATED_MARKER = ProcessingTerminatedMarker.repositoryType();

    public static final RepositoryType TRIGGERED_EVENT_CHANNEL = TriggeredEventChannel.repositoryType();

    private CoreTypes() {
    }
}
