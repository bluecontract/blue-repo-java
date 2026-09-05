package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4ogWUY8fNgMAtUBe5JRjDLenkYFKnv52vpyUuneiwEvW")
public class CdmEventCommonTransfer {
    public static String blueId() {
        return "4ogWUY8fNgMAtUBe5JRjDLenkYFKnv52vpyUuneiwEvW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/Transfer";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/Transfer";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonTransfer.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonAsset asset;

    private List<CdmBaseStaticdataIdentifierFieldWithMetaIdentifier> identifier;

    private CdmBaseStaticdataPartyPartyReferencePayerReceiver payerReceiver;

    private CdmBaseMathNonNegativeQuantity quantity;

    private CdmEventCommonReset resetOrigin;

    private CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate settlementDate;

    private CdmProductTemplateMetafieldsReferenceWithMetaPayout settlementOrigin;

    private CdmEventCommonTransferExpression transferExpression;

    public CdmBaseStaticdataAssetCommonAsset getAsset() {
        return asset;
    }

    public CdmEventCommonTransfer asset(CdmBaseStaticdataAssetCommonAsset asset) {
        this.asset = asset;
        return this;
    }

    public List<CdmBaseStaticdataIdentifierFieldWithMetaIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmEventCommonTransfer identifier(List<CdmBaseStaticdataIdentifierFieldWithMetaIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmBaseStaticdataPartyPartyReferencePayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmEventCommonTransfer payerReceiver(CdmBaseStaticdataPartyPartyReferencePayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

    public CdmBaseMathNonNegativeQuantity getQuantity() {
        return quantity;
    }

    public CdmEventCommonTransfer quantity(CdmBaseMathNonNegativeQuantity quantity) {
        this.quantity = quantity;
        return this;
    }

    public CdmEventCommonReset getResetOrigin() {
        return resetOrigin;
    }

    public CdmEventCommonTransfer resetOrigin(CdmEventCommonReset resetOrigin) {
        this.resetOrigin = resetOrigin;
        return this;
    }

    public CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate getSettlementDate() {
        return settlementDate;
    }

    public CdmEventCommonTransfer settlementDate(CdmBaseDatetimeAdjustableOrAdjustedOrRelativeDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    public CdmProductTemplateMetafieldsReferenceWithMetaPayout getSettlementOrigin() {
        return settlementOrigin;
    }

    public CdmEventCommonTransfer settlementOrigin(CdmProductTemplateMetafieldsReferenceWithMetaPayout settlementOrigin) {
        this.settlementOrigin = settlementOrigin;
        return this;
    }

    public CdmEventCommonTransferExpression getTransferExpression() {
        return transferExpression;
    }

    public CdmEventCommonTransfer transferExpression(CdmEventCommonTransferExpression transferExpression) {
        this.transferExpression = transferExpression;
        return this;
    }

}
