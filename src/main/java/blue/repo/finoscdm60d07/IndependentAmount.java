package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4RzGq4MLA1qQqnP84sh6jMpSdBp6L5vAVJS6TegWmXq3")
public class IndependentAmount {
    public static String blueId() {
        return "4RzGq4MLA1qQqnP84sh6jMpSdBp6L5vAVJS6TegWmXq3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "IndependentAmount";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/IndependentAmount";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/IndependentAmount.json";
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

    private List<PaymentDetail> paymentDetail;

    private ReferenceWithMetaAccount receiverAccountReference;

    private ReferenceWithMetaParty receiverPartyReference;

    public String getNamespace() {
        return namespace;
    }

    public IndependentAmount namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaAccount getPayerAccountReference() {
        return payerAccountReference;
    }

    public IndependentAmount payerAccountReference(ReferenceWithMetaAccount payerAccountReference) {
        this.payerAccountReference = payerAccountReference;
        return this;
    }

    public ReferenceWithMetaParty getPayerPartyReference() {
        return payerPartyReference;
    }

    public IndependentAmount payerPartyReference(ReferenceWithMetaParty payerPartyReference) {
        this.payerPartyReference = payerPartyReference;
        return this;
    }

    public List<PaymentDetail> getPaymentDetail() {
        return paymentDetail;
    }

    public IndependentAmount paymentDetail(List<PaymentDetail> paymentDetail) {
        this.paymentDetail = paymentDetail;
        return this;
    }

    public ReferenceWithMetaAccount getReceiverAccountReference() {
        return receiverAccountReference;
    }

    public IndependentAmount receiverAccountReference(ReferenceWithMetaAccount receiverAccountReference) {
        this.receiverAccountReference = receiverAccountReference;
        return this;
    }

    public ReferenceWithMetaParty getReceiverPartyReference() {
        return receiverPartyReference;
    }

    public IndependentAmount receiverPartyReference(ReferenceWithMetaParty receiverPartyReference) {
        this.receiverPartyReference = receiverPartyReference;
        return this;
    }

}
