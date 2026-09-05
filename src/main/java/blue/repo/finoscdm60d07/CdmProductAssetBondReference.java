package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3XUwpeG8Rb6vKyvfK4s1gtS24iWf9BADoec8gGHY75UE")
public class CdmProductAssetBondReference {
    public static String blueId() {
        return "3XUwpeG8Rb6vKyvfK4s1gtS24iWf9BADoec8gGHY75UE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/BondReference";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/BondReference";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetBondReference.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonSecurity bond;

    private Boolean conditionPrecedentBond;

    private CdmProductAssetFixedRateSpecification couponRate;

    private Boolean discrepancyClause;

    public CdmBaseStaticdataAssetCommonSecurity getBond() {
        return bond;
    }

    public CdmProductAssetBondReference bond(CdmBaseStaticdataAssetCommonSecurity bond) {
        this.bond = bond;
        return this;
    }

    public Boolean getConditionPrecedentBond() {
        return conditionPrecedentBond;
    }

    public CdmProductAssetBondReference conditionPrecedentBond(Boolean conditionPrecedentBond) {
        this.conditionPrecedentBond = conditionPrecedentBond;
        return this;
    }

    public CdmProductAssetFixedRateSpecification getCouponRate() {
        return couponRate;
    }

    public CdmProductAssetBondReference couponRate(CdmProductAssetFixedRateSpecification couponRate) {
        this.couponRate = couponRate;
        return this;
    }

    public Boolean getDiscrepancyClause() {
        return discrepancyClause;
    }

    public CdmProductAssetBondReference discrepancyClause(Boolean discrepancyClause) {
        this.discrepancyClause = discrepancyClause;
        return this;
    }

}
