package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CNBnVnWSC7atVmZFrAE1NPVmcdah8bgGoEUdZ9fxKq75")
public class PayerReceiver {
    public static String blueId() {
        return "CNBnVnWSC7atVmZFrAE1NPVmcdah8bgGoEUdZ9fxKq75";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PayerReceiver";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PayerReceiver";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PayerReceiver.json";
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

    private CounterpartyRoleEnum payer;

    private CounterpartyRoleEnum receiver;

    public String getNamespace() {
        return namespace;
    }

    public PayerReceiver namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CounterpartyRoleEnum getPayer() {
        return payer;
    }

    public PayerReceiver payer(CounterpartyRoleEnum payer) {
        this.payer = payer;
        return this;
    }

    public CounterpartyRoleEnum getReceiver() {
        return receiver;
    }

    public PayerReceiver receiver(CounterpartyRoleEnum receiver) {
        this.receiver = receiver;
        return this;
    }

}
