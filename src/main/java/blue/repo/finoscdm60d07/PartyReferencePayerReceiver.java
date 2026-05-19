package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DzcSyuRzPL3vpodnqxgMhmMGKDzwiLPEL3Gtk8rtVzr1")
public class PartyReferencePayerReceiver {
    public static String blueId() {
        return "DzcSyuRzPL3vpodnqxgMhmMGKDzwiLPEL3Gtk8rtVzr1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PartyReferencePayerReceiver";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PartyReferencePayerReceiver";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PartyReferencePayerReceiver.json";
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

    private ReferenceWithMetaAccount payerAccountReference;

    private ReferenceWithMetaParty payerPartyReference;

    private ReferenceWithMetaAccount receiverAccountReference;

    private ReferenceWithMetaParty receiverPartyReference;

    public String getNamespace() {
        return namespace;
    }

    public PartyReferencePayerReceiver namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaAccount getPayerAccountReference() {
        return payerAccountReference;
    }

    public PartyReferencePayerReceiver payerAccountReference(ReferenceWithMetaAccount payerAccountReference) {
        this.payerAccountReference = payerAccountReference;
        return this;
    }

    public ReferenceWithMetaParty getPayerPartyReference() {
        return payerPartyReference;
    }

    public PartyReferencePayerReceiver payerPartyReference(ReferenceWithMetaParty payerPartyReference) {
        this.payerPartyReference = payerPartyReference;
        return this;
    }

    public ReferenceWithMetaAccount getReceiverAccountReference() {
        return receiverAccountReference;
    }

    public PartyReferencePayerReceiver receiverAccountReference(ReferenceWithMetaAccount receiverAccountReference) {
        this.receiverAccountReference = receiverAccountReference;
        return this;
    }

    public ReferenceWithMetaParty getReceiverPartyReference() {
        return receiverPartyReference;
    }

    public PartyReferencePayerReceiver receiverPartyReference(ReferenceWithMetaParty receiverPartyReference) {
        this.receiverPartyReference = receiverPartyReference;
        return this;
    }

}
