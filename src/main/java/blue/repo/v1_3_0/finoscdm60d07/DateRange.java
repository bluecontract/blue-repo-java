package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Hr1gMyg4noKPeaNNvuGmm9hNG3WyMwgif8zaV3m5AMdU")
public class DateRange {
    public static String blueId() {
        return "Hr1gMyg4noKPeaNNvuGmm9hNG3WyMwgif8zaV3m5AMdU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DateRange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DateRange";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DateRange.json";
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

    private String endDate;

    private String startDate;

    public String getNamespace() {
        return namespace;
    }

    public DateRange namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public DateRange endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public DateRange startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
