package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("asEPKqKW6qKmwA9ywrWgbePzSEnqJfpu7GUm8sg6mZc")
public class CdmProductCollateralCollateralInterestNotification {
    public static String blueId() {
        return "asEPKqKW6qKmwA9ywrWgbePzSEnqJfpu7GUm8sg6mZc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CollateralInterestNotification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CollateralInterestNotification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateralInterestNotification.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeDayTypeEnum notificationDayType;

    private String notificationTime;

    private Double offset;

    private String trigger;

    public CdmBaseDatetimeDayTypeEnum getNotificationDayType() {
        return notificationDayType;
    }

    public CdmProductCollateralCollateralInterestNotification notificationDayType(CdmBaseDatetimeDayTypeEnum notificationDayType) {
        this.notificationDayType = notificationDayType;
        return this;
    }

    public String getNotificationTime() {
        return notificationTime;
    }

    public CdmProductCollateralCollateralInterestNotification notificationTime(String notificationTime) {
        this.notificationTime = notificationTime;
        return this;
    }

    public Double getOffset() {
        return offset;
    }

    public CdmProductCollateralCollateralInterestNotification offset(Double offset) {
        this.offset = offset;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public CdmProductCollateralCollateralInterestNotification trigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

}
