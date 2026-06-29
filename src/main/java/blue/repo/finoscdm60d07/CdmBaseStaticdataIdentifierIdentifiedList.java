package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Dq7xVZaLz1ofmKsUodtSSbe6YGxaRdCtP5HM1pKU8RHF")
public class CdmBaseStaticdataIdentifierIdentifiedList {
    public static String blueId() {
        return "Dq7xVZaLz1ofmKsUodtSSbe6YGxaRdCtP5HM1pKU8RHF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/identifier/IdentifiedList";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/identifier/IdentifiedList";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataidentifierIdentifiedList.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataIdentifierIdentifier> componentId;

    private CdmBaseStaticdataIdentifierIdentifier listId;

    private CdmObservableAssetPrice price;

    public List<CdmBaseStaticdataIdentifierIdentifier> getComponentId() {
        return componentId;
    }

    public CdmBaseStaticdataIdentifierIdentifiedList componentId(List<CdmBaseStaticdataIdentifierIdentifier> componentId) {
        this.componentId = componentId;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifier getListId() {
        return listId;
    }

    public CdmBaseStaticdataIdentifierIdentifiedList listId(CdmBaseStaticdataIdentifierIdentifier listId) {
        this.listId = listId;
        return this;
    }

    public CdmObservableAssetPrice getPrice() {
        return price;
    }

    public CdmBaseStaticdataIdentifierIdentifiedList price(CdmObservableAssetPrice price) {
        this.price = price;
        return this;
    }

}
