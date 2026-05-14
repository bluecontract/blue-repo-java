package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4VN3ZeYumbwFAVLUTUSEECQw1UVZDNDX4NWP3yxUn466")
public class SettledEntityMatrix {
    public static String blueId() {
        return "4VN3ZeYumbwFAVLUTUSEECQw1UVZDNDX4NWP3yxUn466";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SettledEntityMatrix";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SettledEntityMatrix";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SettledEntityMatrix.json";
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

    private FieldWithMetaSettledEntityMatrixSourceEnum matrixSource;

    private String publicationDate;

    public String getNamespace() {
        return namespace;
    }

    public SettledEntityMatrix namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaSettledEntityMatrixSourceEnum getMatrixSource() {
        return matrixSource;
    }

    public SettledEntityMatrix matrixSource(FieldWithMetaSettledEntityMatrixSourceEnum matrixSource) {
        this.matrixSource = matrixSource;
        return this;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public SettledEntityMatrix publicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
        return this;
    }

}
