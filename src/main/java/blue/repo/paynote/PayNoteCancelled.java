package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("Feo1czy1aQYvo4d21ZFuFApZb13vqCBkzt4W3nrZoeRH")
public class PayNoteCancelled extends Response {
    public static String blueId() {
        return "Feo1czy1aQYvo4d21ZFuFApZb13vqCBkzt4W3nrZoeRH";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Cancelled";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Cancelled";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayNoteCancelled.json";
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
