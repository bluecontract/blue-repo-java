package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5rZCg68iGGiKxNzqKGrKhdGvwvL65GzoawTiePj97t9T")
public class CdmEventPositionPortfolioState {
    public static String blueId() {
        return "5rZCg68iGGiKxNzqKGrKhdGvwvL65GzoawTiePj97t9T";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/PortfolioState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/PortfolioState";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionPortfolioState.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonLineage lineage;

    private List<CdmEventPositionPosition> positions;

    public CdmEventCommonLineage getLineage() {
        return lineage;
    }

    public CdmEventPositionPortfolioState lineage(CdmEventCommonLineage lineage) {
        this.lineage = lineage;
        return this;
    }

    public List<CdmEventPositionPosition> getPositions() {
        return positions;
    }

    public CdmEventPositionPortfolioState positions(List<CdmEventPositionPosition> positions) {
        this.positions = positions;
        return this;
    }

}
