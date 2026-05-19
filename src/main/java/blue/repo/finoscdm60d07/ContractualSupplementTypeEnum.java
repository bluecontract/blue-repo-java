package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("75EpF8N8xAmUAtSt9gqwxHs6v8pbMaKYMSVPTejyAmVr")
public class ContractualSupplementTypeEnum {
    public static String blueId() {
        return "75EpF8N8xAmUAtSt9gqwxHs6v8pbMaKYMSVPTejyAmVr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ContractualSupplementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ContractualSupplementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ContractualSupplementTypeEnum.json";
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

    public ContractualSupplementTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
