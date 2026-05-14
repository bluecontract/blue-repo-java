package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2Pgz6jV9R148z8wQjHPwAVuZiegfLy9gT7qsmqsUKuTq")
public class FieldWithMetaInterestRateIndex {
    public static String blueId() {
        return "2Pgz6jV9R148z8wQjHPwAVuZiegfLy9gT7qsmqsUKuTq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FieldWithMetaInterestRateIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FieldWithMetaInterestRateIndex";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FieldWithMetaInterestRateIndex.json";
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

    private InterestRateIndex val;

    public String getNamespace() {
        return namespace;
    }

    public FieldWithMetaInterestRateIndex namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MetaFields getMeta() {
        return meta;
    }

    public FieldWithMetaInterestRateIndex meta(MetaFields meta) {
        this.meta = meta;
        return this;
    }

    public InterestRateIndex getVal() {
        return val;
    }

    public FieldWithMetaInterestRateIndex val(InterestRateIndex val) {
        this.val = val;
        return this;
    }

}
