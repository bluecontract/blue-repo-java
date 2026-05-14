package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Bp1D8TiARCpUXzzraegSvfBF98cwP1n2VLWDr4XZStbV")
public class DateList {
    public static String blueId() {
        return "Bp1D8TiARCpUXzzraegSvfBF98cwP1n2VLWDr4XZStbV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DateList";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DateList";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DateList.json";
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

    private List<String> date;

    public String getNamespace() {
        return namespace;
    }

    public DateList namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<String> getDate() {
        return date;
    }

    public DateList date(List<String> date) {
        this.date = date;
        return this;
    }

}
