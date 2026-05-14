package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BwgBJnfoz2LewyCdPBrZfiYH2GHKggw78HWCqwJqkybU")
public class RegionalGovernmentIssuerType {
    public static String blueId() {
        return "BwgBJnfoz2LewyCdPBrZfiYH2GHKggw78HWCqwJqkybU";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RegionalGovernmentIssuerType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RegionalGovernmentIssuerType";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/RegionalGovernmentIssuerType.json";
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

    private Boolean sovereignRecourse;

    public String getNamespace() {
        return namespace;
    }

    public RegionalGovernmentIssuerType namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getSovereignRecourse() {
        return sovereignRecourse;
    }

    public RegionalGovernmentIssuerType sovereignRecourse(Boolean sovereignRecourse) {
        this.sovereignRecourse = sovereignRecourse;
        return this;
    }

}
