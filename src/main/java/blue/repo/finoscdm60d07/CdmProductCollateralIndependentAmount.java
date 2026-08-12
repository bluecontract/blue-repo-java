package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EQmduWyUz4nRgJ7wreWQ4eBSJ2hAt8nBDsWf1oSNgeR4")
public class CdmProductCollateralIndependentAmount {
    public static String blueId() {
        return "EQmduWyUz4nRgJ7wreWQ4eBSJ2hAt8nBDsWf1oSNgeR4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/IndependentAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/IndependentAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralIndependentAmount.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount payerAccountReference;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty payerPartyReference;

    private List<CdmProductCommonSettlementPaymentDetail> paymentDetail;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount receiverAccountReference;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty receiverPartyReference;

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount getPayerAccountReference() {
        return payerAccountReference;
    }

    public CdmProductCollateralIndependentAmount payerAccountReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount payerAccountReference) {
        this.payerAccountReference = payerAccountReference;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getPayerPartyReference() {
        return payerPartyReference;
    }

    public CdmProductCollateralIndependentAmount payerPartyReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty payerPartyReference) {
        this.payerPartyReference = payerPartyReference;
        return this;
    }

    public List<CdmProductCommonSettlementPaymentDetail> getPaymentDetail() {
        return paymentDetail;
    }

    public CdmProductCollateralIndependentAmount paymentDetail(List<CdmProductCommonSettlementPaymentDetail> paymentDetail) {
        this.paymentDetail = paymentDetail;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount getReceiverAccountReference() {
        return receiverAccountReference;
    }

    public CdmProductCollateralIndependentAmount receiverAccountReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount receiverAccountReference) {
        this.receiverAccountReference = receiverAccountReference;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getReceiverPartyReference() {
        return receiverPartyReference;
    }

    public CdmProductCollateralIndependentAmount receiverPartyReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty receiverPartyReference) {
        this.receiverPartyReference = receiverPartyReference;
        return this;
    }

}
