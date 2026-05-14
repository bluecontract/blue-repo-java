package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9TuHM8Jw42P2s83JF82YowawWirzGwhZAGiywnH9jwVK")
public class FinancialUnitEnum {
    public static String blueId() {
        return "9TuHM8Jw42P2s83JF82YowawWirzGwhZAGiywnH9jwVK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FinancialUnitEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FinancialUnitEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FinancialUnitEnum.json";
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

    public FinancialUnitEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
