package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9DjMxCyKoRcgsxrjS6oShFYVkXrehAg9EwNKW4uvEAai")
public class RatingPriorityResolutionEnum {
    public static String blueId() {
        return "9DjMxCyKoRcgsxrjS6oShFYVkXrehAg9EwNKW4uvEAai";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RatingPriorityResolutionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RatingPriorityResolutionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/RatingPriorityResolutionEnum.json";
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

    public RatingPriorityResolutionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
