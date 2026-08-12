package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7cCT8NhkWTqkg2sJE8YMTNeGY3ANYQ88fz8LXNSuuXgw")
public class CdmLegaldocumentationCommonMatrixTermEnum {
    public static String blueId() {
        return "7cCT8NhkWTqkg2sJE8YMTNeGY3ANYQ88fz8LXNSuuXgw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/MatrixTermEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/MatrixTermEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonMatrixTermEnum.json";
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
