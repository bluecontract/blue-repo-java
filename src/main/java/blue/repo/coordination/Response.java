package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AzASjrTzr6FPoRd6B3yYDv7k43Z8ap8kwhaxYrFaXpzV")
public class Response extends Message {
    public static String blueId() {
        return "AzASjrTzr6FPoRd6B3yYDv7k43Z8ap8kwhaxYrFaXpzV";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Response";
    }

    public static String qualifiedName() {
        return "Coordination/Response";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Response.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
