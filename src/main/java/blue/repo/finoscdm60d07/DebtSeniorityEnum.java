package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GubTTDzu7dUR5mDR9GqcrrwJQHXhdjBxJs1df3xCYHob")
public class DebtSeniorityEnum {
    public static String blueId() {
        return "GubTTDzu7dUR5mDR9GqcrrwJQHXhdjBxJs1df3xCYHob";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DebtSeniorityEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DebtSeniorityEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DebtSeniorityEnum.json";
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

    public DebtSeniorityEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
