package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6P2aTAXovARh1GhiM9Rj7rxmM3Wgom1Ur3VaTGQ2yYs2")
public class CdmProductTemplateExpirationTimeTypeEnum {
    public static String blueId() {
        return "6P2aTAXovARh1GhiM9Rj7rxmM3Wgom1Ur3VaTGQ2yYs2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ExpirationTimeTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ExpirationTimeTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateExpirationTimeTypeEnum.json";
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
