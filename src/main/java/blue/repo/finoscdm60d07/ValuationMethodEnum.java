package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CGFQHJf12pYPKdYY7gDSHvaiF31huADuLEUeBseXrrGp")
public class ValuationMethodEnum {
    public static String blueId() {
        return "CGFQHJf12pYPKdYY7gDSHvaiF31huADuLEUeBseXrrGp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ValuationMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ValuationMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ValuationMethodEnum.json";
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

    public ValuationMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
