package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("45Wv4ogpouwGvDwjrVuFyuVJncwL5JkeK8KcuBbzdgDr")
public class TimeZone {
    public static String blueId() {
        return "45Wv4ogpouwGvDwjrVuFyuVJncwL5JkeK8KcuBbzdgDr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TimeZone";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TimeZone";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TimeZone.json";
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

    private FieldWithMetaString location;

    private String time;

    public String getNamespace() {
        return namespace;
    }

    public TimeZone namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getLocation() {
        return location;
    }

    public TimeZone location(FieldWithMetaString location) {
        this.location = location;
        return this;
    }

    public String getTime() {
        return time;
    }

    public TimeZone time(String time) {
        this.time = time;
        return this;
    }

}
