package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("HNEJxKoFrt89XnjespJbKNh883vEkdoqipkBMc2wHA4K")
public class PhysicalSettlementPeriod {
    public static String blueId() {
        return "HNEJxKoFrt89XnjespJbKNh883vEkdoqipkBMc2wHA4K";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PhysicalSettlementPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PhysicalSettlementPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PhysicalSettlementPeriod.json";
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

    private BigInteger businessDays;

    private Boolean businessDaysNotSpecified;

    private BigInteger maximumBusinessDays;

    public String getNamespace() {
        return namespace;
    }

    public PhysicalSettlementPeriod namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getBusinessDays() {
        return businessDays;
    }

    public PhysicalSettlementPeriod businessDays(BigInteger businessDays) {
        this.businessDays = businessDays;
        return this;
    }

    public Boolean getBusinessDaysNotSpecified() {
        return businessDaysNotSpecified;
    }

    public PhysicalSettlementPeriod businessDaysNotSpecified(Boolean businessDaysNotSpecified) {
        this.businessDaysNotSpecified = businessDaysNotSpecified;
        return this;
    }

    public BigInteger getMaximumBusinessDays() {
        return maximumBusinessDays;
    }

    public PhysicalSettlementPeriod maximumBusinessDays(BigInteger maximumBusinessDays) {
        this.maximumBusinessDays = maximumBusinessDays;
        return this;
    }

}
