package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B1jbmCydm6iPiiWDcJtwjVFLxjfi2WDqvEyrztYahC7Z")
public class CdmProductTemplateKnock {
    public static String blueId() {
        return "B1jbmCydm6iPiiWDcJtwjVFLxjfi2WDqvEyrztYahC7Z";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/Knock";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/Knock";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateKnock.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableEventTriggerEvent knockIn;

    private CdmObservableEventTriggerEvent knockOut;

    public CdmObservableEventTriggerEvent getKnockIn() {
        return knockIn;
    }

    public CdmProductTemplateKnock knockIn(CdmObservableEventTriggerEvent knockIn) {
        this.knockIn = knockIn;
        return this;
    }

    public CdmObservableEventTriggerEvent getKnockOut() {
        return knockOut;
    }

    public CdmProductTemplateKnock knockOut(CdmObservableEventTriggerEvent knockOut) {
        this.knockOut = knockOut;
        return this;
    }

}
