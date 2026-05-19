package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("AGVxCtsQQF7AKefonhCQjbTYbctSpb1Cz3gm7w6Z4ig9")
public class Lineage {
    public static String blueId() {
        return "AGVxCtsQQF7AKefonhCQjbTYbctSpb1Cz3gm7w6Z4ig9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Lineage";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Lineage";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Lineage.json";
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

    private List<ReferenceWithMetaWorkflowStep> eventReference;

    private List<ReferenceWithMetaPortfolioState> portfolioStateReference;

    private List<ReferenceWithMetaTrade> tradeReference;

    public String getNamespace() {
        return namespace;
    }

    public Lineage namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ReferenceWithMetaWorkflowStep> getEventReference() {
        return eventReference;
    }

    public Lineage eventReference(List<ReferenceWithMetaWorkflowStep> eventReference) {
        this.eventReference = eventReference;
        return this;
    }

    public List<ReferenceWithMetaPortfolioState> getPortfolioStateReference() {
        return portfolioStateReference;
    }

    public Lineage portfolioStateReference(List<ReferenceWithMetaPortfolioState> portfolioStateReference) {
        this.portfolioStateReference = portfolioStateReference;
        return this;
    }

    public List<ReferenceWithMetaTrade> getTradeReference() {
        return tradeReference;
    }

    public Lineage tradeReference(List<ReferenceWithMetaTrade> tradeReference) {
        this.tradeReference = tradeReference;
        return this;
    }

}
