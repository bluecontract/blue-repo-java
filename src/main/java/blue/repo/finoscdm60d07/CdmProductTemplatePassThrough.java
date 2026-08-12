package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("BwWFicbdS15kQQwDYWi4dL1uT4UxHHhJiXdfZWBPB6hN")
public class CdmProductTemplatePassThrough {
    public static String blueId() {
        return "BwWFicbdS15kQQwDYWi4dL1uT4UxHHhJiXdfZWBPB6hN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/PassThrough";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/PassThrough";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplatePassThrough.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductTemplatePassThroughItem> passThroughItem;

    public List<CdmProductTemplatePassThroughItem> getPassThroughItem() {
        return passThroughItem;
    }

    public CdmProductTemplatePassThrough passThroughItem(List<CdmProductTemplatePassThroughItem> passThroughItem) {
        this.passThroughItem = passThroughItem;
        return this;
    }

}
