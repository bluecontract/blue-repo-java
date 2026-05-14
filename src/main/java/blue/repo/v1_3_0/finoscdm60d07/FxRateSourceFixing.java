package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("87fpjopiMEfYZ2rbW8eS8YvdahZ8H7fHzkoR7BaTVkKA")
public class FxRateSourceFixing {
    public static String blueId() {
        return "87fpjopiMEfYZ2rbW8eS8YvdahZ8H7fHzkoR7BaTVkKA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FxRateSourceFixing";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FxRateSourceFixing";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FxRateSourceFixing.json";
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

    private AdjustableDate fixingDate;

    private FxSettlementRateSource settlementRateSource;

    public String getNamespace() {
        return namespace;
    }

    public FxRateSourceFixing namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableDate getFixingDate() {
        return fixingDate;
    }

    public FxRateSourceFixing fixingDate(AdjustableDate fixingDate) {
        this.fixingDate = fixingDate;
        return this;
    }

    public FxSettlementRateSource getSettlementRateSource() {
        return settlementRateSource;
    }

    public FxRateSourceFixing settlementRateSource(FxSettlementRateSource settlementRateSource) {
        this.settlementRateSource = settlementRateSource;
        return this;
    }

}
