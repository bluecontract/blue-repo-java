package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AKckorJXzh3TraVBt7fgB2UYS4F7o7AiKBpJZhs6UYWw")
public class ConcentrationLimit {
    public static String blueId() {
        return "AKckorJXzh3TraVBt7fgB2UYS4F7o7AiKBpJZhs6UYWw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ConcentrationLimit";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ConcentrationLimit";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ConcentrationLimit.json";
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

    private ConcentrationLimitCriteria concentrationLimitCriteria;

    private NumberRange percentageLimit;

    private MoneyRange valueLimit;

    public String getNamespace() {
        return namespace;
    }

    public ConcentrationLimit namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ConcentrationLimitCriteria getConcentrationLimitCriteria() {
        return concentrationLimitCriteria;
    }

    public ConcentrationLimit concentrationLimitCriteria(ConcentrationLimitCriteria concentrationLimitCriteria) {
        this.concentrationLimitCriteria = concentrationLimitCriteria;
        return this;
    }

    public NumberRange getPercentageLimit() {
        return percentageLimit;
    }

    public ConcentrationLimit percentageLimit(NumberRange percentageLimit) {
        this.percentageLimit = percentageLimit;
        return this;
    }

    public MoneyRange getValueLimit() {
        return valueLimit;
    }

    public ConcentrationLimit valueLimit(MoneyRange valueLimit) {
        this.valueLimit = valueLimit;
        return this;
    }

}
