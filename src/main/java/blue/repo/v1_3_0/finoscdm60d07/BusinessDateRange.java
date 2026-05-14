package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HwkXPt7HALSThM7DRZPLAehRt24HBL3oCWd71G2XWvmc")
public class BusinessDateRange {
    public static String blueId() {
        return "HwkXPt7HALSThM7DRZPLAehRt24HBL3oCWd71G2XWvmc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BusinessDateRange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BusinessDateRange";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BusinessDateRange.json";
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

    private BusinessCenters businessCenters;

    private BusinessDayConventionEnum businessDayConvention;

    private String endDate;

    private String startDate;

    public String getNamespace() {
        return namespace;
    }

    public BusinessDateRange namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public BusinessDateRange businessCenters(BusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public BusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public BusinessDateRange businessDayConvention(BusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public BusinessDateRange endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public BusinessDateRange startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

}
