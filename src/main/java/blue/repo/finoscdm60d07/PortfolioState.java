package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9HTK32vR9tDdbV4xki4S2wwM5wzHYjJuTvG4xCLpqPX9")
public class PortfolioState {
    public static String blueId() {
        return "9HTK32vR9tDdbV4xki4S2wwM5wzHYjJuTvG4xCLpqPX9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PortfolioState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PortfolioState";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PortfolioState.json";
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

    private Lineage lineage;

    private List<Position> positions;

    public String getNamespace() {
        return namespace;
    }

    public PortfolioState namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Lineage getLineage() {
        return lineage;
    }

    public PortfolioState lineage(Lineage lineage) {
        this.lineage = lineage;
        return this;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public PortfolioState positions(List<Position> positions) {
        this.positions = positions;
        return this;
    }

}
