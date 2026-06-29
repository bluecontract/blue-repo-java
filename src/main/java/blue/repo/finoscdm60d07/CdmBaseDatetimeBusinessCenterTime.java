package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4Mi73c2rJbGTBeaTVi4xUgW33QBxsUyxSSV6ELoqnP4j")
public class CdmBaseDatetimeBusinessCenterTime {
    public static String blueId() {
        return "4Mi73c2rJbGTBeaTVi4xUgW33QBxsUyxSSV6ELoqnP4j";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/BusinessCenterTime";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/BusinessCenterTime";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeBusinessCenterTime.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeFieldWithMetaBusinessCenterEnum businessCenter;

    private String hourMinuteTime;

    public CdmBaseDatetimeFieldWithMetaBusinessCenterEnum getBusinessCenter() {
        return businessCenter;
    }

    public CdmBaseDatetimeBusinessCenterTime businessCenter(CdmBaseDatetimeFieldWithMetaBusinessCenterEnum businessCenter) {
        this.businessCenter = businessCenter;
        return this;
    }

    public String getHourMinuteTime() {
        return hourMinuteTime;
    }

    public CdmBaseDatetimeBusinessCenterTime hourMinuteTime(String hourMinuteTime) {
        this.hourMinuteTime = hourMinuteTime;
        return this;
    }

}
