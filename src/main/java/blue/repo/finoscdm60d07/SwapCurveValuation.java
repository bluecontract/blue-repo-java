package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8uTpR6nDjzouocdjg6RhQJoqyzsvgUQafdC4iK85zN7W")
public class SwapCurveValuation {
    public static String blueId() {
        return "8uTpR6nDjzouocdjg6RhQJoqyzsvgUQafdC4iK85zN7W";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SwapCurveValuation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SwapCurveValuation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SwapCurveValuation.json";
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

    private FloatingRateIndexEnum floatingRateIndex;

    private Period indexTenor;

    private QuotationSideEnum side;

    private Double spread;

    public String getNamespace() {
        return namespace;
    }

    public SwapCurveValuation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public SwapCurveValuation floatingRateIndex(FloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public Period getIndexTenor() {
        return indexTenor;
    }

    public SwapCurveValuation indexTenor(Period indexTenor) {
        this.indexTenor = indexTenor;
        return this;
    }

    public QuotationSideEnum getSide() {
        return side;
    }

    public SwapCurveValuation side(QuotationSideEnum side) {
        this.side = side;
        return this;
    }

    public Double getSpread() {
        return spread;
    }

    public SwapCurveValuation spread(Double spread) {
        this.spread = spread;
        return this;
    }

}
