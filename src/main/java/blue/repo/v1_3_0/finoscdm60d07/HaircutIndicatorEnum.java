package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FmMeLshtR2TiGNydbXVUYvb5cgzKLqgxmnjV3MpLiXwh")
public class HaircutIndicatorEnum {
    public static String blueId() {
        return "FmMeLshtR2TiGNydbXVUYvb5cgzKLqgxmnjV3MpLiXwh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "HaircutIndicatorEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/HaircutIndicatorEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/HaircutIndicatorEnum.json";
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

    public HaircutIndicatorEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
