package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4a7o3vFE8XmyiKHpknQLrYF3NFsnbEWrQWHq6NxhexW9")
public class CdmBaseDatetimeAdjustableOrRelativeDates {
    public static String blueId() {
        return "4a7o3vFE8XmyiKHpknQLrYF3NFsnbEWrQWHq6NxhexW9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/AdjustableOrRelativeDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/AdjustableOrRelativeDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeAdjustableOrRelativeDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeAdjustableDates adjustableDates;

    private CdmBaseDatetimeRelativeDates relativeDates;

    public CdmBaseDatetimeAdjustableDates getAdjustableDates() {
        return adjustableDates;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDates adjustableDates(CdmBaseDatetimeAdjustableDates adjustableDates) {
        this.adjustableDates = adjustableDates;
        return this;
    }

    public CdmBaseDatetimeRelativeDates getRelativeDates() {
        return relativeDates;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDates relativeDates(CdmBaseDatetimeRelativeDates relativeDates) {
        this.relativeDates = relativeDates;
        return this;
    }

}
