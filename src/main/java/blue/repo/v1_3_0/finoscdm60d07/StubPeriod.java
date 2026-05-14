package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EUADXtMeqKMhzEKXV4TDz3dxbgFo1uFru6HYwWBU64vq")
public class StubPeriod {
    public static String blueId() {
        return "EUADXtMeqKMhzEKXV4TDz3dxbgFo1uFru6HYwWBU64vq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StubPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StubPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/StubPeriod.json";
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

    private ReferenceWithMetaCalculationPeriodDates calculationPeriodDatesReference;

    private StubValue finalStub;

    private StubValue initialStub;

    public String getNamespace() {
        return namespace;
    }

    public StubPeriod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaCalculationPeriodDates getCalculationPeriodDatesReference() {
        return calculationPeriodDatesReference;
    }

    public StubPeriod calculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates calculationPeriodDatesReference) {
        this.calculationPeriodDatesReference = calculationPeriodDatesReference;
        return this;
    }

    public StubValue getFinalStub() {
        return finalStub;
    }

    public StubPeriod finalStub(StubValue finalStub) {
        this.finalStub = finalStub;
        return this;
    }

    public StubValue getInitialStub() {
        return initialStub;
    }

    public StubPeriod initialStub(StubValue initialStub) {
        this.initialStub = initialStub;
        return this;
    }

}
