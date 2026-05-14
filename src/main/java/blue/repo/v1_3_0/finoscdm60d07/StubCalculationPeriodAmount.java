package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4GK7Vbfja6NsnQ6KyhnRSqqKgJdPW4uJ8mjukkrW54xm")
public class StubCalculationPeriodAmount {
    public static String blueId() {
        return "4GK7Vbfja6NsnQ6KyhnRSqqKgJdPW4uJ8mjukkrW54xm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StubCalculationPeriodAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StubCalculationPeriodAmount";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/StubCalculationPeriodAmount.json";
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

    public StubCalculationPeriodAmount namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaCalculationPeriodDates getCalculationPeriodDatesReference() {
        return calculationPeriodDatesReference;
    }

    public StubCalculationPeriodAmount calculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates calculationPeriodDatesReference) {
        this.calculationPeriodDatesReference = calculationPeriodDatesReference;
        return this;
    }

    public StubValue getFinalStub() {
        return finalStub;
    }

    public StubCalculationPeriodAmount finalStub(StubValue finalStub) {
        this.finalStub = finalStub;
        return this;
    }

    public StubValue getInitialStub() {
        return initialStub;
    }

    public StubCalculationPeriodAmount initialStub(StubValue initialStub) {
        this.initialStub = initialStub;
        return this;
    }

}
