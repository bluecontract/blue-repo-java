package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HLEkFY88ouS3waVvxxHJE5z23k1PYJGizdrHbYYg1rGp")
public class CdmBaseStaticdataAssetCommonRegionalGovernmentIssuerType {
    public static String blueId() {
        return "HLEkFY88ouS3waVvxxHJE5z23k1PYJGizdrHbYYg1rGp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/RegionalGovernmentIssuerType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/RegionalGovernmentIssuerType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonRegionalGovernmentIssuerType.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean sovereignRecourse;

    public Boolean getSovereignRecourse() {
        return sovereignRecourse;
    }

    public CdmBaseStaticdataAssetCommonRegionalGovernmentIssuerType sovereignRecourse(Boolean sovereignRecourse) {
        this.sovereignRecourse = sovereignRecourse;
        return this;
    }

}
