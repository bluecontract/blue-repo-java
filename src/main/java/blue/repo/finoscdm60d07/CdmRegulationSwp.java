package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5EjZim32Eqda6ddZQRiibshQCRikGFQeJc8nvxDo9bjc")
public class CdmRegulationSwp {
    public static String blueId() {
        return "5EjZim32Eqda6ddZQRiibshQCRikGFQeJc8nvxDo9bjc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/Swp";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/Swp";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationSwp.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmRegulationSwpIn swpIn;

    private CdmRegulationSwpOut swpOut;

    public CdmRegulationSwpIn getSwpIn() {
        return swpIn;
    }

    public CdmRegulationSwp swpIn(CdmRegulationSwpIn swpIn) {
        this.swpIn = swpIn;
        return this;
    }

    public CdmRegulationSwpOut getSwpOut() {
        return swpOut;
    }

    public CdmRegulationSwp swpOut(CdmRegulationSwpOut swpOut) {
        this.swpOut = swpOut;
        return this;
    }

}
