package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BhVU3KEW8a9LMCcnm8fr2HCBoKRaD9FgYgM66MQ1VNtX")
public class CdmProductAssetSettledEntityMatrixSourceEnum {
    public static String blueId() {
        return "BhVU3KEW8a9LMCcnm8fr2HCBoKRaD9FgYgM66MQ1VNtX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/SettledEntityMatrixSourceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/SettledEntityMatrixSourceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetSettledEntityMatrixSourceEnum.json";
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
