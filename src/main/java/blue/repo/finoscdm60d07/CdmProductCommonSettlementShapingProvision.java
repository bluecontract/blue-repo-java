package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AfrWwmNcruweRhizeK8snayCmtH1PEXLFinSber5QgY5")
public class CdmProductCommonSettlementShapingProvision {
    public static String blueId() {
        return "AfrWwmNcruweRhizeK8snayCmtH1PEXLFinSber5QgY5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/ShapingProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/ShapingProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementShapingProvision.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmObservableAssetMoney> shapeSchedule;

    public List<CdmObservableAssetMoney> getShapeSchedule() {
        return shapeSchedule;
    }

    public CdmProductCommonSettlementShapingProvision shapeSchedule(List<CdmObservableAssetMoney> shapeSchedule) {
        this.shapeSchedule = shapeSchedule;
        return this;
    }

}
