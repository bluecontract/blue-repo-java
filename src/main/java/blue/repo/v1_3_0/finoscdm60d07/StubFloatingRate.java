package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AVCzotdsA7oBsUsB3WimzY5AyYWCn2Lfecco7VhmJtS1")
public class StubFloatingRate {
    public static String blueId() {
        return "AVCzotdsA7oBsUsB3WimzY5AyYWCn2Lfecco7VhmJtS1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StubFloatingRate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StubFloatingRate";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/StubFloatingRate.json";
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

    private List<StrikeSchedule> capRateSchedule;

    private FloatingRateIndexEnum floatingRateIndex;

    private Schedule floatingRateMultiplierSchedule;

    private List<StrikeSchedule> floorRateSchedule;

    private Period indexTenor;

    private RateTreatmentEnum rateTreatment;

    private List<SpreadSchedule> spreadSchedule;

    public String getNamespace() {
        return namespace;
    }

    public StubFloatingRate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<StrikeSchedule> getCapRateSchedule() {
        return capRateSchedule;
    }

    public StubFloatingRate capRateSchedule(List<StrikeSchedule> capRateSchedule) {
        this.capRateSchedule = capRateSchedule;
        return this;
    }

    public FloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public StubFloatingRate floatingRateIndex(FloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public Schedule getFloatingRateMultiplierSchedule() {
        return floatingRateMultiplierSchedule;
    }

    public StubFloatingRate floatingRateMultiplierSchedule(Schedule floatingRateMultiplierSchedule) {
        this.floatingRateMultiplierSchedule = floatingRateMultiplierSchedule;
        return this;
    }

    public List<StrikeSchedule> getFloorRateSchedule() {
        return floorRateSchedule;
    }

    public StubFloatingRate floorRateSchedule(List<StrikeSchedule> floorRateSchedule) {
        this.floorRateSchedule = floorRateSchedule;
        return this;
    }

    public Period getIndexTenor() {
        return indexTenor;
    }

    public StubFloatingRate indexTenor(Period indexTenor) {
        this.indexTenor = indexTenor;
        return this;
    }

    public RateTreatmentEnum getRateTreatment() {
        return rateTreatment;
    }

    public StubFloatingRate rateTreatment(RateTreatmentEnum rateTreatment) {
        this.rateTreatment = rateTreatment;
        return this;
    }

    public List<SpreadSchedule> getSpreadSchedule() {
        return spreadSchedule;
    }

    public StubFloatingRate spreadSchedule(List<SpreadSchedule> spreadSchedule) {
        this.spreadSchedule = spreadSchedule;
        return this;
    }

}
