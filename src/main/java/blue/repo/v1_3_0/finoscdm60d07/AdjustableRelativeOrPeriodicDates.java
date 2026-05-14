package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6NoYrXzLpXe7TDKgr7Xrnjuut4E5CwQJwWm5DHNDKxwB")
public class AdjustableRelativeOrPeriodicDates {
    public static String blueId() {
        return "6NoYrXzLpXe7TDKgr7Xrnjuut4E5CwQJwWm5DHNDKxwB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AdjustableRelativeOrPeriodicDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AdjustableRelativeOrPeriodicDates";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AdjustableRelativeOrPeriodicDates.json";
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

    private AdjustableDates adjustableDates;

    private PeriodicDates periodicDates;

    private RelativeDates relativeDates;

    public String getNamespace() {
        return namespace;
    }

    public AdjustableRelativeOrPeriodicDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableDates getAdjustableDates() {
        return adjustableDates;
    }

    public AdjustableRelativeOrPeriodicDates adjustableDates(AdjustableDates adjustableDates) {
        this.adjustableDates = adjustableDates;
        return this;
    }

    public PeriodicDates getPeriodicDates() {
        return periodicDates;
    }

    public AdjustableRelativeOrPeriodicDates periodicDates(PeriodicDates periodicDates) {
        this.periodicDates = periodicDates;
        return this;
    }

    public RelativeDates getRelativeDates() {
        return relativeDates;
    }

    public AdjustableRelativeOrPeriodicDates relativeDates(RelativeDates relativeDates) {
        this.relativeDates = relativeDates;
        return this;
    }

}
