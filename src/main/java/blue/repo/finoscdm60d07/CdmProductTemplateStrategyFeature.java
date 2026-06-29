package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8Y5hzBqBHEUiwLTnEj3w34yWp3pZ7s2RiBzE2Mi9or3v")
public class CdmProductTemplateStrategyFeature {
    public static String blueId() {
        return "8Y5hzBqBHEUiwLTnEj3w34yWp3pZ7s2RiBzE2Mi9or3v";
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
