package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BYcZ99RAVfyGUJDKed3D641HuSGKThzD1evEQBpHBt4w")
public class Reset {
    public static String blueId() {
        return "BYcZ99RAVfyGUJDKed3D641HuSGKThzD1evEQBpHBt4w";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Reset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Reset";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Reset.json";
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

    private AveragingCalculation averagingMethodology;

    private List<ReferenceWithMetaObservation> observations;

    private String rateRecordDate;

    private String resetDate;

    private Price resetValue;

    public String getNamespace() {
        return namespace;
    }

    public Reset namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AveragingCalculation getAveragingMethodology() {
        return averagingMethodology;
    }

    public Reset averagingMethodology(AveragingCalculation averagingMethodology) {
        this.averagingMethodology = averagingMethodology;
        return this;
    }

    public List<ReferenceWithMetaObservation> getObservations() {
        return observations;
    }

    public Reset observations(List<ReferenceWithMetaObservation> observations) {
        this.observations = observations;
        return this;
    }

    public String getRateRecordDate() {
        return rateRecordDate;
    }

    public Reset rateRecordDate(String rateRecordDate) {
        this.rateRecordDate = rateRecordDate;
        return this;
    }

    public String getResetDate() {
        return resetDate;
    }

    public Reset resetDate(String resetDate) {
        this.resetDate = resetDate;
        return this;
    }

    public Price getResetValue() {
        return resetValue;
    }

    public Reset resetValue(Price resetValue) {
        this.resetValue = resetValue;
        return this;
    }

}
