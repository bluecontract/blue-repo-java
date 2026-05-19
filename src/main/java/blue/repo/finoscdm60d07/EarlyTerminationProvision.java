package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8xMKZNt7tnsUAjL5CdJSd7oXo7Fes8PUeN8oGwXnz1Ye")
public class EarlyTerminationProvision {
    public static String blueId() {
        return "8xMKZNt7tnsUAjL5CdJSd7oXo7Fes8PUeN8oGwXnz1Ye";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EarlyTerminationProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EarlyTerminationProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/EarlyTerminationProvision.json";
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

    private MandatoryEarlyTermination mandatoryEarlyTermination;

    private Period mandatoryEarlyTerminationDateTenor;

    private OptionalEarlyTermination optionalEarlyTermination;

    private ExercisePeriod optionalEarlyTerminationParameters;

    public String getNamespace() {
        return namespace;
    }

    public EarlyTerminationProvision namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MandatoryEarlyTermination getMandatoryEarlyTermination() {
        return mandatoryEarlyTermination;
    }

    public EarlyTerminationProvision mandatoryEarlyTermination(MandatoryEarlyTermination mandatoryEarlyTermination) {
        this.mandatoryEarlyTermination = mandatoryEarlyTermination;
        return this;
    }

    public Period getMandatoryEarlyTerminationDateTenor() {
        return mandatoryEarlyTerminationDateTenor;
    }

    public EarlyTerminationProvision mandatoryEarlyTerminationDateTenor(Period mandatoryEarlyTerminationDateTenor) {
        this.mandatoryEarlyTerminationDateTenor = mandatoryEarlyTerminationDateTenor;
        return this;
    }

    public OptionalEarlyTermination getOptionalEarlyTermination() {
        return optionalEarlyTermination;
    }

    public EarlyTerminationProvision optionalEarlyTermination(OptionalEarlyTermination optionalEarlyTermination) {
        this.optionalEarlyTermination = optionalEarlyTermination;
        return this;
    }

    public ExercisePeriod getOptionalEarlyTerminationParameters() {
        return optionalEarlyTerminationParameters;
    }

    public EarlyTerminationProvision optionalEarlyTerminationParameters(ExercisePeriod optionalEarlyTerminationParameters) {
        this.optionalEarlyTerminationParameters = optionalEarlyTerminationParameters;
        return this;
    }

}
