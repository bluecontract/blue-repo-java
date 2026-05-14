package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4RCZSgkgKuU3dyCPEWp8nRGfoAB39jntQDca4ZQrSbYq")
public class Tranche {
    public static String blueId() {
        return "4RCZSgkgKuU3dyCPEWp8nRGfoAB39jntQDca4ZQrSbYq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Tranche";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Tranche";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Tranche.json";
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

    private Double attachmentPoint;

    private Double exhaustionPoint;

    private Boolean incurredRecoveryApplicable;

    public String getNamespace() {
        return namespace;
    }

    public Tranche namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getAttachmentPoint() {
        return attachmentPoint;
    }

    public Tranche attachmentPoint(Double attachmentPoint) {
        this.attachmentPoint = attachmentPoint;
        return this;
    }

    public Double getExhaustionPoint() {
        return exhaustionPoint;
    }

    public Tranche exhaustionPoint(Double exhaustionPoint) {
        this.exhaustionPoint = exhaustionPoint;
        return this;
    }

    public Boolean getIncurredRecoveryApplicable() {
        return incurredRecoveryApplicable;
    }

    public Tranche incurredRecoveryApplicable(Boolean incurredRecoveryApplicable) {
        this.incurredRecoveryApplicable = incurredRecoveryApplicable;
        return this;
    }

}
