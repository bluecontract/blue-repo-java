package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DWkyLfGNm5yB9b7NP2r2QF9rh4d4W5VazfDtubaJD1ah")
public class FxAdditionalTerms {
    public static String blueId() {
        return "DWkyLfGNm5yB9b7NP2r2QF9rh4d4W5VazfDtubaJD1ah";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FxAdditionalTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FxAdditionalTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FxAdditionalTerms.json";
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

    public FxAdditionalTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
