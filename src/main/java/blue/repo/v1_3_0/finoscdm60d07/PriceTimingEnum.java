package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("92se4Ba3TmRSHGQNifUy8GkDX3hnE53p7mQpXSfBh4DD")
public class PriceTimingEnum {
    public static String blueId() {
        return "92se4Ba3TmRSHGQNifUy8GkDX3hnE53p7mQpXSfBh4DD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PriceTimingEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PriceTimingEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PriceTimingEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public PriceTimingEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
