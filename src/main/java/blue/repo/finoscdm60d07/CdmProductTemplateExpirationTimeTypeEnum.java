package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3GP6gqvt6hS6b1t4skVKAKB1bkZYSJE11NwbQBkYp4zb")
public class CdmProductTemplateExpirationTimeTypeEnum {
    public static String blueId() {
        return "3GP6gqvt6hS6b1t4skVKAKB1bkZYSJE11NwbQBkYp4zb";
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
