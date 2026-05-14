package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CPnP8syxvUWV8rCPoLt5xNVvGBUFuNup1cBNcwAKwzT8")
public class InventoryRecord {
    public static String blueId() {
        return "CPnP8syxvUWV8rCPoLt5xNVvGBUFuNup1cBNcwAKwzT8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InventoryRecord";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InventoryRecord";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/InventoryRecord.json";
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

    private AssignedIdentifier identifer;

    private Security security;

    public String getNamespace() {
        return namespace;
    }

    public InventoryRecord namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AssignedIdentifier getIdentifer() {
        return identifer;
    }

    public InventoryRecord identifer(AssignedIdentifier identifer) {
        this.identifer = identifer;
        return this;
    }

    public Security getSecurity() {
        return security;
    }

    public InventoryRecord security(Security security) {
        this.security = security;
        return this;
    }

}
