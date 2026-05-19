package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GRWraXZoBe38w1dT13SQg7CMb4xBJkC6uq1R3K1XR5Yh")
public class CollateralInterestNotification {
    public static String blueId() {
        return "GRWraXZoBe38w1dT13SQg7CMb4xBJkC6uq1R3K1XR5Yh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralInterestNotification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralInterestNotification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralInterestNotification.json";
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

    private DayTypeEnum notificationDayType;

    private String notificationTime;

    private Double offset;

    private String trigger;

    public String getNamespace() {
        return namespace;
    }

    public CollateralInterestNotification namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DayTypeEnum getNotificationDayType() {
        return notificationDayType;
    }

    public CollateralInterestNotification notificationDayType(DayTypeEnum notificationDayType) {
        this.notificationDayType = notificationDayType;
        return this;
    }

    public String getNotificationTime() {
        return notificationTime;
    }

    public CollateralInterestNotification notificationTime(String notificationTime) {
        this.notificationTime = notificationTime;
        return this;
    }

    public Double getOffset() {
        return offset;
    }

    public CollateralInterestNotification offset(Double offset) {
        this.offset = offset;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public CollateralInterestNotification trigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

}
