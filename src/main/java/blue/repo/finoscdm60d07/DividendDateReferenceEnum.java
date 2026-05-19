package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CMTernhPEMRCD9oGhuAuqYF2AiE1Xw3eyu2mzMB88WcZ")
public class DividendDateReferenceEnum {
    public static String blueId() {
        return "CMTernhPEMRCD9oGhuAuqYF2AiE1Xw3eyu2mzMB88WcZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendDateReferenceEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendDateReferenceEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DividendDateReferenceEnum.json";
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

    public DividendDateReferenceEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
