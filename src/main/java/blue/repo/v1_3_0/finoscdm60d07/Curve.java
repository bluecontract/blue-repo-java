package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6KZaJzhn2fXPc3WedN8yLUMJ1bW7WXLbc3HDpX2SzdPw")
public class Curve {
    public static String blueId() {
        return "6KZaJzhn2fXPc3WedN8yLUMJ1bW7WXLbc3HDpX2SzdPw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Curve";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Curve";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Curve.json";
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

    private FieldWithMetaCommodityReferencePriceEnum commodityCurve;

    private InterestRateCurve interestRateCurve;

    public String getNamespace() {
        return namespace;
    }

    public Curve namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaCommodityReferencePriceEnum getCommodityCurve() {
        return commodityCurve;
    }

    public Curve commodityCurve(FieldWithMetaCommodityReferencePriceEnum commodityCurve) {
        this.commodityCurve = commodityCurve;
        return this;
    }

    public InterestRateCurve getInterestRateCurve() {
        return interestRateCurve;
    }

    public Curve interestRateCurve(InterestRateCurve interestRateCurve) {
        this.interestRateCurve = interestRateCurve;
        return this;
    }

}
