package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("C8LuTs2p5b2raRR8GmQiyCERTmgxCpkYHVEEYrM46AKi")
public class CdmProductTemplateCancelableProvisionAdjustedDates {
    public static String blueId() {
        return "C8LuTs2p5b2raRR8GmQiyCERTmgxCpkYHVEEYrM46AKi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/CancelableProvisionAdjustedDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/CancelableProvisionAdjustedDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateCancelableProvisionAdjustedDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductTemplateCancellationEvent> cancellationEvent;

    public List<CdmProductTemplateCancellationEvent> getCancellationEvent() {
        return cancellationEvent;
    }

    public CdmProductTemplateCancelableProvisionAdjustedDates cancellationEvent(List<CdmProductTemplateCancellationEvent> cancellationEvent) {
        this.cancellationEvent = cancellationEvent;
        return this;
    }

}
