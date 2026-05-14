package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("zp4VBDAezGJVsGwhswpFnBiTKoGV1MeUm3KckYMULJ8")
public class NonCashDividendTreatmentEnum {
    public static String blueId() {
        return "zp4VBDAezGJVsGwhswpFnBiTKoGV1MeUm3KckYMULJ8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NonCashDividendTreatmentEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NonCashDividendTreatmentEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/NonCashDividendTreatmentEnum.json";
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

    public NonCashDividendTreatmentEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
