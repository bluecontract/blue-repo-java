package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Gnv2JatHomC6ZL7YnSSsr5b8Qx1hWWGYFQocqArJgJCj")
public class CdmBaseDatetimePeriodRange {
    public static String blueId() {
        return "Gnv2JatHomC6ZL7YnSSsr5b8Qx1hWWGYFQocqArJgJCj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/PeriodRange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/PeriodRange";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimePeriodRange.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimePeriodBound lowerBound;

    private CdmBaseDatetimePeriodBound upperBound;

    public CdmBaseDatetimePeriodBound getLowerBound() {
        return lowerBound;
    }

    public CdmBaseDatetimePeriodRange lowerBound(CdmBaseDatetimePeriodBound lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    public CdmBaseDatetimePeriodBound getUpperBound() {
        return upperBound;
    }

    public CdmBaseDatetimePeriodRange upperBound(CdmBaseDatetimePeriodBound upperBound) {
        this.upperBound = upperBound;
        return this;
    }

}
