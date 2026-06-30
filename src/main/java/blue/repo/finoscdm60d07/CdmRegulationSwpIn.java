package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8wDzaj8nhdMn9sTJMrWq1siNiVWLq5NQ6cURKPYNN86F")
public class CdmRegulationSwpIn {
    public static String blueId() {
        return "8wDzaj8nhdMn9sTJMrWq1siNiVWLq5NQ6cURKPYNN86F";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/SwpIn";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/SwpIn";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationSwpIn.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationSngl sngl;

    public CdmRegulationSngl getSngl() {
        return sngl;
    }

    public CdmRegulationSwpIn sngl(CdmRegulationSngl sngl) {
        this.sngl = sngl;
        return this;
    }

}
