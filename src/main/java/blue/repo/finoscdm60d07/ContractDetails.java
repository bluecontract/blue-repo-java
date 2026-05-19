package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9GzsRXa5CsHE5GtNfiojA1evqQgmufpRRaYDzP3QcbCL")
public class ContractDetails {
    public static String blueId() {
        return "9GzsRXa5CsHE5GtNfiojA1evqQgmufpRRaYDzP3QcbCL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ContractDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ContractDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ContractDetails.json";
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

    private List<LegalAgreement> documentation;

    private FieldWithMetaGoverningLawEnum governingLaw;

    public String getNamespace() {
        return namespace;
    }

    public ContractDetails namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<LegalAgreement> getDocumentation() {
        return documentation;
    }

    public ContractDetails documentation(List<LegalAgreement> documentation) {
        this.documentation = documentation;
        return this;
    }

    public FieldWithMetaGoverningLawEnum getGoverningLaw() {
        return governingLaw;
    }

    public ContractDetails governingLaw(FieldWithMetaGoverningLawEnum governingLaw) {
        this.governingLaw = governingLaw;
        return this;
    }

}
