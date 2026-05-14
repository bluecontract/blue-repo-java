package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9bGwcG1xp4CdRxR7ZwqoM3pw7x6ggB82bamx2KZx9B7s")
public class IdentifiedList {
    public static String blueId() {
        return "9bGwcG1xp4CdRxR7ZwqoM3pw7x6ggB82bamx2KZx9B7s";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "IdentifiedList";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/IdentifiedList";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/IdentifiedList.json";
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

    private List<Identifier> componentId;

    private Identifier listId;

    private Price price;

    public String getNamespace() {
        return namespace;
    }

    public IdentifiedList namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<Identifier> getComponentId() {
        return componentId;
    }

    public IdentifiedList componentId(List<Identifier> componentId) {
        this.componentId = componentId;
        return this;
    }

    public Identifier getListId() {
        return listId;
    }

    public IdentifiedList listId(Identifier listId) {
        this.listId = listId;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public IdentifiedList price(Price price) {
        this.price = price;
        return this;
    }

}
