package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DG2puP5kaTQTAW5sZ3dgpiPgy8Kg3yzoTseUHSGxqXmF")
public class CdmBaseStaticdataAssetCommonTaxonomySourceEnum {
    public static String blueId() {
        return "DG2puP5kaTQTAW5sZ3dgpiPgy8Kg3yzoTseUHSGxqXmF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/TaxonomySourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/TaxonomySourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonTaxonomySourceEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
