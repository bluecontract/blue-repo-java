package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FbEM8ZL5teKMfcZum7UFqJkic3nRhbPNn8qMPg47gVxg")
public class WeeklyRollConventionEnum {
    public static String blueId() {
        return "FbEM8ZL5teKMfcZum7UFqJkic3nRhbPNn8qMPg47gVxg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "WeeklyRollConventionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/WeeklyRollConventionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/WeeklyRollConventionEnum.json";
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

    public WeeklyRollConventionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
