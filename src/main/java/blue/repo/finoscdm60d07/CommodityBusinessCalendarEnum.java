package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7Eoz68wBSHAQKZXhptmjomDHuv1wimem7KyeroCtLPtC")
public class CommodityBusinessCalendarEnum {
    public static String blueId() {
        return "7Eoz68wBSHAQKZXhptmjomDHuv1wimem7KyeroCtLPtC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CommodityBusinessCalendarEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CommodityBusinessCalendarEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CommodityBusinessCalendarEnum.json";
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

    public CommodityBusinessCalendarEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
