package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DwimPH5LrR64QgUrh2Wbhb7WgNxs9bZvJyKvRh4qHHLN")
public class CdmProductCommonSettlementPhysicalSettlementTerms {
    public static String blueId() {
        return "DwimPH5LrR64QgUrh2Wbhb7WgNxs9bZvJyKvRh4qHHLN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/PhysicalSettlementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/PhysicalSettlementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementPhysicalSettlementTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean clearedPhysicalSettlement;

    private CdmProductCommonSettlementDeliverableObligations deliverableObligations;

    private Boolean escrow;

    private CdmProductCommonSettlementPhysicalSettlementPeriod physicalSettlementPeriod;

    private CdmBaseStaticdataPartyAncillaryRoleEnum predeterminedClearingOrganizationParty;

    private Boolean sixtyBusinessDaySettlementCap;

    public Boolean getClearedPhysicalSettlement() {
        return clearedPhysicalSettlement;
    }

    public CdmProductCommonSettlementPhysicalSettlementTerms clearedPhysicalSettlement(Boolean clearedPhysicalSettlement) {
        this.clearedPhysicalSettlement = clearedPhysicalSettlement;
        return this;
    }

    public CdmProductCommonSettlementDeliverableObligations getDeliverableObligations() {
        return deliverableObligations;
    }

    public CdmProductCommonSettlementPhysicalSettlementTerms deliverableObligations(CdmProductCommonSettlementDeliverableObligations deliverableObligations) {
        this.deliverableObligations = deliverableObligations;
        return this;
    }

    public Boolean getEscrow() {
        return escrow;
    }

    public CdmProductCommonSettlementPhysicalSettlementTerms escrow(Boolean escrow) {
        this.escrow = escrow;
        return this;
    }

    public CdmProductCommonSettlementPhysicalSettlementPeriod getPhysicalSettlementPeriod() {
        return physicalSettlementPeriod;
    }

    public CdmProductCommonSettlementPhysicalSettlementTerms physicalSettlementPeriod(CdmProductCommonSettlementPhysicalSettlementPeriod physicalSettlementPeriod) {
        this.physicalSettlementPeriod = physicalSettlementPeriod;
        return this;
    }

    public CdmBaseStaticdataPartyAncillaryRoleEnum getPredeterminedClearingOrganizationParty() {
        return predeterminedClearingOrganizationParty;
    }

    public CdmProductCommonSettlementPhysicalSettlementTerms predeterminedClearingOrganizationParty(CdmBaseStaticdataPartyAncillaryRoleEnum predeterminedClearingOrganizationParty) {
        this.predeterminedClearingOrganizationParty = predeterminedClearingOrganizationParty;
        return this;
    }

    public Boolean getSixtyBusinessDaySettlementCap() {
        return sixtyBusinessDaySettlementCap;
    }

    public CdmProductCommonSettlementPhysicalSettlementTerms sixtyBusinessDaySettlementCap(Boolean sixtyBusinessDaySettlementCap) {
        this.sixtyBusinessDaySettlementCap = sixtyBusinessDaySettlementCap;
        return this;
    }

}
