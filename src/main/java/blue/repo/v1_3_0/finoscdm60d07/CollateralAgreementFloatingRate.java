package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3WtJDuRmCXKh7PPYRQj8TCmAaW1npCv961KbBcrHUHW7")
public class CollateralAgreementFloatingRate {
    public static String blueId() {
        return "3WtJDuRmCXKh7PPYRQj8TCmAaW1npCv961KbBcrHUHW7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralAgreementFloatingRate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralAgreementFloatingRate";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CollateralAgreementFloatingRate.json";
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

    private Boolean compressibleSpread;

    private StrikeSchedule floorRateSchedule;

    private Boolean negativeInterest;

    private ReferenceWithMetaInterestRateIndex rateOption;

    private SpreadSchedule spreadSchedule;

    public String getNamespace() {
        return namespace;
    }

    public CollateralAgreementFloatingRate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public StrikeSchedule getCapRateSchedule() {
        return capRateSchedule;
    }

    public CollateralAgreementFloatingRate capRateSchedule(StrikeSchedule capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public Boolean getCompressibleSpread() {
        return compressibleSpread;
    }

    public CollateralAgreementFloatingRate compressibleSpread(Boolean compressibleSpread) {
        this.compressibleSpread = compressibleSpread;
        return this;
    }

    public StrikeSchedule getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public CollateralAgreementFloatingRate floorRateSchedule(StrikeSchedule floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public Boolean getNegativeInterest() {
        return negativeInterest;
    }

    public CollateralAgreementFloatingRate negativeInterest(Boolean negativeInterest) {
        this.negativeInterest = negativeInterest;
        return this;
    }

    public ReferenceWithMetaInterestRateIndex getRateOption() {
        return rateOption;
    }

    public CollateralAgreementFloatingRate rateOption(ReferenceWithMetaInterestRateIndex rateOption) {
        this.rateOption = rateOption;
        return this;
    }

    public SpreadSchedule getSpreadSchedule() {
        return spreadSchedule;
    }

    public CollateralAgreementFloatingRate spreadSchedule(SpreadSchedule spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
