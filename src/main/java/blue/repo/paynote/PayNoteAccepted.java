package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Response;

@TypeBlueId("5YLDihBUWvCz7kpaJgmhorvo7b5sdPv2AENZE7TQ7vSC")
public class PayNoteAccepted extends Response {
    public static String blueId() {
        return "5YLDihBUWvCz7kpaJgmhorvo7b5sdPv2AENZE7TQ7vSC";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Accepted";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Accepted";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayNoteAccepted.json";
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
