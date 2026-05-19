package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Bzv5LPRTLNy54ignCbWxkGSAHQiZdTQJTTrBLSAs3YrN")
public class OptionExerciseStyleEnum {
    public static String blueId() {
        return "Bzv5LPRTLNy54ignCbWxkGSAHQiZdTQJTTrBLSAs3YrN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "OptionExerciseStyleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/OptionExerciseStyleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/OptionExerciseStyleEnum.json";
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

    public OptionExerciseStyleEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
