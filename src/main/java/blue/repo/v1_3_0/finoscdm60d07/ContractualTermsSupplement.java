package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9vXHKDGSaT72BZjk6Y4K1WkfG4GXC5ftTqUzKo4zyjLM")
public class ContractualTermsSupplement {
    public static String blueId() {
        return "9vXHKDGSaT72BZjk6Y4K1WkfG4GXC5ftTqUzKo4zyjLM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ContractualTermsSupplement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ContractualTermsSupplement";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ContractualTermsSupplement.json";
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

    private FieldWithMetaContractualSupplementTypeEnum contractualTermsSupplementType;

    private String publicationDate;

    public String getNamespace() {
        return namespace;
    }

    public ContractualTermsSupplement namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaContractualSupplementTypeEnum getContractualTermsSupplementType() {
        return contractualTermsSupplementType;
    }

    public ContractualTermsSupplement contractualTermsSupplementType(FieldWithMetaContractualSupplementTypeEnum contractualTermsSupplementType) {
        this.contractualTermsSupplementType = contractualTermsSupplementType;
        return this;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public ContractualTermsSupplement publicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
        return this;
    }

}
