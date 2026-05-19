package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8qPGBYrJCT28iQXH5mdbXHtMwrnMDWrQtp8hQ3udw1kP")
public class WorkflowStatusEnum {
    public static String blueId() {
        return "8qPGBYrJCT28iQXH5mdbXHtMwrnMDWrQtp8hQ3udw1kP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "WorkflowStatusEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/WorkflowStatusEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/WorkflowStatusEnum.json";
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

    public WorkflowStatusEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
