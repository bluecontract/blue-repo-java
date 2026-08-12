package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FnPPihH443SKbNrwapeK3w4TS3YG23ns1dkQMnVkD5fp")
public class CdmBaseStaticdataAssetCommonProductIdentifier {
    public static String blueId() {
        return "FnPPihH443SKbNrwapeK3w4TS3YG23ns1dkQMnVkD5fp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/ProductIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/ProductIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonProductIdentifier.json";
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

    private CdmBaseStaticdataAssetCommonProductIdTypeEnum source;

    public ComRosettaModelFieldWithMetaString getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataAssetCommonProductIdentifier identifier(ComRosettaModelFieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmBaseStaticdataAssetCommonProductIdTypeEnum getSource() {
        return source;
    }

    public CdmBaseStaticdataAssetCommonProductIdentifier source(CdmBaseStaticdataAssetCommonProductIdTypeEnum source) {
        this.source = source;
        return this;
    }

}
