package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("CBd7ZWKAnVWWTwFSHphamHTzqi86dtsgpe4aNTpHVHMe")
public class CdmProductCommonSettlementPhysicalSettlementPeriod {
    public static String blueId() {
        return "CBd7ZWKAnVWWTwFSHphamHTzqi86dtsgpe4aNTpHVHMe";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/PhysicalSettlementPeriod";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/PhysicalSettlementPeriod";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementPhysicalSettlementPeriod.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger businessDays;

    private Boolean businessDaysNotSpecified;

    private BigInteger maximumBusinessDays;

    public BigInteger getBusinessDays() {
        return businessDays;
    }

    public CdmProductCommonSettlementPhysicalSettlementPeriod businessDays(BigInteger businessDays) {
        this.businessDays = businessDays;
        return this;
    }

    public Boolean getBusinessDaysNotSpecified() {
        return businessDaysNotSpecified;
    }

    public CdmProductCommonSettlementPhysicalSettlementPeriod businessDaysNotSpecified(Boolean businessDaysNotSpecified) {
        this.businessDaysNotSpecified = businessDaysNotSpecified;
        return this;
    }

    public BigInteger getMaximumBusinessDays() {
        return maximumBusinessDays;
    }

    public CdmProductCommonSettlementPhysicalSettlementPeriod maximumBusinessDays(BigInteger maximumBusinessDays) {
        this.maximumBusinessDays = maximumBusinessDays;
        return this;
    }

}
