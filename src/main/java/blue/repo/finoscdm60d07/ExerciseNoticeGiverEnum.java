package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3yzK4FrNqQvJwf3kZZ1ZucnxCzjWgeaXkdqKR7SeGn82")
public class ExerciseNoticeGiverEnum {
    public static String blueId() {
        return "3yzK4FrNqQvJwf3kZZ1ZucnxCzjWgeaXkdqKR7SeGn82";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExerciseNoticeGiverEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExerciseNoticeGiverEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ExerciseNoticeGiverEnum.json";
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

    public ExerciseNoticeGiverEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
