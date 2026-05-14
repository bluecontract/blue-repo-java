package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BAhKyVdXssR8MdSp17umpGPvL7BAdtkwjqhrwu2GqCqo")
public class FieldWithMetaPriceSchedule {
    public static String blueId() {
        return "BAhKyVdXssR8MdSp17umpGPvL7BAdtkwjqhrwu2GqCqo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaPriceSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaPriceSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaPriceSchedule.json";
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

    private MetaFields meta;

    private PriceSchedule val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaPriceSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaPriceSchedule meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public PriceSchedule getVal() {
        return val;
    }

    public FieldWithMetaPriceSchedule val(PriceSchedule val) {
        this.val = val;
        return this;
    }

}
