package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3e32PM1CGVDHQozzu4ndi3SVic7NRJq4mfSBWfA2ci7h")
public class CdmLegaldocumentationCommonContractualMatrix {
    public static String blueId() {
        return "3e32PM1CGVDHQozzu4ndi3SVic7NRJq4mfSBWfA2ci7h";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/ContractualMatrix";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/ContractualMatrix";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonContractualMatrix.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmLegaldocumentationCommonFieldWithMetaMatrixTermEnum matrixTerm;

    private CdmLegaldocumentationCommonFieldWithMetaMatrixTypeEnum matrixType;

    public CdmLegaldocumentationCommonFieldWithMetaMatrixTermEnum getMatrixTerm() {
        return matrixTerm;
    }

    public CdmLegaldocumentationCommonContractualMatrix matrixTerm(CdmLegaldocumentationCommonFieldWithMetaMatrixTermEnum matrixTerm) {
        this.matrixTerm = matrixTerm;
        return this;
    }

    public CdmLegaldocumentationCommonFieldWithMetaMatrixTypeEnum getMatrixType() {
        return matrixType;
    }

    public CdmLegaldocumentationCommonContractualMatrix matrixType(CdmLegaldocumentationCommonFieldWithMetaMatrixTypeEnum matrixType) {
        this.matrixType = matrixType;
        return this;
    }

}
