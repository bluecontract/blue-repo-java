package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("H8FoqsCvdVjmYfUUsd3UcZkUqwDiCdmiXzSYPXowAo8h")
public class AmountSchedule {
    public static String blueId() {
        return "H8FoqsCvdVjmYfUUsd3UcZkUqwDiCdmiXzSYPXowAo8h";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AmountSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AmountSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AmountSchedule.json";
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

    private List<FieldWithMetaString> currency;

    private List<DatedValue> datedValue;

    private Double val;

    public String getNamespace() {
        return namespace;
    }

    public AmountSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<FieldWithMetaString> getCurrency() {
        return currency;
    }

    public AmountSchedule currency(List<FieldWithMetaString> currency) {
        this.currency = currency;
        return this;
    }

    public List<DatedValue> getDatedValue() {
        return datedValue;
    }

    public AmountSchedule datedValue(List<DatedValue> datedValue) {
        this.datedValue = datedValue;
        return this;
    }

    public Double getVal() {
        return val;
    }

    public AmountSchedule val(Double val) {
        this.val = val;
        return this;
    }

}
