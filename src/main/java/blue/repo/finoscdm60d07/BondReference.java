package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8KZ4GSY9TZHadh3ABZYJW37CHWch8JV9tCwdP7qUjrVq")
public class BondReference {
    public static String blueId() {
        return "8KZ4GSY9TZHadh3ABZYJW37CHWch8JV9tCwdP7qUjrVq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BondReference";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BondReference";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/BondReference.json";
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

    private Security bond;

    private Boolean conditionPrecedentBond;

    private FixedRateSpecification couponRate;

    private Boolean discrepancyClause;

    public String getNamespace() {
        return namespace;
    }

    public BondReference namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Security getBond() {
        return bond;
    }

    public BondReference bond(Security bond) {
        this.bond = bond;
        return this;
    }

    public Boolean getConditionPrecedentBond() {
        return conditionPrecedentBond;
    }

    public BondReference conditionPrecedentBond(Boolean conditionPrecedentBond) {
        this.conditionPrecedentBond = conditionPrecedentBond;
        return this;
    }

    public FixedRateSpecification getCouponRate() {
        return couponRate;
    }

    public BondReference couponRate(FixedRateSpecification couponRate) {
        this.couponRate = couponRate;
        return this;
    }

    public Boolean getDiscrepancyClause() {
        return discrepancyClause;
    }

    public BondReference discrepancyClause(Boolean discrepancyClause) {
        this.discrepancyClause = discrepancyClause;
        return this;
    }

}
