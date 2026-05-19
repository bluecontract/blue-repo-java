package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("kNtPeTrcrzr6FPGhSuhrNTVEtD6a4deXPzzwahPbosx")
public class OptionTypeEnum {
    public static String blueId() {
        return "kNtPeTrcrzr6FPGhSuhrNTVEtD6a4deXPzzwahPbosx";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "OptionTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/OptionTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/OptionTypeEnum.json";
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

    public OptionTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
