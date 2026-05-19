package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AnLRDB9DjaRT1NysLrKRGZY4ggbGDxBHd4MnXp87pRZS")
public class PeriodBound {
    public static String blueId() {
        return "AnLRDB9DjaRT1NysLrKRGZY4ggbGDxBHd4MnXp87pRZS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PeriodBound";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PeriodBound";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PeriodBound.json";
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

    private Boolean inclusive;

    private Period period;

    public String getNamespace() {
        return namespace;
    }

    public PeriodBound namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getInclusive() {
        return inclusive;
    }

    public PeriodBound inclusive(Boolean inclusive) {
        this.inclusive = inclusive;
        return this;
    }

    public Period getPeriod() {
        return period;
    }

    public PeriodBound period(Period period) {
        this.period = period;
        return this;
    }

}
