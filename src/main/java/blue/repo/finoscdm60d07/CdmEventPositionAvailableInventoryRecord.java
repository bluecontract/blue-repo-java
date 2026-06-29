package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2V4dGZWz8cuGsz2de8Z56U5MbYQwAFwUMekoMx6KF9MR")
public class CdmEventPositionAvailableInventoryRecord {
    public static String blueId() {
        return "2V4dGZWz8cuGsz2de8Z56U5MbYQwAFwUMekoMx6KF9MR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/AvailableInventoryRecord";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/AvailableInventoryRecord";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionAvailableInventoryRecord.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductCollateralCollateralProvisions> collateral;

    private String expirationDateTime;

    private CdmBaseStaticdataIdentifierAssignedIdentifier identifer;

    private CdmObservableAssetPrice interestRate;

    private List<CdmBaseStaticdataPartyPartyRole> partyRole;

    private CdmBaseMathQuantity quantity;

    private CdmBaseStaticdataAssetCommonSecurity security;

    public List<CdmProductCollateralCollateralProvisions> getCollateral() {
        return collateral;
    }

    public CdmEventPositionAvailableInventoryRecord collateral(List<CdmProductCollateralCollateralProvisions> collateral) {
        this.collateral = collateral;
        return this;
    }

    public String getExpirationDateTime() {
        return expirationDateTime;
    }

    public CdmEventPositionAvailableInventoryRecord expirationDateTime(String expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    public CdmBaseStaticdataIdentifierAssignedIdentifier getIdentifer() {
        return identifer;
    }

    public CdmEventPositionAvailableInventoryRecord identifer(CdmBaseStaticdataIdentifierAssignedIdentifier identifer) {
        this.identifer = identifer;
        return this;
    }

    public CdmObservableAssetPrice getInterestRate() {
        return interestRate;
    }

    public CdmEventPositionAvailableInventoryRecord interestRate(CdmObservableAssetPrice interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    public List<CdmBaseStaticdataPartyPartyRole> getPartyRole() {
        return partyRole;
    }

    public CdmEventPositionAvailableInventoryRecord partyRole(List<CdmBaseStaticdataPartyPartyRole> partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    public CdmBaseMathQuantity getQuantity() {
        return quantity;
    }

    public CdmEventPositionAvailableInventoryRecord quantity(CdmBaseMathQuantity quantity) {
        this.quantity = quantity;
        return this;
    }

    public CdmBaseStaticdataAssetCommonSecurity getSecurity() {
        return security;
    }

    public CdmEventPositionAvailableInventoryRecord security(CdmBaseStaticdataAssetCommonSecurity security) {
        this.security = security;
        return this;
    }

}
