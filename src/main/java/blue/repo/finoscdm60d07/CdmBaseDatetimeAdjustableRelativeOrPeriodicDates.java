package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GqMDcJT2X4pbkcA4TWqyfyLp2xKadMY8F8DW2abYfujx")
public class CdmBaseDatetimeAdjustableRelativeOrPeriodicDates {
    public static String blueId() {
        return "GqMDcJT2X4pbkcA4TWqyfyLp2xKadMY8F8DW2abYfujx";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/AdjustableRelativeOrPeriodicDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/AdjustableRelativeOrPeriodicDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeAdjustableRelativeOrPeriodicDates.json";
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

    private CdmBaseDatetimePeriodicDates periodicDates;

    private CdmBaseDatetimeRelativeDates relativeDates;

    public CdmBaseDatetimeAdjustableDates getAdjustableDates() {
        return adjustableDates;
    }

    public CdmBaseDatetimeAdjustableRelativeOrPeriodicDates adjustableDates(CdmBaseDatetimeAdjustableDates adjustableDates) {
        this.adjustableDates = adjustableDates;
        return this;
    }

    public CdmBaseDatetimePeriodicDates getPeriodicDates() {
        return periodicDates;
    }

    public CdmBaseDatetimeAdjustableRelativeOrPeriodicDates periodicDates(CdmBaseDatetimePeriodicDates periodicDates) {
        this.periodicDates = periodicDates;
        return this;
    }

    public CdmBaseDatetimeRelativeDates getRelativeDates() {
        return relativeDates;
    }

    public CdmBaseDatetimeAdjustableRelativeOrPeriodicDates relativeDates(CdmBaseDatetimeRelativeDates relativeDates) {
        this.relativeDates = relativeDates;
        return this;
    }

}
