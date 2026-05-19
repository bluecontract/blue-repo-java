package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9qJBHyeuvGdSn1A4SdJxiKjKDMDZg7Ba6bHQWXmM2Dmh")
public class Inventory {
    public static String blueId() {
        return "9qJBHyeuvGdSn1A4SdJxiKjKDMDZg7Ba6bHQWXmM2Dmh";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Inventory";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Inventory";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Inventory.json";
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

    private List<InventoryRecord> inventoryRecord;

    public String getNamespace() {
        return namespace;
    }

    public Inventory namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<InventoryRecord> getInventoryRecord() {
        return inventoryRecord;
    }

    public Inventory inventoryRecord(List<InventoryRecord> inventoryRecord) {
        this.inventoryRecord = inventoryRecord;
        return this;
    }

}
