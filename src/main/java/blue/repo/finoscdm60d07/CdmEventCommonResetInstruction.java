package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3vdqYkcvrCgXLt39NjEJw6qi6PFvbPZ4Z866PwYkm9Rj")
public class CdmEventCommonResetInstruction {
    public static String blueId() {
        return "3vdqYkcvrCgXLt39NjEJw6qi6PFvbPZ4Z866PwYkm9Rj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ResetInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ResetInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonResetInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductTemplateMetafieldsReferenceWithMetaPayout> payout;

    private String rateRecordDate;

    private String resetDate;

    public List<CdmProductTemplateMetafieldsReferenceWithMetaPayout> getPayout() {
        return payout;
    }

    public CdmEventCommonResetInstruction payout(List<CdmProductTemplateMetafieldsReferenceWithMetaPayout> payout) {
        this.payout = payout;
        return this;
    }

    public String getRateRecordDate() {
        return rateRecordDate;
    }

    public CdmEventCommonResetInstruction rateRecordDate(String rateRecordDate) {
        this.rateRecordDate = rateRecordDate;
        return this;
    }

    public String getResetDate() {
        return resetDate;
    }

    public CdmEventCommonResetInstruction resetDate(String resetDate) {
        this.resetDate = resetDate;
        return this;
    }

}
