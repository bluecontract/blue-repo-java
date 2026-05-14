package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6chynTE7doczteLDPS9js6De19CD4x3HpCgi1eNY4AYf")
public class ValuationSourceEnum {
    public static String blueId() {
        return "6chynTE7doczteLDPS9js6De19CD4x3HpCgi1eNY4AYf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ValuationSourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ValuationSourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ValuationSourceEnum.json";
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

    public ValuationSourceEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
