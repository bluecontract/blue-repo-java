package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4KPsevPymRbhd5mUxDmcGESCU7R7gQRreNBU9VoKQhDm")
public class EligibleCollateralSpecificationInstruction {
    public static String blueId() {
        return "4KPsevPymRbhd5mUxDmcGESCU7R7gQRreNBU9VoKQhDm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EligibleCollateralSpecificationInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EligibleCollateralSpecificationInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/EligibleCollateralSpecificationInstruction.json";
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

    private EligibleCollateralCriteria common;

    private List<EligibleCollateralCriteria> variable;

    public String getNamespace() {
        return namespace;
    }

    public EligibleCollateralSpecificationInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public EligibleCollateralCriteria getCommon() {
        return common;
    }

    public EligibleCollateralSpecificationInstruction common(EligibleCollateralCriteria common) {
        this.common = common;
        return this;
    }

    public List<EligibleCollateralCriteria> getVariable() {
        return variable;
    }

    public EligibleCollateralSpecificationInstruction variable(List<EligibleCollateralCriteria> variable) {
        this.variable = variable;
        return this;
    }

}
