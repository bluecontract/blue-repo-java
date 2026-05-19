package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DWR17UFH2H7kBPb8p4Xsm5nBTDWbASTaqxAUQkAoDwhp")
public class AvailableInventoryRecord {
    public static String blueId() {
        return "DWR17UFH2H7kBPb8p4Xsm5nBTDWbASTaqxAUQkAoDwhp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AvailableInventoryRecord";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AvailableInventoryRecord";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AvailableInventoryRecord.json";
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

    private List<CollateralProvisions> collateral;

    private String expirationDateTime;

    private AssignedIdentifier identifer;

    private Price interestRate;

    private List<PartyRole> partyRole;

    private Quantity quantity;

    private Security security;

    public String getNamespace() {
        return namespace;
    }

    public AvailableInventoryRecord namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CollateralProvisions> getCollateral() {
        return collateral;
    }

    public AvailableInventoryRecord collateral(List<CollateralProvisions> collateral) {
        this.collateral = collateral;
        return this;
    }

    public String getExpirationDateTime() {
        return expirationDateTime;
    }

    public AvailableInventoryRecord expirationDateTime(String expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    public AssignedIdentifier getIdentifer() {
        return identifer;
    }

    public AvailableInventoryRecord identifer(AssignedIdentifier identifer) {
        this.identifer = identifer;
        return this;
    }

    public Price getInterestRate() {
        return interestRate;
    }

    public AvailableInventoryRecord interestRate(Price interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    public List<PartyRole> getPartyRole() {
        return partyRole;
    }

    public AvailableInventoryRecord partyRole(List<PartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public AvailableInventoryRecord quantity(Quantity quantity) {
        this.quantity = quantity;
        return this;
    }

    public Security getSecurity() {
        return security;
    }

    public AvailableInventoryRecord security(Security security) {
        this.security = security;
        return this;
    }

}
