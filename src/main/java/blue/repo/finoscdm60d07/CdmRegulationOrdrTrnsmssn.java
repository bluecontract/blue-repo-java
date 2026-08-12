package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BNxwkALCq9ohknAYwcTpQ6QqvS11NejB3JmHqoMzmtDj")
public class CdmRegulationOrdrTrnsmssn {
    public static String blueId() {
        return "BNxwkALCq9ohknAYwcTpQ6QqvS11NejB3JmHqoMzmtDj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/regulation/OrdrTrnsmssn";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/regulation/OrdrTrnsmssn";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmregulationOrdrTrnsmssn.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String trnsmssnInd;

    public String getTrnsmssnInd() {
        return trnsmssnInd;
    }

    public CdmRegulationOrdrTrnsmssn trnsmssnInd(String trnsmssnInd) {
        this.trnsmssnInd = trnsmssnInd;
        return this;
    }

}
