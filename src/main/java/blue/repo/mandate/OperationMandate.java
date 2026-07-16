package blue.repo.mandate;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BNCHNpZueeZEq3SdckkV3Xym5b7mEDWouLxMFkGQ62tG")
public class OperationMandate extends Mandate {
    public static String blueId() {
        return "BNCHNpZueeZEq3SdckkV3Xym5b7mEDWouLxMFkGQ62tG";
    }

    public static String packageName() {
        return "Mandate";
    }

    public static String typeName() {
        return "Operation Mandate";
    }

    public static String qualifiedName() {
        return "Mandate/Operation Mandate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Mandate/OperationMandate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node target;

    public Node getTarget() {
        return target;
    }

    public OperationMandate target(Node target) {
        this.target = target;
        return this;
    }

}
