package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3yieueonTuUbuRSGGjTXbPYRXwfv92VC2gsTyzD9Sh1x")
public class FxLinkedNotionalAmount {
    public static String blueId() {
        return "3yieueonTuUbuRSGGjTXbPYRXwfv92VC2gsTyzD9Sh1x";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FxLinkedNotionalAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FxLinkedNotionalAmount";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FxLinkedNotionalAmount.json";
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

    private String adjustedFxSpotFixingDate;

    private Double notionalAmount;

    private Double observedFxSpotRate;

    private String resetDate;

    public String getNamespace() {
        return namespace;
    }

    public FxLinkedNotionalAmount namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedFxSpotFixingDate() {
        return adjustedFxSpotFixingDate;
    }

    public FxLinkedNotionalAmount adjustedFxSpotFixingDate(String adjustedFxSpotFixingDate) {
        this.adjustedFxSpotFixingDate = adjustedFxSpotFixingDate;
        return this;
    }

    public Double getNotionalAmount() {
        return notionalAmount;
    }

    public FxLinkedNotionalAmount notionalAmount(Double notionalAmount) {
        this.notionalAmount = notionalAmount;
        return this;
    }

    public Double getObservedFxSpotRate() {
        return observedFxSpotRate;
    }

    public FxLinkedNotionalAmount observedFxSpotRate(Double observedFxSpotRate) {
        this.observedFxSpotRate = observedFxSpotRate;
        return this;
    }

    public String getResetDate() {
        return resetDate;
    }

    public FxLinkedNotionalAmount resetDate(String resetDate) {
        this.resetDate = resetDate;
        return this;
    }

}
