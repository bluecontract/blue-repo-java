package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6ucmPrnAi2NaGgGBP8wE2dyrfhNrEWDLHH3Q8MpAT3UX")
public class RoundingFrequencyEnum {
    public static String blueId() {
        return "6ucmPrnAi2NaGgGBP8wE2dyrfhNrEWDLHH3Q8MpAT3UX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RoundingFrequencyEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RoundingFrequencyEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RoundingFrequencyEnum.json";
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

    public RoundingFrequencyEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
