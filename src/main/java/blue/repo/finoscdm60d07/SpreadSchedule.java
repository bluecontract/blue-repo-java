package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FnfnMagfFr7esQQUxyPXR6chiBtp4LcRtDBwKUgW2EZi")
public class SpreadSchedule {
    public static String blueId() {
        return "FnfnMagfFr7esQQUxyPXR6chiBtp4LcRtDBwKUgW2EZi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SpreadSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SpreadSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SpreadSchedule.json";
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

    private ReferenceWithMetaPriceSchedule price;

    private FieldWithMetaSpreadScheduleTypeEnum spreadScheduleType;

    public String getNamespace() {
        return namespace;
    }

    public SpreadSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaPriceSchedule getPrice() {
        return price;
    }

    public SpreadSchedule price(ReferenceWithMetaPriceSchedule price) {
        this.price = price;
        return this;
    }

    public FieldWithMetaSpreadScheduleTypeEnum getSpreadScheduleType() {
        return spreadScheduleType;
    }

    public SpreadSchedule spreadScheduleType(FieldWithMetaSpreadScheduleTypeEnum spreadScheduleType) {
        this.spreadScheduleType = spreadScheduleType;
        return this;
    }

}
