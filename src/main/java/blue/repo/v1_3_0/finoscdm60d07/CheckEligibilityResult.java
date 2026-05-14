package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("ANnLYrAsJL3sf4EtTcPxJBJexNj6ZjJMvvCDyXNYeE8M")
public class CheckEligibilityResult {
    public static String blueId() {
        return "ANnLYrAsJL3sf4EtTcPxJBJexNj6ZjJMvvCDyXNYeE8M";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CheckEligibilityResult";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CheckEligibilityResult";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CheckEligibilityResult.json";
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

    private EligibilityQuery eligibilityQuery;

    private Boolean isEligible;

    private List<EligibleCollateralCriteria> matchingEligibleCriteria;

    private EligibleCollateralSpecification specification;

    public String getNamespace() {
        return namespace;
    }

    public CheckEligibilityResult namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public EligibilityQuery getEligibilityQuery() {
        return eligibilityQuery;
    }

    public CheckEligibilityResult eligibilityQuery(EligibilityQuery eligibilityQuery) {
        this.eligibilityQuery = eligibilityQuery;
        return this;
    }

    public Boolean getIsEligible() {
        return isEligible;
    }

    public CheckEligibilityResult isEligible(Boolean isEligible) {
        this.isEligible = isEligible;
        return this;
    }

    public List<EligibleCollateralCriteria> getMatchingEligibleCriteria() {
        return matchingEligibleCriteria;
    }

    public CheckEligibilityResult matchingEligibleCriteria(List<EligibleCollateralCriteria> matchingEligibleCriteria) {
        this.matchingEligibleCriteria = matchingEligibleCriteria;
        return this;
    }

    public EligibleCollateralSpecification getSpecification() {
        return specification;
    }

    public CheckEligibilityResult specification(EligibleCollateralSpecification specification) {
        this.specification = specification;
        return this;
    }

}
