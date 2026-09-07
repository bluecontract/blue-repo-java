package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8GwJpcXzqvYXswXp8a8aTcKMskQHVACn5Y7r8P7xA4rk")
public class CdmProductCollateralEligibleCollateralSpecificationInstruction {
    public static String blueId() {
        return "8GwJpcXzqvYXswXp8a8aTcKMskQHVACn5Y7r8P7xA4rk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/EligibleCollateralSpecificationInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/EligibleCollateralSpecificationInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralEligibleCollateralSpecificationInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralEligibleCollateralCriteria common;

    private List<CdmProductCollateralEligibleCollateralCriteria> variable;

    public CdmProductCollateralEligibleCollateralCriteria getCommon() {
        return common;
    }

    public CdmProductCollateralEligibleCollateralSpecificationInstruction common(CdmProductCollateralEligibleCollateralCriteria common) {
        this.common = common;
        return this;
    }

    public List<CdmProductCollateralEligibleCollateralCriteria> getVariable() {
        return variable;
    }

    public CdmProductCollateralEligibleCollateralSpecificationInstruction variable(List<CdmProductCollateralEligibleCollateralCriteria> variable) {
        this.variable = variable;
        return this;
    }

}
