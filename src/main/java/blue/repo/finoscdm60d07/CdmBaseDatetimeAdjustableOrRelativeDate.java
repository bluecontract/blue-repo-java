package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9bWLoL1zcJYR9saaAKGg2PbRC5k5kMqn4CktUzBBfgeY")
public class CdmBaseDatetimeAdjustableOrRelativeDate {
    public static String blueId() {
        return "9bWLoL1zcJYR9saaAKGg2PbRC5k5kMqn4CktUzBBfgeY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/AdjustableOrRelativeDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/AdjustableOrRelativeDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeAdjustableOrRelativeDate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeAdjustableDate adjustableDate;

    private CdmBaseDatetimeAdjustedRelativeDateOffset relativeDate;

    public CdmBaseDatetimeAdjustableDate getAdjustableDate() {
        return adjustableDate;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate adjustableDate(CdmBaseDatetimeAdjustableDate adjustableDate) {
        this.adjustableDate = adjustableDate;
        return this;
    }

    public CdmBaseDatetimeAdjustedRelativeDateOffset getRelativeDate() {
        return relativeDate;
    }

    public CdmBaseDatetimeAdjustableOrRelativeDate relativeDate(CdmBaseDatetimeAdjustedRelativeDateOffset relativeDate) {
        this.relativeDate = relativeDate;
        return this;
    }

}
