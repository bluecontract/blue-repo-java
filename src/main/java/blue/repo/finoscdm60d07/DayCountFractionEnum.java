package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5bZzUQNsNnzkmG2eE3m4swRuEC1fmuR47tVB1LXC7Hvt")
public class DayCountFractionEnum {
    public static String blueId() {
        return "5bZzUQNsNnzkmG2eE3m4swRuEC1fmuR47tVB1LXC7Hvt";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DayCountFractionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DayCountFractionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DayCountFractionEnum.json";
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

    public DayCountFractionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
