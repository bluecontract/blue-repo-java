package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HL2ZcMwczuHgPoUL75nm9XG9rZy6XeFMmzGuuWfqxkya")
public class CdmEventWorkflowPartyCustomisedWorkflow {
    public static String blueId() {
        return "HL2ZcMwczuHgPoUL75nm9XG9rZy6XeFMmzGuuWfqxkya";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/PartyCustomisedWorkflow";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/PartyCustomisedWorkflow";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowPartyCustomisedWorkflow.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventWorkflowCustomisedWorkflow> customisedWorkflow;

    private String partyName;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference;

    public List<CdmEventWorkflowCustomisedWorkflow> getCustomisedWorkflow() {
        return customisedWorkflow;
    }

    public CdmEventWorkflowPartyCustomisedWorkflow customisedWorkflow(List<CdmEventWorkflowCustomisedWorkflow> customisedWorkflow) {
        this.customisedWorkflow = customisedWorkflow;
        return this;
    }

    public String getPartyName() {
        return partyName;
    }

    public CdmEventWorkflowPartyCustomisedWorkflow partyName(String partyName) {
        this.partyName = partyName;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public CdmEventWorkflowPartyCustomisedWorkflow partyReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

}
