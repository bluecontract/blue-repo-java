package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.coordination.Message;

@TypeBlueId("JA8tkhbAgaZ4T3wc8JXzTN3Swsaw1MpfNAPqTizdCSh1")
public class MandateActivationRequested extends Message {
    public static String blueId() {
        return "JA8tkhbAgaZ4T3wc8JXzTN3Swsaw1MpfNAPqTizdCSh1";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Mandate Activation Requested";
    }

    public static String qualifiedName() {
        return "Mandate/Mandate Activation Requested";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/MandateActivationRequested.json";
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
