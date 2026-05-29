package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("E8kNFVq5rjJaDyLo4StMphfzm1hmN8457CXWNFQVj2iH")
public class CdmProductTemplateMetafieldsReferenceWithMetaOptionPayout {
    public static String blueId() {
        return "E8kNFVq5rjJaDyLo4StMphfzm1hmN8457CXWNFQVj2iH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/metafields/ReferenceWithMetaOptionPayout";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/metafields/ReferenceWithMetaOptionPayout";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplatemetafieldsReferenceWithMetaOptionPayout.json";
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

    public CdmProductTemplateMetafieldsReferenceWithMetaOptionPayout address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmProductTemplateMetafieldsReferenceWithMetaOptionPayout externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmProductTemplateMetafieldsReferenceWithMetaOptionPayout globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
