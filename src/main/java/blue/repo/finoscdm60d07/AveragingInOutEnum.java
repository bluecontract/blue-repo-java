package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B8ZkPC8LgnWiYdtm3qJZL6myfWoxgSFbRSTpw5EcqTAw")
public class AveragingInOutEnum {
    public static String blueId() {
        return "B8ZkPC8LgnWiYdtm3qJZL6myfWoxgSFbRSTpw5EcqTAw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AveragingInOutEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AveragingInOutEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AveragingInOutEnum.json";
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

    public AveragingInOutEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
