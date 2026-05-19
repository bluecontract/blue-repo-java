package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9Y1NbEENvWeFGRJD3MfHDuKEh2dK3eRi3XbRvD7JdiF4")
public class EventIntentEnum {
    public static String blueId() {
        return "9Y1NbEENvWeFGRJD3MfHDuKEh2dK3eRi3XbRvD7JdiF4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EventIntentEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EventIntentEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/EventIntentEnum.json";
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

    public EventIntentEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
