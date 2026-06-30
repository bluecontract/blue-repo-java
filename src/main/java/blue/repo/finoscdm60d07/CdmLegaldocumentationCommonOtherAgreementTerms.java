package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DLLTGYKnoD2U92utJW3eUJCc4mmSgtMnRGcepG9e2dps")
public class CdmLegaldocumentationCommonOtherAgreementTerms {
    public static String blueId() {
        return "DLLTGYKnoD2U92utJW3eUJCc4mmSgtMnRGcepG9e2dps";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/OtherAgreementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/OtherAgreementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonOtherAgreementTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean isSpecified;

    private String legalDocument;

    public Boolean getIsSpecified() {
        return isSpecified;
    }

    public CdmLegaldocumentationCommonOtherAgreementTerms isSpecified(Boolean isSpecified) {
        this.isSpecified = isSpecified;
        return this;
    }

    public String getLegalDocument() {
        return legalDocument;
    }

    public CdmLegaldocumentationCommonOtherAgreementTerms legalDocument(String legalDocument) {
        this.legalDocument = legalDocument;
        return this;
    }

}
