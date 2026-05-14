package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("A996rq4pNgTK8jvRHWSQby3Nti2W4XKhG2sdBdMSXX11")
public class CommodityInformationPublisherEnum {
    public static String blueId() {
        return "A996rq4pNgTK8jvRHWSQby3Nti2W4XKhG2sdBdMSXX11";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CommodityInformationPublisherEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CommodityInformationPublisherEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CommodityInformationPublisherEnum.json";
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

    public CommodityInformationPublisherEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
