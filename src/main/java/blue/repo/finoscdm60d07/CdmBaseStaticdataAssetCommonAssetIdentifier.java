package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4oFH9vehkWBHWWKWKPEPwytqoRKUA6mcVgrG7P1XtKRy")
public class CdmBaseStaticdataAssetCommonAssetIdentifier {
    public static String blueId() {
        return "4oFH9vehkWBHWWKWKPEPwytqoRKUA6mcVgrG7P1XtKRy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/AssetIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/AssetIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonAssetIdentifier.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString identifier;

    private CdmBaseStaticdataAssetCommonAssetIdTypeEnum identifierType;

    public ComRosettaModelFieldWithMetaString getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataAssetCommonAssetIdentifier identifier(ComRosettaModelFieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmBaseStaticdataAssetCommonAssetIdTypeEnum getIdentifierType() {
        return identifierType;
    }

    public CdmBaseStaticdataAssetCommonAssetIdentifier identifierType(CdmBaseStaticdataAssetCommonAssetIdTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

}
