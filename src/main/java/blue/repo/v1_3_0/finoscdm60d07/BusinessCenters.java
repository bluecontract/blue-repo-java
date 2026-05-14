package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HujWuka613tVBGR9SknuY73FEbD163xzBbEmUfRCTtF9")
public class BusinessCenters {
    public static String blueId() {
        return "HujWuka613tVBGR9SknuY73FEbD163xzBbEmUfRCTtF9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BusinessCenters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BusinessCenters";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BusinessCenters.json";
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

    private List<FieldWithMetaBusinessCenterEnum> businessCenter;

    private ReferenceWithMetaBusinessCenters businessCentersReference;

    private List<FieldWithMetaCommodityBusinessCalendarEnum> commodityBusinessCalendar;

    public String getNamespace() {
        return namespace;
    }

    public BusinessCenters namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<FieldWithMetaBusinessCenterEnum> getBusinessCenter() {
        return businessCenter;
    }

    public BusinessCenters businessCenter(List<FieldWithMetaBusinessCenterEnum> businessCenter) {
        this.businessCenter = businessCenter;
        return this;
    }

    public ReferenceWithMetaBusinessCenters getBusinessCentersReference() {
        return businessCentersReference;
    }

    public BusinessCenters businessCentersReference(ReferenceWithMetaBusinessCenters businessCentersReference) {
        this.businessCentersReference = businessCentersReference;
        return this;
    }

    public List<FieldWithMetaCommodityBusinessCalendarEnum> getCommodityBusinessCalendar() {
        return commodityBusinessCalendar;
    }

    public BusinessCenters commodityBusinessCalendar(List<FieldWithMetaCommodityBusinessCalendarEnum> commodityBusinessCalendar) {
        this.commodityBusinessCalendar = commodityBusinessCalendar;
        return this;
    }

}
