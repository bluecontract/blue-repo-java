package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("J8YqYTvsvrtUpyfhMitXRAvSnwAHD1voVLbenrucUSQf")
public class CreditRiskEnum {
    public static String blueId() {
        return "J8YqYTvsvrtUpyfhMitXRAvSnwAHD1voVLbenrucUSQf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditRiskEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditRiskEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditRiskEnum.json";
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

    public CreditRiskEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
