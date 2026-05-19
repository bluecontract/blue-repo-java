package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FdmoFT58cVyJWxxQ9TkompkAPqgnKYxeQLoU9U8xjqsY")
public class FinalPrincipalExchangeCalculationEnum {
    public static String blueId() {
        return "FdmoFT58cVyJWxxQ9TkompkAPqgnKYxeQLoU9U8xjqsY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FinalPrincipalExchangeCalculationEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FinalPrincipalExchangeCalculationEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FinalPrincipalExchangeCalculationEnum.json";
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

    public FinalPrincipalExchangeCalculationEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
