package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HFtfXQc7FJHLvN7nDbQ4VVU1cgcwMZFTZosQFoiyHQ6")
public class CdmMarginScheduleStandardizedScheduleInitialMargin {
    public static String blueId() {
        return "HFtfXQc7FJHLvN7nDbQ4VVU1cgcwMZFTZosQFoiyHQ6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/margin/schedule/StandardizedScheduleInitialMargin";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/margin/schedule/StandardizedScheduleInitialMargin";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmmarginscheduleStandardizedScheduleInitialMargin.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableAssetMoney netInitialMargin;

    private List<CdmMarginScheduleStandardizedScheduleTradeInfo> tradeInfo;

    public CdmObservableAssetMoney getNetInitialMargin() {
        return netInitialMargin;
    }

    public CdmMarginScheduleStandardizedScheduleInitialMargin netInitialMargin(CdmObservableAssetMoney netInitialMargin) {
        this.netInitialMargin = netInitialMargin;
        return this;
    }

    public List<CdmMarginScheduleStandardizedScheduleTradeInfo> getTradeInfo() {
        return tradeInfo;
    }

    public CdmMarginScheduleStandardizedScheduleInitialMargin tradeInfo(List<CdmMarginScheduleStandardizedScheduleTradeInfo> tradeInfo) {
        this.tradeInfo = tradeInfo;
        return this;
    }

}
