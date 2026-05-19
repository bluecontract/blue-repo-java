package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ep5KahwuZdmH2tbFPtHvMjx4SK9g8p2Smemx6G1f3tp5")
public class CreditSupportDocumentTermsEnum {
    public static String blueId() {
        return "Ep5KahwuZdmH2tbFPtHvMjx4SK9g8p2Smemx6G1f3tp5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditSupportDocumentTermsEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditSupportDocumentTermsEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditSupportDocumentTermsEnum.json";
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

    public CreditSupportDocumentTermsEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
