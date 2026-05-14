package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AnEwD3padq9AHwwbWVMRCrzr5UC2Gd2kTsRmdRxTEe3p")
public class FloatingAmountProvisions {
    public static String blueId() {
        return "AnEwD3padq9AHwwbWVMRCrzr5UC2Gd2kTsRmdRxTEe3p";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingAmountProvisions";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingAmountProvisions";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FloatingAmountProvisions.json";
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

    private Boolean stepUpProvision;

    private Boolean wacCapInterestProvision;

    public String getNamespace() {
        return namespace;
    }

    public FloatingAmountProvisions namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getStepUpProvision() {
        return stepUpProvision;
    }

    public FloatingAmountProvisions stepUpProvision(Boolean stepUpProvision) {
        this.stepUpProvision = stepUpProvision;
        return this;
    }

    public Boolean getWacCapInterestProvision() {
        return wacCapInterestProvision;
    }

    public FloatingAmountProvisions wacCapInterestProvision(Boolean wacCapInterestProvision) {
        this.wacCapInterestProvision = wacCapInterestProvision;
        return this;
    }

}
