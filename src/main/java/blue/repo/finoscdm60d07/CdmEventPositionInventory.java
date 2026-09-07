package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GzKogwG8rJaiuiYKR5kSehFDojY8EDpPoWUFA2FfbUxf")
public class CdmEventPositionInventory {
    public static String blueId() {
        return "GzKogwG8rJaiuiYKR5kSehFDojY8EDpPoWUFA2FfbUxf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/Inventory";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/Inventory";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionInventory.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmEventPositionInventoryRecord> inventoryRecord;

    public List<CdmEventPositionInventoryRecord> getInventoryRecord() {
        return inventoryRecord;
    }

    public CdmEventPositionInventory inventoryRecord(List<CdmEventPositionInventoryRecord> inventoryRecord) {
        this.inventoryRecord = inventoryRecord;
        return this;
    }

}
