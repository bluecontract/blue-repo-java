package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FwUF23zZbbCn9Q7G7sFCnwv4LvfBr9gKzKJJXLiXYHA9")
public class InterestShortFall {
    public static String blueId() {
        return "FwUF23zZbbCn9Q7G7sFCnwv4LvfBr9gKzKJJXLiXYHA9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InterestShortFall";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InterestShortFall";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/InterestShortFall.json";
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

    private Boolean compounding;

    private InterestShortfallCapEnum interestShortfallCap;

    private FieldWithMetaFloatingRateIndexEnum rateSource;

    public String getNamespace() {
        return namespace;
    }

    public InterestShortFall namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getCompounding() {
        return compounding;
    }

    public InterestShortFall compounding(Boolean compounding) {
        this.compounding = compounding;
        return this;
    }

    public InterestShortfallCapEnum getInterestShortfallCap() {
        return interestShortfallCap;
    }

    public InterestShortFall interestShortfallCap(InterestShortfallCapEnum interestShortfallCap) {
        this.interestShortfallCap = interestShortfallCap;
        return this;
    }

    public FieldWithMetaFloatingRateIndexEnum getRateSource() {
        return rateSource;
    }

    public InterestShortFall rateSource(FieldWithMetaFloatingRateIndexEnum rateSource) {
        this.rateSource = rateSource;
        return this;
    }

}
