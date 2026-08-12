package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FPM2G7A95NYqpBbz5kCCRmh7qRnFM5SqwurTX74FLcCv")
public class CdmRegulationSwpOut {
    public static String blueId() {
        return "FPM2G7A95NYqpBbz5kCCRmh7qRnFM5SqwurTX74FLcCv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/SwpOut";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/SwpOut";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationSwpOut.json";
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

    public CdmRegulationSwpOut sngl(CdmRegulationSngl sngl) {
        this.sngl = sngl;
        return this;
    }

}
