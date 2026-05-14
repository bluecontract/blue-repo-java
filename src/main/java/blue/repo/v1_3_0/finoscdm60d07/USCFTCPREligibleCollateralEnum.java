package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("95wRiUuFJmLHfSFjvJ365W1PgrFD9BG15tKsFazJp2Zv")
public class USCFTCPREligibleCollateralEnum {
    public static String blueId() {
        return "95wRiUuFJmLHfSFjvJ365W1PgrFD9BG15tKsFazJp2Zv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "US_CFTC_PR_EligibleCollateralEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/US_CFTC_PR_EligibleCollateralEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/USCFTCPREligibleCollateralEnum.json";
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

    public USCFTCPREligibleCollateralEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
