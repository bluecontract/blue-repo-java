package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8ZhZC2EwhTqHnDvvcr2ZW4iwCBJM57NcLAqPCd8shypq")
public class CdmBaseDatetimeBusinessDayAdjustments {
    public static String blueId() {
        return "8ZhZC2EwhTqHnDvvcr2ZW4iwCBJM57NcLAqPCd8shypq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/BusinessDayAdjustments";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/BusinessDayAdjustments";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeBusinessDayAdjustments.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeBusinessCenters businessCenters;

    private CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention;

    public CdmBaseDatetimeBusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    public CdmBaseDatetimeBusinessDayAdjustments businessCenters(CdmBaseDatetimeBusinessCenters businessCenters) {
        this.businessCenters = businessCenters;
        return this;
    }

    public CdmBaseDatetimeBusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    public CdmBaseDatetimeBusinessDayAdjustments businessDayConvention(CdmBaseDatetimeBusinessDayConventionEnum businessDayConvention) {
        this.businessDayConvention = businessDayConvention;
        return this;
    }

}
