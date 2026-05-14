package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("xXNsY9PC5p4NCiRsTQ81cEcSqfJiBKBrDCJRUSaHMCE")
public class IssuerName {
    public static String blueId() {
        return "xXNsY9PC5p4NCiRsTQ81cEcSqfJiBKBrDCJRUSaHMCE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "IssuerName";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/IssuerName";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/IssuerName.json";
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

    private LegalEntity issuerName;

    public String getNamespace() {
        return namespace;
    }

    public IssuerName namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public LegalEntity getIssuerName() {
        return issuerName;
    }

    public IssuerName issuerName(LegalEntity issuerName) {
        this.issuerName = issuerName;
        return this;
    }

}
