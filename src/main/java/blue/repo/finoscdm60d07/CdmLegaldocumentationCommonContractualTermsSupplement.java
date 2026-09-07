package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9ywiwHU3x5w8jv4uh4zTJVaB2b9XqPmWDaeqWuzaYdgg")
public class CdmLegaldocumentationCommonContractualTermsSupplement {
    public static String blueId() {
        return "9ywiwHU3x5w8jv4uh4zTJVaB2b9XqPmWDaeqWuzaYdgg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/ContractualTermsSupplement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/ContractualTermsSupplement";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonContractualTermsSupplement.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmLegaldocumentationCommonFieldWithMetaContractualSupplementTypeEnum contractualTermsSupplementType;

    private String publicationDate;

    public CdmLegaldocumentationCommonFieldWithMetaContractualSupplementTypeEnum getContractualTermsSupplementType() {
        return contractualTermsSupplementType;
    }

    public CdmLegaldocumentationCommonContractualTermsSupplement contractualTermsSupplementType(CdmLegaldocumentationCommonFieldWithMetaContractualSupplementTypeEnum contractualTermsSupplementType) {
        this.contractualTermsSupplementType = contractualTermsSupplementType;
        return this;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public CdmLegaldocumentationCommonContractualTermsSupplement publicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
        return this;
    }

}
