package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("96F8GUo5Cqrg5upa446vgi9AtHveBqB5YsW6n44VBB4H")
public class CdmEventCommonLineage {
    public static String blueId() {
        return "96F8GUo5Cqrg5upa446vgi9AtHveBqB5YsW6n44VBB4H";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/Lineage";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/Lineage";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonLineage.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventWorkflowMetafieldsReferenceWithMetaWorkflowStep> eventReference;

    private List<CdmEventPositionMetafieldsReferenceWithMetaPortfolioState> portfolioStateReference;

    private List<CdmEventCommonMetafieldsReferenceWithMetaTrade> tradeReference;

    public List<CdmEventWorkflowMetafieldsReferenceWithMetaWorkflowStep> getEventReference() {
        return eventReference;
    }

    public CdmEventCommonLineage eventReference(List<CdmEventWorkflowMetafieldsReferenceWithMetaWorkflowStep> eventReference) {
        this.eventReference = eventReference;
        return this;
    }

    public List<CdmEventPositionMetafieldsReferenceWithMetaPortfolioState> getPortfolioStateReference() {
        return portfolioStateReference;
    }

    public CdmEventCommonLineage portfolioStateReference(List<CdmEventPositionMetafieldsReferenceWithMetaPortfolioState> portfolioStateReference) {
        this.portfolioStateReference = portfolioStateReference;
        return this;
    }

    public List<CdmEventCommonMetafieldsReferenceWithMetaTrade> getTradeReference() {
        return tradeReference;
    }

    public CdmEventCommonLineage tradeReference(List<CdmEventCommonMetafieldsReferenceWithMetaTrade> tradeReference) {
        this.tradeReference = tradeReference;
        return this;
    }

}
