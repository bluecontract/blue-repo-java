package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3f7FxDDC5EKcMUjj22rFMXxtnXKnmY2H48ch7MQHLEHx")
public class PartyCustomisedWorkflow {
    public static String blueId() {
        return "3f7FxDDC5EKcMUjj22rFMXxtnXKnmY2H48ch7MQHLEHx";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PartyCustomisedWorkflow";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PartyCustomisedWorkflow";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PartyCustomisedWorkflow.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private List<CustomisedWorkflow> customisedWorkflow;

    private String partyName;

    private ReferenceWithMetaParty partyReference;

    public String getNamespace() {
        return namespace;
    }

    public PartyCustomisedWorkflow namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CustomisedWorkflow> getCustomisedWorkflow() {
        return customisedWorkflow;
    }

    public PartyCustomisedWorkflow customisedWorkflow(List<CustomisedWorkflow> customisedWorkflow) {
        this.customisedWorkflow = customisedWorkflow;
        return this;
    }

    public String getPartyName() {
        return partyName;
    }

    public PartyCustomisedWorkflow partyName(String partyName) {
        this.partyName = partyName;
        return this;
    }

    public ReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public PartyCustomisedWorkflow partyReference(ReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

}
