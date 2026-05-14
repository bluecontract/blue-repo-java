package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Epqph14DBsBU29F9NrLfo2WQSYZ1t1iPuoSYe5JRsnYo")
public class CreditSupportProviderTermsEnum {
    public static String blueId() {
        return "Epqph14DBsBU29F9NrLfo2WQSYZ1t1iPuoSYe5JRsnYo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditSupportProviderTermsEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditSupportProviderTermsEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CreditSupportProviderTermsEnum.json";
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

    public CreditSupportProviderTermsEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
