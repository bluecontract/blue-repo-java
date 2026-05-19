package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9qXA7XT9YfkD9RkKLhQCTuud8e1uxG3Ffd9v1xNpH8jG")
public class CreditSupportAgreementElections {
    public static String blueId() {
        return "9qXA7XT9YfkD9RkKLhQCTuud8e1uxG3Ffd9v1xNpH8jG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditSupportAgreementElections";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditSupportAgreementElections";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditSupportAgreementElections.json";
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

    public CreditSupportAgreementElections namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
