package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3SBNY5G5J9QapHWyf8F9xR8SiMkaAjsnz3WdtwoJEsSA")
public class CalculationSchedule {
    public static String blueId() {
        return "3SBNY5G5J9QapHWyf8F9xR8SiMkaAjsnz3WdtwoJEsSA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculationSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculationSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CalculationSchedule.json";
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

    private List<SchedulePeriod> schedulePeriod;

    public String getNamespace() {
        return namespace;
    }

    public CalculationSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<SchedulePeriod> getSchedulePeriod() {
        return schedulePeriod;
    }

    public CalculationSchedule schedulePeriod(List<SchedulePeriod> schedulePeriod) {
        this.schedulePeriod = schedulePeriod;
        return this;
    }

}
