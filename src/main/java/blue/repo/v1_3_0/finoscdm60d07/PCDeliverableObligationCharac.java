package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9qnLZPxtC1JNict3LrgjPPV3FnHMbj94zLqH1GYYx4Zr")
public class PCDeliverableObligationCharac {
    public static String blueId() {
        return "9qnLZPxtC1JNict3LrgjPPV3FnHMbj94zLqH1GYYx4Zr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PCDeliverableObligationCharac";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PCDeliverableObligationCharac";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PCDeliverableObligationCharac.json";
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

    private Boolean applicable;

    private Boolean partialCashSettlement;

    public String getNamespace() {
        return namespace;
    }

    public PCDeliverableObligationCharac namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getApplicable() {
        return applicable;
    }

    public PCDeliverableObligationCharac applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public Boolean getPartialCashSettlement() {
        return partialCashSettlement;
    }

    public PCDeliverableObligationCharac partialCashSettlement(Boolean partialCashSettlement) {
        this.partialCashSettlement = partialCashSettlement;
        return this;
    }

}
