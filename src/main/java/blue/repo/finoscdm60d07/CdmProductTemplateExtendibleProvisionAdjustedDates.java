package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DQQrQuJKE7UsmUgxYPbLeQ8cKAW52kt3TeHJBj752tYF")
public class CdmProductTemplateExtendibleProvisionAdjustedDates {
    public static String blueId() {
        return "DQQrQuJKE7UsmUgxYPbLeQ8cKAW52kt3TeHJBj752tYF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ExtendibleProvisionAdjustedDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ExtendibleProvisionAdjustedDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateExtendibleProvisionAdjustedDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductTemplateExtensionEvent> extensionEvent;

    public List<CdmProductTemplateExtensionEvent> getExtensionEvent() {
        return extensionEvent;
    }

    public CdmProductTemplateExtendibleProvisionAdjustedDates extensionEvent(List<CdmProductTemplateExtensionEvent> extensionEvent) {
        this.extensionEvent = extensionEvent;
        return this;
    }

}
