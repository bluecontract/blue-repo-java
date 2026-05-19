package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8XDnNNnvC6eYrd8DMbHTpou6BNLP5dwv7X5Kc8odajNY")
public class CalculationShiftMethodEnum {
    public static String blueId() {
        return "8XDnNNnvC6eYrd8DMbHTpou6BNLP5dwv7X5Kc8odajNY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalculationShiftMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalculationShiftMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CalculationShiftMethodEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public CalculationShiftMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
