package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B7eHtWyeoBMDcKeh6Jy2NqyEUSfgz6iHRwcwtEqfK6i9")
public class FloatingRateBase {
    public static String blueId() {
        return "B7eHtWyeoBMDcKeh6Jy2NqyEUSfgz6iHRwcwtEqfK6i9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingRateBase";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingRateBase";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FloatingRateBase.json";
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

    private StrikeSchedule capRateSchedule;

    private StrikeSchedule floorRateSchedule;

    private ReferenceWithMetaInterestRateIndex rateOption;

    private SpreadSchedule spreadSchedule;

    public String getNamespace() {
        return namespace;
    }

    public FloatingRateBase namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public StrikeSchedule getCapRateSchedule() {
        return capRateSchedule;
    }

    public FloatingRateBase capRateSchedule(StrikeSchedule capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public StrikeSchedule getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public FloatingRateBase floorRateSchedule(StrikeSchedule floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public ReferenceWithMetaInterestRateIndex getRateOption() {
        return rateOption;
    }

    public FloatingRateBase rateOption(ReferenceWithMetaInterestRateIndex rateOption) {
        this.rateOption = rateOption;
        return this;
    }

    public SpreadSchedule getSpreadSchedule() {
        return spreadSchedule;
    }

    public FloatingRateBase spreadSchedule(SpreadSchedule spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
