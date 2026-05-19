package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("45JBD8yXKyGAxhZgFNqWcYdFKSga22GyGQZVYmHwPoeg")
public class Schedule {
    public static String blueId() {
        return "45JBD8yXKyGAxhZgFNqWcYdFKSga22GyGQZVYmHwPoeg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Schedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Schedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Schedule.json";
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

    private List<DatedValue> datedValue;

    private Double val;

    public String getNamespace() {
        return namespace;
    }

    public Schedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<DatedValue> getDatedValue() {
        return datedValue;
    }

    public Schedule datedValue(List<DatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public Schedule val(Double val) {
        this.val = val;
        return this;
    }

}
