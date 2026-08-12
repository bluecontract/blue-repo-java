package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("E9tgtxzW2aKM5cXBuZ4HZEsYRbKqjQQpVyxRWYXeF6UU")
public class CdmProductTemplateOptionalEarlyTerminationAdjustedDates {
    public static String blueId() {
        return "E9tgtxzW2aKM5cXBuZ4HZEsYRbKqjQQpVyxRWYXeF6UU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/OptionalEarlyTerminationAdjustedDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/OptionalEarlyTerminationAdjustedDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateOptionalEarlyTerminationAdjustedDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductTemplateEarlyTerminationEvent> earlyTerminationEvent;

    public List<CdmProductTemplateEarlyTerminationEvent> getEarlyTerminationEvent() {
        return earlyTerminationEvent;
    }

    public CdmProductTemplateOptionalEarlyTerminationAdjustedDates earlyTerminationEvent(List<CdmProductTemplateEarlyTerminationEvent> earlyTerminationEvent) {
        this.earlyTerminationEvent = earlyTerminationEvent;
        return this;
    }

}
