package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7qWzLLd7yfdn7G6vuDuQWmmYkuns8LzjMPaFgmrS5pem")
public class EventTimestampQualificationEnum {
    public static String blueId() {
        return "7qWzLLd7yfdn7G6vuDuQWmmYkuns8LzjMPaFgmrS5pem";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EventTimestampQualificationEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EventTimestampQualificationEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/EventTimestampQualificationEnum.json";
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

    public EventTimestampQualificationEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
