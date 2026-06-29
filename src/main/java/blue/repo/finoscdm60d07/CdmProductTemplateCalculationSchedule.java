package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GbAmo8bxznHkBwFWFP6JMXCQEsWMyu9iKFV2KtBqH1rP")
public class CdmProductTemplateCalculationSchedule {
    public static String blueId() {
        return "GbAmo8bxznHkBwFWFP6JMXCQEsWMyu9iKFV2KtBqH1rP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/CalculationSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/CalculationSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateCalculationSchedule.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductTemplateSchedulePeriod> schedulePeriod;

    public List<CdmProductTemplateSchedulePeriod> getSchedulePeriod() {
        return schedulePeriod;
    }

    public CdmProductTemplateCalculationSchedule schedulePeriod(List<CdmProductTemplateSchedulePeriod> schedulePeriod) {
        this.schedulePeriod = schedulePeriod;
        return this;
    }

}
