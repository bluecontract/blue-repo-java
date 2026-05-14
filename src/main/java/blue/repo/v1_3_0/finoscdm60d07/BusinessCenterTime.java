package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ETs9sz3NN8RvLtTf1kAJnYcSLRTW91uqxzhL5q7jTEuK")
public class BusinessCenterTime {
    public static String blueId() {
        return "ETs9sz3NN8RvLtTf1kAJnYcSLRTW91uqxzhL5q7jTEuK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BusinessCenterTime";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BusinessCenterTime";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BusinessCenterTime.json";
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

    private FieldWithMetaBusinessCenterEnum businessCenter;

    private String hourMinuteTime;

    public String getNamespace() {
        return namespace;
    }

    public BusinessCenterTime namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaBusinessCenterEnum getBusinessCenter() {
        return businessCenter;
    }

    public BusinessCenterTime businessCenter(FieldWithMetaBusinessCenterEnum businessCenter) {
        this.businessCenter = businessCenter;
        return this;
    }

    public String getHourMinuteTime() {
        return hourMinuteTime;
    }

    public BusinessCenterTime hourMinuteTime(String hourMinuteTime) {
        this.hourMinuteTime = hourMinuteTime;
        return this;
    }

}
