package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B5Jakr9Bd7eaMZzThRtLAaP1ZnjC3yngwZjL4GXVZW7P")
public class CdmProductTemplateMetafieldsReferenceWithMetaPayout {
    public static String blueId() {
        return "B5Jakr9Bd7eaMZzThRtLAaP1ZnjC3yngwZjL4GXVZW7P";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/metafields/ReferenceWithMetaPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/metafields/ReferenceWithMetaPayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplatemetafieldsReferenceWithMetaPayout.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelLibMetaReference address;

    private String externalReference;

    private String globalReference;

    public ComRosettaModelLibMetaReference getAddress() {
        return address;
    }

    public CdmProductTemplateMetafieldsReferenceWithMetaPayout address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmProductTemplateMetafieldsReferenceWithMetaPayout externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmProductTemplateMetafieldsReferenceWithMetaPayout globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
