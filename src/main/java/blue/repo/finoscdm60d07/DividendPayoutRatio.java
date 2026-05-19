package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2sHE2kou5HhCyamhJWgpd7yFC2uK9hfzif561s4W4C1F")
public class DividendPayoutRatio {
    public static String blueId() {
        return "2sHE2kou5HhCyamhJWgpd7yFC2uK9hfzif561s4W4C1F";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendPayoutRatio";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendPayoutRatio";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DividendPayoutRatio.json";
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

    private ReferenceWithMetaBasketConstituent basketConstituent;

    private Double cashRatio;

    private Double nonCashRatio;

    private Double totalRatio;

    public String getNamespace() {
        return namespace;
    }

    public DividendPayoutRatio namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaBasketConstituent getBasketConstituent() {
        return basketConstituent;
    }

    public DividendPayoutRatio basketConstituent(ReferenceWithMetaBasketConstituent basketConstituent) {
        this.basketConstituent = basketConstituent;
        return this;
    }

    public Double getCashRatio() {
        return cashRatio;
    }

    public DividendPayoutRatio cashRatio(Double cashRatio) {
        this.cashRatio = cashRatio;
        return this;
    }

    public Double getNonCashRatio() {
        return nonCashRatio;
    }

    public DividendPayoutRatio nonCashRatio(Double nonCashRatio) {
        this.nonCashRatio = nonCashRatio;
        return this;
    }

    public Double getTotalRatio() {
        return totalRatio;
    }

    public DividendPayoutRatio totalRatio(Double totalRatio) {
        this.totalRatio = totalRatio;
        return this;
    }

}
