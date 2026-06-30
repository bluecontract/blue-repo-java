package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7LjiKLT6mqi1aN28PDZP7RC1BCddoDdaZRX5HQSggkHK")
public class CdmEventCommonMarginCallInstructionType {
    public static String blueId() {
        return "7LjiKLT6mqi1aN28PDZP7RC1BCddoDdaZRX5HQSggkHK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/MarginCallInstructionType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/MarginCallInstructionType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonMarginCallInstructionType.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonCallTypeEnum callType;

    private Boolean visibilityIndicator;

    public CdmEventCommonCallTypeEnum getCallType() {
        return callType;
    }

    public CdmEventCommonMarginCallInstructionType callType(CdmEventCommonCallTypeEnum callType) {
        this.callType = callType;
        return this;
    }

    public Boolean getVisibilityIndicator() {
        return visibilityIndicator;
    }

    public CdmEventCommonMarginCallInstructionType visibilityIndicator(Boolean visibilityIndicator) {
        this.visibilityIndicator = visibilityIndicator;
        return this;
    }

}
