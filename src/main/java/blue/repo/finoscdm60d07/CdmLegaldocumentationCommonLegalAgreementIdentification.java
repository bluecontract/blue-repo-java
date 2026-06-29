package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("7p7rsMrLJRwnskaTsetTmKypk1jyyLVvR6JTdJNYeFNf")
public class CdmLegaldocumentationCommonLegalAgreementIdentification {
    public static String blueId() {
        return "7p7rsMrLJRwnskaTsetTmKypk1jyyLVvR6JTdJNYeFNf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/LegalAgreementIdentification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/LegalAgreementIdentification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonLegalAgreementIdentification.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmLegaldocumentationCommonAgreementName agreementName;

    private CdmLegaldocumentationCommonGoverningLawEnum governingLaw;

    private CdmLegaldocumentationCommonLegalAgreementPublisherEnum publisher;

    private BigInteger vintage;

    public CdmLegaldocumentationCommonAgreementName getAgreementName() {
        return agreementName;
    }

    public CdmLegaldocumentationCommonLegalAgreementIdentification agreementName(CdmLegaldocumentationCommonAgreementName agreementName) {
        this.agreementName = agreementName;
        return this;
    }

    public CdmLegaldocumentationCommonGoverningLawEnum getGoverningLaw() {
        return governingLaw;
    }

    public CdmLegaldocumentationCommonLegalAgreementIdentification governingLaw(CdmLegaldocumentationCommonGoverningLawEnum governingLaw) {
        this.governingLaw = governingLaw;
        return this;
    }

    public CdmLegaldocumentationCommonLegalAgreementPublisherEnum getPublisher() {
        return publisher;
    }

    public CdmLegaldocumentationCommonLegalAgreementIdentification publisher(CdmLegaldocumentationCommonLegalAgreementPublisherEnum publisher) {
        this.publisher = publisher;
        return this;
    }

    public BigInteger getVintage() {
        return vintage;
    }

    public CdmLegaldocumentationCommonLegalAgreementIdentification vintage(BigInteger vintage) {
        this.vintage = vintage;
        return this;
    }

}
