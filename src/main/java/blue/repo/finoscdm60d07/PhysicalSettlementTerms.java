package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3m58KyTdUVfLC2isgWAaeXbgpUroYQs7Btw6SK2g3pwo")
public class PhysicalSettlementTerms {
    public static String blueId() {
        return "3m58KyTdUVfLC2isgWAaeXbgpUroYQs7Btw6SK2g3pwo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PhysicalSettlementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PhysicalSettlementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PhysicalSettlementTerms.json";
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

    private Boolean clearedPhysicalSettlement;

    private DeliverableObligations deliverableObligations;

    private Boolean escrow;

    private PhysicalSettlementPeriod physicalSettlementPeriod;

    private AncillaryRoleEnum predeterminedClearingOrganizationParty;

    private Boolean sixtyBusinessDaySettlementCap;

    public String getNamespace() {
        return namespace;
    }

    public PhysicalSettlementTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getClearedPhysicalSettlement() {
        return clearedPhysicalSettlement;
    }

    public PhysicalSettlementTerms clearedPhysicalSettlement(Boolean clearedPhysicalSettlement) {
        this.clearedPhysicalSettlement = clearedPhysicalSettlement;
        return this;
    }

    public DeliverableObligations getDeliverableObligations() {
        return deliverableObligations;
    }

    public PhysicalSettlementTerms deliverableObligations(DeliverableObligations deliverableObligations) {
        this.deliverableObligations = deliverableObligations;
        return this;
    }

    public Boolean getEscrow() {
        return escrow;
    }

    public PhysicalSettlementTerms escrow(Boolean escrow) {
        this.escrow = escrow;
        return this;
    }

    public PhysicalSettlementPeriod getPhysicalSettlementPeriod() {
        return physicalSettlementPeriod;
    }

    public PhysicalSettlementTerms physicalSettlementPeriod(PhysicalSettlementPeriod physicalSettlementPeriod) {
        this.physicalSettlementPeriod = physicalSettlementPeriod;
        return this;
    }

    public AncillaryRoleEnum getPredeterminedClearingOrganizationParty() {
        return predeterminedClearingOrganizationParty;
    }

    public PhysicalSettlementTerms predeterminedClearingOrganizationParty(AncillaryRoleEnum predeterminedClearingOrganizationParty) {
        this.predeterminedClearingOrganizationParty = predeterminedClearingOrganizationParty;
        return this;
    }

    public Boolean getSixtyBusinessDaySettlementCap() {
        return sixtyBusinessDaySettlementCap;
    }

    public PhysicalSettlementTerms sixtyBusinessDaySettlementCap(Boolean sixtyBusinessDaySettlementCap) {
        this.sixtyBusinessDaySettlementCap = sixtyBusinessDaySettlementCap;
        return this;
    }

}
