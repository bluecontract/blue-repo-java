package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("DHPD6TjPRGDbnXFfNwmjySBzANJtfFKy3YpnP3gRxrNp")
public class PayNoteCancelled extends Response {
    public static String blueId() {
        return "DHPD6TjPRGDbnXFfNwmjySBzANJtfFKy3YpnP3gRxrNp";
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
