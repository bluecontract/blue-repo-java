package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3VxAg9cA9onwdJoxhBB5kEdwqKLqxsmhNk3MY7upD6KS")
public class CdmBaseDatetimeDayOfWeekEnum {
    public static String blueId() {
        return "3VxAg9cA9onwdJoxhBB5kEdwqKLqxsmhNk3MY7upD6KS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/DayOfWeekEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/DayOfWeekEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeDayOfWeekEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
