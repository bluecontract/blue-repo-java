package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("J3ZEwQsemmM8Fz2EZTTTkFz6PuZttpBd2CAi7MNkkkqP")
public class MarginCallActionEnum {
    public static String blueId() {
        return "J3ZEwQsemmM8Fz2EZTTTkFz6PuZttpBd2CAi7MNkkkqP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MarginCallActionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MarginCallActionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MarginCallActionEnum.json";
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

    public MarginCallActionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
