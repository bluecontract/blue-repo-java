package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5FztK8LEabxgM4scSQjt3nPYnDnrndC8WDtkrCKtWy5e")
public class CdmEventWorkflowMetafieldsReferenceWithMetaWorkflowStep {
    public static String blueId() {
        return "5FztK8LEabxgM4scSQjt3nPYnDnrndC8WDtkrCKtWy5e";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/metafields/ReferenceWithMetaWorkflowStep";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/metafields/ReferenceWithMetaWorkflowStep";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowmetafieldsReferenceWithMetaWorkflowStep.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelLibMetaReference address;

    private String externalReference;

    private String globalReference;

    public ComRosettaModelLibMetaReference getAddress() {
        return address;
    }

    public CdmEventWorkflowMetafieldsReferenceWithMetaWorkflowStep address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmEventWorkflowMetafieldsReferenceWithMetaWorkflowStep externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmEventWorkflowMetafieldsReferenceWithMetaWorkflowStep globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
