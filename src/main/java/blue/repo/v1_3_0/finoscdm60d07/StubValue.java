package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3weiXri9Tsq2aYRwdUhivhAARb81EU9wHqkugLWxNMDf")
public class StubValue {
    public static String blueId() {
        return "3weiXri9Tsq2aYRwdUhivhAARb81EU9wHqkugLWxNMDf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StubValue";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StubValue";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/StubValue.json";
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

    private List<StubFloatingRate> floatingRate;

    private Money stubAmount;

    private Double stubRate;

    public String getNamespace() {
        return namespace;
    }

    public StubValue namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<StubFloatingRate> getFloatingRate() {
        return floatingRate;
    }

    public StubValue floatingRate(List<StubFloatingRate> floatingRate) {
        this.floatingRate = floatingRate;
        return this;
    }

    public Money getStubAmount() {
        return stubAmount;
    }

    public StubValue stubAmount(Money stubAmount) {
        this.stubAmount = stubAmount;
        return this;
    }

    public Double getStubRate() {
        return stubRate;
    }

    public StubValue stubRate(Double stubRate) {
        this.stubRate = stubRate;
        return this;
    }

}
