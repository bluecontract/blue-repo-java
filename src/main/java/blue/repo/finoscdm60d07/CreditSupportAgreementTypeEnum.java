package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9nHSfaWcKes5LZGt2emFdwo5DJGnCRNUVwpaQgM45QEt")
public class CreditSupportAgreementTypeEnum {
    public static String blueId() {
        return "9nHSfaWcKes5LZGt2emFdwo5DJGnCRNUVwpaQgM45QEt";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditSupportAgreementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditSupportAgreementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditSupportAgreementTypeEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public CreditSupportAgreementTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
