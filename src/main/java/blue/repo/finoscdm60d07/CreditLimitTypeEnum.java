package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("98BPJtzzdxkKXULxtc6ERZGSjmkTvXLQcwS6VmAsvCR2")
public class CreditLimitTypeEnum {
    public static String blueId() {
        return "98BPJtzzdxkKXULxtc6ERZGSjmkTvXLQcwS6VmAsvCR2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditLimitTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditLimitTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditLimitTypeEnum.json";
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

    public CreditLimitTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
