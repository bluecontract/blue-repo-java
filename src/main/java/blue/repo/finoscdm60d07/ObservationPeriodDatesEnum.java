package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Cs39MqGCjYp48q5oCZQHoWFDyjbdSmu78dAqyxBCUyzX")
public class ObservationPeriodDatesEnum {
    public static String blueId() {
        return "Cs39MqGCjYp48q5oCZQHoWFDyjbdSmu78dAqyxBCUyzX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ObservationPeriodDatesEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ObservationPeriodDatesEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ObservationPeriodDatesEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public ObservationPeriodDatesEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
