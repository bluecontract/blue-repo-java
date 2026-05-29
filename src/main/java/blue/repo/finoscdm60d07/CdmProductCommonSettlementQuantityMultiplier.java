package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("79Ry9iFoztQFLqbJd14VY6TdYLERCC9nCzJ7yCnyNRMM")
public class CdmProductCommonSettlementQuantityMultiplier {
    public static String blueId() {
        return "79Ry9iFoztQFLqbJd14VY6TdYLERCC9nCzJ7yCnyNRMM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/QuantityMultiplier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/QuantityMultiplier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementQuantityMultiplier.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonScheduleFxLinkedNotionalSchedule fxLinkedNotionalSchedule;

    private Double multiplierValue;

    public CdmProductCommonScheduleFxLinkedNotionalSchedule getFxLinkedNotionalSchedule() {
        return fxLinkedNotionalSchedule;
    }

    public CdmProductCommonSettlementQuantityMultiplier fxLinkedNotionalSchedule(CdmProductCommonScheduleFxLinkedNotionalSchedule fxLinkedNotionalSchedule) {
        this.fxLinkedNotionalSchedule = fxLinkedNotionalSchedule;
        return this;
    }

    public Double getMultiplierValue() {
        return multiplierValue;
    }

    public CdmProductCommonSettlementQuantityMultiplier multiplierValue(Double multiplierValue) {
        this.multiplierValue = multiplierValue;
        return this;
    }

}
