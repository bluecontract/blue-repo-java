package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AxbfSV8hxy1aLrEmS2SsRUzr9FviU8XH3yLfznCg5kN8")
public class CdmProductTemplateCalendarSpread {
    public static String blueId() {
        return "AxbfSV8hxy1aLrEmS2SsRUzr9FviU8XH3yLfznCg5kN8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/CalendarSpread";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/CalendarSpread";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateCalendarSpread.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeAdjustableOrRelativeDate expirationDateTwo;

    public CdmBaseDatetimeAdjustableOrRelativeDate getExpirationDateTwo() {
        return expirationDateTwo;
    }

    public CdmProductTemplateCalendarSpread expirationDateTwo(CdmBaseDatetimeAdjustableOrRelativeDate expirationDateTwo) {
        this.expirationDateTwo = expirationDateTwo;
        return this;
    }

}
