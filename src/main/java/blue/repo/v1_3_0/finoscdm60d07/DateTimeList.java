package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7UaNF1Yq4jP6h5B5dFp3hEZ4zzMDqqQSmXTg8cFTSFiC")
public class DateTimeList {
    public static String blueId() {
        return "7UaNF1Yq4jP6h5B5dFp3hEZ4zzMDqqQSmXTg8cFTSFiC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DateTimeList";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DateTimeList";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DateTimeList.json";
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

    private List<String> dateTime;

    public String getNamespace() {
        return namespace;
    }

    public DateTimeList namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<String> getDateTime() {
        return dateTime;
    }

    public DateTimeList dateTime(List<String> dateTime) {
        this.dateTime = dateTime;
        return this;
    }

}
