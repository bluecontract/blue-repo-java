package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HZmoSFgPTJDpgvQbhrw415z735PsqkkNK7AhockdXE35")
public class CdmEventWorkflowCustomisedWorkflow {
    public static String blueId() {
        return "HZmoSFgPTJDpgvQbhrw415z735PsqkkNK7AhockdXE35";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/CustomisedWorkflow";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/CustomisedWorkflow";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowCustomisedWorkflow.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String itemName;

    private String itemValue;

    public String getItemName() {
        return itemName;
    }

    public CdmEventWorkflowCustomisedWorkflow itemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public String getItemValue() {
        return itemValue;
    }

    public CdmEventWorkflowCustomisedWorkflow itemValue(String itemValue) {
        this.itemValue = itemValue;
        return this;
    }

}
