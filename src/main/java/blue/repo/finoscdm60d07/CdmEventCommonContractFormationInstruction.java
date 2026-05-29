package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CagkxHfJyKMb4xNhYsbXRRAmCkYcSuGT1oNxjWcbXXTd")
public class CdmEventCommonContractFormationInstruction {
    public static String blueId() {
        return "CagkxHfJyKMb4xNhYsbXRRAmCkYcSuGT1oNxjWcbXXTd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ContractFormationInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ContractFormationInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonContractFormationInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmLegaldocumentationCommonLegalAgreement> legalAgreement;

    public List<CdmLegaldocumentationCommonLegalAgreement> getLegalAgreement() {
        return legalAgreement;
    }

    public CdmEventCommonContractFormationInstruction legalAgreement(List<CdmLegaldocumentationCommonLegalAgreement> legalAgreement) {
        this.legalAgreement = legalAgreement;
        return this;
    }

}
