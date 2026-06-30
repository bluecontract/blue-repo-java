package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ArGvahFJrYAsyvSVWtuLJVsoGkZsS1n9aTjxhikFUxJM")
public class CdmBaseDatetimeDateRange {
    public static String blueId() {
        return "ArGvahFJrYAsyvSVWtuLJVsoGkZsS1n9aTjxhikFUxJM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/DateRange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/DateRange";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeDateRange.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String endDate;

    private String startDate;

    public String getEndDate() {
        return endDate;
    }

    public CdmBaseDatetimeDateRange endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public CdmBaseDatetimeDateRange startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
