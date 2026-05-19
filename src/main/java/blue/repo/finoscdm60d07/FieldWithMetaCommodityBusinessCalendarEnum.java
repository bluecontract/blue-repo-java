package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HwvjSsLi4YiJyxebuw3fRGRgwmLSPLhtuYwahUNMGuRr")
public class FieldWithMetaCommodityBusinessCalendarEnum {
    public static String blueId() {
        return "HwvjSsLi4YiJyxebuw3fRGRgwmLSPLhtuYwahUNMGuRr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaCommodityBusinessCalendarEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaCommodityBusinessCalendarEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FieldWithMetaCommodityBusinessCalendarEnum.json";
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

    private MetaFields meta;

    private CommodityBusinessCalendarEnum val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaCommodityBusinessCalendarEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaCommodityBusinessCalendarEnum meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CommodityBusinessCalendarEnum getVal() {
        return val;
    }

    public FieldWithMetaCommodityBusinessCalendarEnum val(CommodityBusinessCalendarEnum val) {
        this.val = val;
        return this;
    }

}
