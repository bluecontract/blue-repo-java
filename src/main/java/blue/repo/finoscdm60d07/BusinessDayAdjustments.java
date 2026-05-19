package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G6NRh7uJ9nHqamG4NyjfGcr5Wfk3qujsowe9hwpvpBNp")
public class BusinessDayAdjustments {
    public static String blueId() {
        return "G6NRh7uJ9nHqamG4NyjfGcr5Wfk3qujsowe9hwpvpBNp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BusinessDayAdjustments";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BusinessDayAdjustments";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/BusinessDayAdjustments.json";
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

    public String getNamespace() {
        return namespace;
    }

    public BusinessDayAdjustments namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public BusinessDayAdjustments businessCenters(BusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public BusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public BusinessDayAdjustments businessDayConvention(BusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

}
