package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8d7t77eoZznGXdoKdpQK6QFJcZuzZrjj3VtBPGBQ4sUm")
public class CdmLegaldocumentationCommonMetafieldsReferenceWithMetaLegalAgreement {
    public static String blueId() {
        return "8d7t77eoZznGXdoKdpQK6QFJcZuzZrjj3VtBPGBQ4sUm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/metafields/ReferenceWithMetaLegalAgreement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/metafields/ReferenceWithMetaLegalAgreement";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonmetafieldsReferenceWithMetaLegalAgreement.json";
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

    public CdmLegaldocumentationCommonMetafieldsReferenceWithMetaLegalAgreement address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmLegaldocumentationCommonMetafieldsReferenceWithMetaLegalAgreement externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmLegaldocumentationCommonMetafieldsReferenceWithMetaLegalAgreement globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
