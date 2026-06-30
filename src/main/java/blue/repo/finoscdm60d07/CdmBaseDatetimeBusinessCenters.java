package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("H53mV1d8rMzhefLZH8WzGchozyQA28cbwNpBHGmVA9ti")
public class CdmBaseDatetimeBusinessCenters {
    public static String blueId() {
        return "H53mV1d8rMzhefLZH8WzGchozyQA28cbwNpBHGmVA9ti";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/BusinessCenters";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/BusinessCenters";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeBusinessCenters.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseDatetimeFieldWithMetaBusinessCenterEnum> businessCenter;

    private CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters businessCentersReference;

    private List<CdmBaseDatetimeFieldWithMetaCommodityBusinessCalendarEnum> commodityBusinessCalendar;

    public List<CdmBaseDatetimeFieldWithMetaBusinessCenterEnum> getBusinessCenter() {
        return businessCenter;
    }

    public CdmBaseDatetimeBusinessCenters businessCenter(List<CdmBaseDatetimeFieldWithMetaBusinessCenterEnum> businessCenter) {
        this.businessCenter = businessCenter;
        return this;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters getBusinessCentersReference() {
        return businessCentersReference;
    }

    public CdmBaseDatetimeBusinessCenters businessCentersReference(CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessCenters businessCentersReference) {
        this.businessCentersReference = businessCentersReference;
        return this;
    }

    public List<CdmBaseDatetimeFieldWithMetaCommodityBusinessCalendarEnum> getCommodityBusinessCalendar() {
        return commodityBusinessCalendar;
    }

    public CdmBaseDatetimeBusinessCenters commodityBusinessCalendar(List<CdmBaseDatetimeFieldWithMetaCommodityBusinessCalendarEnum> commodityBusinessCalendar) {
        this.commodityBusinessCalendar = commodityBusinessCalendar;
        return this;
    }

}
