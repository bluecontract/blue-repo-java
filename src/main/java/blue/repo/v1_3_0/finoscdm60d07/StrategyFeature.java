package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7Qn8dmcBqxZ4qHmVEiaUne3TKGFv3prKnwre6AbrSM68")
public class StrategyFeature {
    public static String blueId() {
        return "7Qn8dmcBqxZ4qHmVEiaUne3TKGFv3prKnwre6AbrSM68";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StrategyFeature";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StrategyFeature";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/StrategyFeature.json";
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

    private CalendarSpread calendarSpread;

    private StrikeSpread strikeSpread;

    public String getNamespace() {
        return namespace;
    }

    public StrategyFeature namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CalendarSpread getCalendarSpread() {
        return calendarSpread;
    }

    public StrategyFeature calendarSpread(CalendarSpread calendarSpread) {
        this.calendarSpread = calendarSpread;
        return this;
    }

    public StrikeSpread getStrikeSpread() {
        return strikeSpread;
    }

    public StrategyFeature strikeSpread(StrikeSpread strikeSpread) {
        this.strikeSpread = strikeSpread;
        return this;
    }

}
