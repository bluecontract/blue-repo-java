package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Btov1TSH13XcQmYFbUEQ1y8Fjxf5J824rRWZnp4ykQPE")
public class CdmProductAssetSettledEntityMatrix {
    public static String blueId() {
        return "Btov1TSH13XcQmYFbUEQ1y8Fjxf5J824rRWZnp4ykQPE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/SettledEntityMatrix";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/SettledEntityMatrix";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetSettledEntityMatrix.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetFieldWithMetaSettledEntityMatrixSourceEnum matrixSource;

    private String publicationDate;

    public CdmProductAssetFieldWithMetaSettledEntityMatrixSourceEnum getMatrixSource() {
        return matrixSource;
    }

    public CdmProductAssetSettledEntityMatrix matrixSource(CdmProductAssetFieldWithMetaSettledEntityMatrixSourceEnum matrixSource) {
        this.matrixSource = matrixSource;
        return this;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public CdmProductAssetSettledEntityMatrix publicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
        return this;
    }

}
