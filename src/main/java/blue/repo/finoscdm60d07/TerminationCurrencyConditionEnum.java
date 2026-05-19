package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AFF7aXmSMdobCTD3jA4fzvoEWtwQ6dD33g3xjvkUkCqq")
public class TerminationCurrencyConditionEnum {
    public static String blueId() {
        return "AFF7aXmSMdobCTD3jA4fzvoEWtwQ6dD33g3xjvkUkCqq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TerminationCurrencyConditionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TerminationCurrencyConditionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/TerminationCurrencyConditionEnum.json";
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

    public TerminationCurrencyConditionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
