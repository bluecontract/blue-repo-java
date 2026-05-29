package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("DEqff37krhvNUSowic28rPw9p2fbg97NQ5Zx1Nsi8gAA")
public class CdmObservableAssetInterestRateIndex {
    public static String blueId() {
        return "DEqff37krhvNUSowic28rPw9p2fbg97NQ5Zx1Nsi8gAA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/InterestRateIndex";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/InterestRateIndex";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetInterestRateIndex.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    // Original Blue property name: FloatingRateIndex
    @JsonProperty("FloatingRateIndex")
    private CdmObservableAssetFloatingRateIndex floatingRateIndex;

    // Original Blue property name: InflationIndex
    @JsonProperty("InflationIndex")
    private CdmObservableAssetInflationIndex inflationIndex;

    public CdmObservableAssetFloatingRateIndex getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public CdmObservableAssetInterestRateIndex floatingRateIndex(CdmObservableAssetFloatingRateIndex floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public CdmObservableAssetInflationIndex getInflationIndex() {
        return inflationIndex;
    }

    public CdmObservableAssetInterestRateIndex inflationIndex(CdmObservableAssetInflationIndex inflationIndex) {
        this.inflationIndex = inflationIndex;
        return this;
    }

}
