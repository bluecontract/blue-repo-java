package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CWq9dJtNLaQbQ6KRZzN4f1jHEAMtUS9zqXLdP5qV8dsw")
public class CreditLimitInformation {
    public static String blueId() {
        return "CWq9dJtNLaQbQ6KRZzN4f1jHEAMtUS9zqXLdP5qV8dsw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditLimitInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditLimitInformation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditLimitInformation.json";
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

    private List<LimitApplicableExtended> limitApplicable;

    public String getNamespace() {
        return namespace;
    }

    public CreditLimitInformation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<LimitApplicableExtended> getLimitApplicable() {
        return limitApplicable;
    }

    public CreditLimitInformation limitApplicable(List<LimitApplicableExtended> limitApplicable) {
        this.limitApplicable = limitApplicable;
        return this;
    }

}
