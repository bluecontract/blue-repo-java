package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BeUkW9h7yKH5DBgzTjF52u4PwYu9J9EmLZ5WaYZWnZuB")
public class PrincipalActor extends blue.repo.coordination.PrincipalActor {
    public static String blueId() {
        return "BeUkW9h7yKH5DBgzTjF52u4PwYu9J9EmLZ5WaYZWnZuB";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Principal Actor";
    }

    public static String qualifiedName() {
        return "MyOS/Principal Actor";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/PrincipalActor.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String accountId;

    public String getAccountId() {
        return accountId;
    }

    public PrincipalActor accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

}
