package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8263FoJffQsBgKonSHdAbx6HRAVHKE13FmX7GNgYZaVF")
public class TradeIdentifierTypeEnum {
    public static String blueId() {
        return "8263FoJffQsBgKonSHdAbx6HRAVHKE13FmX7GNgYZaVF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TradeIdentifierTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TradeIdentifierTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TradeIdentifierTypeEnum.json";
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

    public TradeIdentifierTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
