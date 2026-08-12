package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5FY1FUfgFT4nN3Byvi6mYwPrpJ6JFpsc6yBQVo6V5tb7")
public class CdmProductTemplateStrategyFeature {
    public static String blueId() {
        return "5FY1FUfgFT4nN3Byvi6mYwPrpJ6JFpsc6yBQVo6V5tb7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/StrategyFeature";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/StrategyFeature";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateStrategyFeature.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateCalendarSpread calendarSpread;

    private CdmProductTemplateStrikeSpread strikeSpread;

    public CdmProductTemplateCalendarSpread getCalendarSpread() {
        return calendarSpread;
    }

    public CdmProductTemplateStrategyFeature calendarSpread(CdmProductTemplateCalendarSpread calendarSpread) {
        this.calendarSpread = calendarSpread;
        return this;
    }

    public CdmProductTemplateStrikeSpread getStrikeSpread() {
        return strikeSpread;
    }

    public CdmProductTemplateStrategyFeature strikeSpread(CdmProductTemplateStrikeSpread strikeSpread) {
        this.strikeSpread = strikeSpread;
        return this;
    }

}
