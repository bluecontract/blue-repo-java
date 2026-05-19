package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7fwKe2RsQpcydq7pZB4oNWqxMZxf9owz1Kga2Y9Q4xsQ")
public class ContractualMatrix {
    public static String blueId() {
        return "7fwKe2RsQpcydq7pZB4oNWqxMZxf9owz1Kga2Y9Q4xsQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ContractualMatrix";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ContractualMatrix";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ContractualMatrix.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private FieldWithMetaMatrixTermEnum matrixTerm;

    private FieldWithMetaMatrixTypeEnum matrixType;

    public String getNamespace() {
        return namespace;
    }

    public ContractualMatrix namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaMatrixTermEnum getMatrixTerm() {
        return matrixTerm;
    }

    public ContractualMatrix matrixTerm(FieldWithMetaMatrixTermEnum matrixTerm) {
        this.matrixTerm = matrixTerm;
        return this;
    }

    public FieldWithMetaMatrixTypeEnum getMatrixType() {
        return matrixType;
    }

    public ContractualMatrix matrixType(FieldWithMetaMatrixTypeEnum matrixType) {
        this.matrixType = matrixType;
        return this;
    }

}
