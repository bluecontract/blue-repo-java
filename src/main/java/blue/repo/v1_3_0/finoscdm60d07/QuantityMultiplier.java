package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("221VuFFC6wFZrHpRHh1MU6JmqbrJ8k4mmH9uxU8Fy4mW")
public class QuantityMultiplier {
    public static String blueId() {
        return "221VuFFC6wFZrHpRHh1MU6JmqbrJ8k4mmH9uxU8Fy4mW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "QuantityMultiplier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/QuantityMultiplier";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/QuantityMultiplier.json";
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

    private FxLinkedNotionalSchedule fxLinkedNotionalSchedule;

    private Double multiplierValue;

    public String getNamespace() {
        return namespace;
    }

    public QuantityMultiplier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FxLinkedNotionalSchedule getFxLinkedNotionalSchedule() {
        return fxLinkedNotionalSchedule;
    }

    public QuantityMultiplier fxLinkedNotionalSchedule(FxLinkedNotionalSchedule fxLinkedNotionalSchedule) {
        this.fxLinkedNotionalSchedule = fxLinkedNotionalSchedule;
        return this;
    }

    public Double getMultiplierValue() {
        return multiplierValue;
    }

    public QuantityMultiplier multiplierValue(Double multiplierValue) {
        this.multiplierValue = multiplierValue;
        return this;
    }

}
