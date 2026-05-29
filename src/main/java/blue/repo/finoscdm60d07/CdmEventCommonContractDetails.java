package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CWgftPdUzHsGXXpLwZthiPGoGYovD8LLDVdvfdr1P357")
public class CdmEventCommonContractDetails {
    public static String blueId() {
        return "CWgftPdUzHsGXXpLwZthiPGoGYovD8LLDVdvfdr1P357";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ContractDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ContractDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonContractDetails.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmLegaldocumentationCommonLegalAgreement> documentation;

    private CdmLegaldocumentationCommonFieldWithMetaGoverningLawEnum governingLaw;

    public List<CdmLegaldocumentationCommonLegalAgreement> getDocumentation() {
        return documentation;
    }

    public CdmEventCommonContractDetails documentation(List<CdmLegaldocumentationCommonLegalAgreement> documentation) {
        this.documentation = documentation;
        return this;
    }

    public CdmLegaldocumentationCommonFieldWithMetaGoverningLawEnum getGoverningLaw() {
        return governingLaw;
    }

    public CdmEventCommonContractDetails governingLaw(CdmLegaldocumentationCommonFieldWithMetaGoverningLawEnum governingLaw) {
        this.governingLaw = governingLaw;
        return this;
    }

}
