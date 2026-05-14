package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("FLjFTiFyn8Ujkmjs1tUJGJ9ofLA28t5eLsSUTH7r7im2")
public class Quanto {
    public static String blueId() {
        return "FLjFTiFyn8Ujkmjs1tUJGJ9ofLA28t5eLsSUTH7r7im2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Quanto";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Quanto";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Quanto.json";
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

    private BusinessCenterTime fixingTime;

    private List<FxRate> fxRate;

    private FxSpotRateSource fxSpotRateSource;

    public String getNamespace() {
        return namespace;
    }

    public Quanto namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessCenterTime getFixingTime() {
        return fixingTime;
    }

    public Quanto fixingTime(BusinessCenterTime fixingTime) {
        this.fixingTime = fixingTime;
        return this;
    }

    public List<FxRate> getFxRate() {
        return fxRate;
    }

    public Quanto fxRate(List<FxRate> fxRate) {
        this.fxRate = fxRate;
        return this;
    }

    public FxSpotRateSource getFxSpotRateSource() {
        return fxSpotRateSource;
    }

    public Quanto fxSpotRateSource(FxSpotRateSource fxSpotRateSource) {
        this.fxSpotRateSource = fxSpotRateSource;
        return this;
    }

}
