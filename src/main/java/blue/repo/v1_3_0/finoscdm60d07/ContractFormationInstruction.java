package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CRqRQeAFfhq8ixw2B32fY8marGsn7ut2Cv7f6JB8LQvs")
public class ContractFormationInstruction {
    public static String blueId() {
        return "CRqRQeAFfhq8ixw2B32fY8marGsn7ut2Cv7f6JB8LQvs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ContractFormationInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ContractFormationInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ContractFormationInstruction.json";
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

    private List<LegalAgreement> legalAgreement;

    public String getNamespace() {
        return namespace;
    }

    public ContractFormationInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<LegalAgreement> getLegalAgreement() {
        return legalAgreement;
    }

    public ContractFormationInstruction legalAgreement(List<LegalAgreement> legalAgreement) {
        this.legalAgreement = legalAgreement;
        return this;
    }

}
