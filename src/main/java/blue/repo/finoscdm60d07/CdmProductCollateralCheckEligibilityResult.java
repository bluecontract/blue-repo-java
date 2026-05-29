package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8pw6JkCCYeY12KxskWE7kWSio6V6Zi1HdHrYoZwAzszo")
public class CdmProductCollateralCheckEligibilityResult {
    public static String blueId() {
        return "8pw6JkCCYeY12KxskWE7kWSio6V6Zi1HdHrYoZwAzszo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CheckEligibilityResult";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CheckEligibilityResult";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCheckEligibilityResult.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCollateralEligibilityQuery eligibilityQuery;

    private Boolean isEligible;

    private List<CdmProductCollateralEligibleCollateralCriteria> matchingEligibleCriteria;

    private CdmProductCollateralEligibleCollateralSpecification specification;

    public CdmProductCollateralEligibilityQuery getEligibilityQuery() {
        return eligibilityQuery;
    }

    public CdmProductCollateralCheckEligibilityResult eligibilityQuery(CdmProductCollateralEligibilityQuery eligibilityQuery) {
        this.eligibilityQuery = eligibilityQuery;
        return this;
    }

    public Boolean getIsEligible() {
        return isEligible;
    }

    public CdmProductCollateralCheckEligibilityResult isEligible(Boolean isEligible) {
        this.isEligible = isEligible;
        return this;
    }

    public List<CdmProductCollateralEligibleCollateralCriteria> getMatchingEligibleCriteria() {
        return matchingEligibleCriteria;
    }

    public CdmProductCollateralCheckEligibilityResult matchingEligibleCriteria(List<CdmProductCollateralEligibleCollateralCriteria> matchingEligibleCriteria) {
        this.matchingEligibleCriteria = matchingEligibleCriteria;
        return this;
    }

    public CdmProductCollateralEligibleCollateralSpecification getSpecification() {
        return specification;
    }

    public CdmProductCollateralCheckEligibilityResult specification(CdmProductCollateralEligibleCollateralSpecification specification) {
        this.specification = specification;
        return this;
    }

}
