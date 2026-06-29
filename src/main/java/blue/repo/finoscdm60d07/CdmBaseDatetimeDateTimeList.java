package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("H5D8BrpdPx4G3A74ypfsUrC27hh6pjWVeJD3s6bkSu7e")
public class CdmBaseDatetimeDateTimeList {
    public static String blueId() {
        return "H5D8BrpdPx4G3A74ypfsUrC27hh6pjWVeJD3s6bkSu7e";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/DateTimeList";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/DateTimeList";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeDateTimeList.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<String> dateTime;

    public List<String> getDateTime() {
        return dateTime;
    }

    public CdmBaseDatetimeDateTimeList dateTime(List<String> dateTime) {
        this.dateTime = dateTime;
        return this;
    }

}
