package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9m8CYJDTZHcV56FCNhnhqfrt3YNP7NHcQ5zYfuXUm9Yu")
public class CdmBaseStaticdataAssetCommonQuasiGovernmentIssuerType {
    public static String blueId() {
        return "9m8CYJDTZHcV56FCNhnhqfrt3YNP7NHcQ5zYfuXUm9Yu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/QuasiGovernmentIssuerType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/QuasiGovernmentIssuerType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonQuasiGovernmentIssuerType.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean sovereignEntity;

    private Boolean sovereignRecourse;

    public Boolean getSovereignEntity() {
        return sovereignEntity;
    }

    public CdmBaseStaticdataAssetCommonQuasiGovernmentIssuerType sovereignEntity(Boolean sovereignEntity) {
        this.sovereignEntity = sovereignEntity;
        return this;
    }

    public Boolean getSovereignRecourse() {
        return sovereignRecourse;
    }

    public CdmBaseStaticdataAssetCommonQuasiGovernmentIssuerType sovereignRecourse(Boolean sovereignRecourse) {
        this.sovereignRecourse = sovereignRecourse;
        return this;
    }

}
