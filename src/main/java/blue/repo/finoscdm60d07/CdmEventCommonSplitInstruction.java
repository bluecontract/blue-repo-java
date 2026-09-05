package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8mSjnRHr78AivwxBB2cQJDm7okhUDSWhBw4Cc8daTEc4#1")
public class CdmEventCommonSplitInstruction {
    public static String blueId() {
        return "8mSjnRHr78AivwxBB2cQJDm7okhUDSWhBw4Cc8daTEc4#1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/SplitInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/SplitInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonSplitInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventCommonPrimitiveInstruction> breakdown;

    public List<CdmEventCommonPrimitiveInstruction> getBreakdown() {
        return breakdown;
    }

    public CdmEventCommonSplitInstruction breakdown(List<CdmEventCommonPrimitiveInstruction> breakdown) {
        this.breakdown = breakdown;
        return this;
    }

}
