package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7o95hvMNSpwvnwgXCRfRWhLQqFrrHpTPRvLZf1ZzTXWx")
public class CdmProductAssetStubValue {
    public static String blueId() {
        return "7o95hvMNSpwvnwgXCRfRWhLQqFrrHpTPRvLZf1ZzTXWx";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/StubValue";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/StubValue";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetStubValue.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductAssetStubFloatingRate> floatingRate;

    private CdmObservableAssetMoney stubAmount;

    private Double stubRate;

    public List<CdmProductAssetStubFloatingRate> getFloatingRate() {
        return floatingRate;
    }

    public CdmProductAssetStubValue floatingRate(List<CdmProductAssetStubFloatingRate> floatingRate) {
        this.floatingRate = floatingRate;
        return this;
    }

    public CdmObservableAssetMoney getStubAmount() {
        return stubAmount;
    }

    public CdmProductAssetStubValue stubAmount(CdmObservableAssetMoney stubAmount) {
        this.stubAmount = stubAmount;
        return this;
    }

    public Double getStubRate() {
        return stubRate;
    }

    public CdmProductAssetStubValue stubRate(Double stubRate) {
        this.stubRate = stubRate;
        return this;
    }

}
