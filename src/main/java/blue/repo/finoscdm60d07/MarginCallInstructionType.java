package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GK9MNZK8Fab6YvBAMyckTu32b1D5zaTeJwanK3RxFUYD")
public class MarginCallInstructionType {
    public static String blueId() {
        return "GK9MNZK8Fab6YvBAMyckTu32b1D5zaTeJwanK3RxFUYD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MarginCallInstructionType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MarginCallInstructionType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MarginCallInstructionType.json";
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

    private CallTypeEnum callType;

    private Boolean visibilityIndicator;

    public String getNamespace() {
        return namespace;
    }

    public MarginCallInstructionType namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CallTypeEnum getCallType() {
        return callType;
    }

    public MarginCallInstructionType callType(CallTypeEnum callType) {
        this.callType = callType;
        return this;
    }

    public Boolean getVisibilityIndicator() {
        return visibilityIndicator;
    }

    public MarginCallInstructionType visibilityIndicator(Boolean visibilityIndicator) {
        this.visibilityIndicator = visibilityIndicator;
        return this;
    }

}
