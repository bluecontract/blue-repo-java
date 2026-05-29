package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7QEnknzp6vj79Sby1jPaesidRLAV5FSUBdYAAk5o7Pz9")
public class CdmProductCommonSettlementSettlementProvision {
    public static String blueId() {
        return "7QEnknzp6vj79Sby1jPaesidRLAV5FSUBdYAAk5o7Pz9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/SettlementProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/SettlementProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementSettlementProvision.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonSettlementShapingProvision shapingProvisions;

    public CdmProductCommonSettlementShapingProvision getShapingProvisions() {
        return shapingProvisions;
    }

    public CdmProductCommonSettlementSettlementProvision shapingProvisions(CdmProductCommonSettlementShapingProvision shapingProvisions) {
        this.shapingProvisions = shapingProvisions;
        return this;
    }

}
