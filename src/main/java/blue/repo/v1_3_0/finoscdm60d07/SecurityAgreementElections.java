package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6pWMYW6VDKdHy6vp2g56gktky47qNbUP76soYtdXsHsT")
public class SecurityAgreementElections {
    public static String blueId() {
        return "6pWMYW6VDKdHy6vp2g56gktky47qNbUP76soYtdXsHsT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SecurityAgreementElections";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SecurityAgreementElections";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SecurityAgreementElections.json";
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

    public SecurityAgreementElections namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
