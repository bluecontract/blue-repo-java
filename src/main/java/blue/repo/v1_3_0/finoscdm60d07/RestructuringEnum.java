package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GRuMW7L82i8DCzwrDNdjXcPZE76faJjatCXzwJFLuiYa")
public class RestructuringEnum {
    public static String blueId() {
        return "GRuMW7L82i8DCzwrDNdjXcPZE76faJjatCXzwJFLuiYa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RestructuringEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RestructuringEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RestructuringEnum.json";
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

    public RestructuringEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
