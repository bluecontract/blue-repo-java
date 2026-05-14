package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BykSB5QpNpsDqEd8s7QeafG3rDkANw3GfuRc14cMuH4B")
public class PassThroughItem {
    public static String blueId() {
        return "BykSB5QpNpsDqEd8s7QeafG3rDkANw3GfuRc14cMuH4B";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PassThroughItem";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PassThroughItem";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PassThroughItem.json";
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

    private Double passThroughPercentage;

    private PayerReceiver payerReceiver;

    public String getNamespace() {
        return namespace;
    }

    public PassThroughItem namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getPassThroughPercentage() {
        return passThroughPercentage;
    }

    public PassThroughItem passThroughPercentage(Double passThroughPercentage) {
        this.passThroughPercentage = passThroughPercentage;
        return this;
    }

    public PayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public PassThroughItem payerReceiver(PayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

}
