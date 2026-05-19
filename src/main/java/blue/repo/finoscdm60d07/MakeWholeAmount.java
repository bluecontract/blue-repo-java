package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DcecGr6BEQsR9CKK6qXNAmZqsrqFcAWTw8LdQfmUcvbW")
public class MakeWholeAmount {
    public static String blueId() {
        return "DcecGr6BEQsR9CKK6qXNAmZqsrqFcAWTw8LdQfmUcvbW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MakeWholeAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MakeWholeAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MakeWholeAmount.json";
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

    private FieldWithMetaString earlyCallDate;

    private FloatingRateIndexEnum floatingRateIndex;

    private Period indexTenor;

    private InterpolationMethodEnum interpolationMethod;

    private QuotationSideEnum side;

    private Double spread;

    public String getNamespace() {
        return namespace;
    }

    public MakeWholeAmount namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getEarlyCallDate() {
        return earlyCallDate;
    }

    public MakeWholeAmount earlyCallDate(FieldWithMetaString earlyCallDate) {
        this.earlyCallDate = earlyCallDate;
        return this;
    }

    public FloatingRateIndexEnum getFloatingRateIndex() {
        return floatingRateIndex;
    }

    public MakeWholeAmount floatingRateIndex(FloatingRateIndexEnum floatingRateIndex) {
        this.floatingRateIndex = floatingRateIndex;
        return this;
    }

    public Period getIndexTenor() {
        return indexTenor;
    }

    public MakeWholeAmount indexTenor(Period indexTenor) {
        this.indexTenor = indexTenor;
        return this;
    }

    public InterpolationMethodEnum getInterpolationMethod() {
        return interpolationMethod;
    }

    public MakeWholeAmount interpolationMethod(InterpolationMethodEnum interpolationMethod) {
        this.interpolationMethod = interpolationMethod;
        return this;
    }

    public QuotationSideEnum getSide() {
        return side;
    }

    public MakeWholeAmount side(QuotationSideEnum side) {
        this.side = side;
        return this;
    }

    public Double getSpread() {
        return spread;
    }

    public MakeWholeAmount spread(Double spread) {
        this.spread = spread;
        return this;
    }

}
