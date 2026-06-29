package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2LmejohDGLXaXF2jDmkccaa7GSQbnbp8iBMKmrxifhWs")
public class CdmBaseStaticdataPartyPartyReferencePayerReceiver {
    public static String blueId() {
        return "2LmejohDGLXaXF2jDmkccaa7GSQbnbp8iBMKmrxifhWs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/PartyReferencePayerReceiver";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/PartyReferencePayerReceiver";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyPartyReferencePayerReceiver.json";
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

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount receiverAccountReference;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty receiverPartyReference;

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount getPayerAccountReference() {
        return payerAccountReference;
    }

    public CdmBaseStaticdataPartyPartyReferencePayerReceiver payerAccountReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount payerAccountReference) {
        this.payerAccountReference = payerAccountReference;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getPayerPartyReference() {
        return payerPartyReference;
    }

    public CdmBaseStaticdataPartyPartyReferencePayerReceiver payerPartyReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty payerPartyReference) {
        this.payerPartyReference = payerPartyReference;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount getReceiverAccountReference() {
        return receiverAccountReference;
    }

    public CdmBaseStaticdataPartyPartyReferencePayerReceiver receiverAccountReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaAccount receiverAccountReference) {
        this.receiverAccountReference = receiverAccountReference;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getReceiverPartyReference() {
        return receiverPartyReference;
    }

    public CdmBaseStaticdataPartyPartyReferencePayerReceiver receiverPartyReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty receiverPartyReference) {
        this.receiverPartyReference = receiverPartyReference;
        return this;
    }

}
