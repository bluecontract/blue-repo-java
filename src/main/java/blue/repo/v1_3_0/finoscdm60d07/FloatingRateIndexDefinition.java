package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("79yaCEsoJqggDzUCy9GhDgNDUWoeoyemBmG7oRSLLXvX")
public class FloatingRateIndexDefinition {
    public static String blueId() {
        return "79yaCEsoJqggDzUCy9GhDgNDUWoeoyemBmG7oRSLLXvX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateIndexDefinition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateIndexDefinition";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FloatingRateIndexDefinition.json";
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

    private FloatingRateIndexCalculationDefaults calculationDefaults;

    private FloatingRateIndexIdentification fro;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateIndexDefinition namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FloatingRateIndexCalculationDefaults getCalculationDefaults() {
        return calculationDefaults;
    }

    public FloatingRateIndexDefinition calculationDefaults(FloatingRateIndexCalculationDefaults calculationDefaults) {
        this.calculationDefaults = calculationDefaults;
        return this;
    }

    public FloatingRateIndexIdentification getFro() {
        return fro;
    }

    public FloatingRateIndexDefinition fro(FloatingRateIndexIdentification fro) {
        this.fro = fro;
        return this;
    }

}
