package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9ja4Y6ZsrJYXkYCduVRg8YpvGsJ7e9hLXqbuyqKpemJU")
public class RollSourceCalendarEnum {
    public static String blueId() {
        return "9ja4Y6ZsrJYXkYCduVRg8YpvGsJ7e9hLXqbuyqKpemJU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RollSourceCalendarEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RollSourceCalendarEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RollSourceCalendarEnum.json";
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

    public RollSourceCalendarEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
