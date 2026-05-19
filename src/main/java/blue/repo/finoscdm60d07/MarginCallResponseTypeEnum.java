package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6ye878dRLRvvrkhmiYEsuka5ZnJgp3nvzEXeeXhXmbPr")
public class MarginCallResponseTypeEnum {
    public static String blueId() {
        return "6ye878dRLRvvrkhmiYEsuka5ZnJgp3nvzEXeeXhXmbPr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MarginCallResponseTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MarginCallResponseTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MarginCallResponseTypeEnum.json";
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

    public MarginCallResponseTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
