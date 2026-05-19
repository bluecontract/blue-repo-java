package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2yyk9C9m7MJ7bKTB13P7TidBUyur7Yd2PVveJetpPLLp")
public class CollateralProvisions {
    public static String blueId() {
        return "2yyk9C9m7MJ7bKTB13P7TidBUyur7Yd2PVveJetpPLLp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralProvisions";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralProvisions";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CollateralProvisions.json";
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

    private CollateralTypeEnum collateralType;

    private List<EligibleCollateralCriteria> eligibleCollateral;

    private SubstitutionProvisions substitutionProvisions;

    public String getNamespace() {
        return namespace;
    }

    public CollateralProvisions namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CollateralTypeEnum getCollateralType() {
        return collateralType;
    }

    public CollateralProvisions collateralType(CollateralTypeEnum collateralType) {
        this.collateralType = collateralType;
        return this;
    }

    public List<EligibleCollateralCriteria> getEligibleCollateral() {
        return eligibleCollateral;
    }

    public CollateralProvisions eligibleCollateral(List<EligibleCollateralCriteria> eligibleCollateral) {
        this.eligibleCollateral = eligibleCollateral;
        return this;
    }

    public SubstitutionProvisions getSubstitutionProvisions() {
        return substitutionProvisions;
    }

    public CollateralProvisions substitutionProvisions(SubstitutionProvisions substitutionProvisions) {
        this.substitutionProvisions = substitutionProvisions;
        return this;
    }

}
