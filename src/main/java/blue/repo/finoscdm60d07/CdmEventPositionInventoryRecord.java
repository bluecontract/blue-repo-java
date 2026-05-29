package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2sf4M8exzRKrtohCq6tkSRoBEdKjamjQYaCZGfzQw5qd")
public class CdmEventPositionInventoryRecord {
    public static String blueId() {
        return "2sf4M8exzRKrtohCq6tkSRoBEdKjamjQYaCZGfzQw5qd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/position/InventoryRecord";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/position/InventoryRecord";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventpositionInventoryRecord.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataIdentifierAssignedIdentifier identifer;

    private CdmBaseStaticdataAssetCommonSecurity security;

    public CdmBaseStaticdataIdentifierAssignedIdentifier getIdentifer() {
        return identifer;
    }

    public CdmEventPositionInventoryRecord identifer(CdmBaseStaticdataIdentifierAssignedIdentifier identifer) {
        this.identifer = identifer;
        return this;
    }

    public CdmBaseStaticdataAssetCommonSecurity getSecurity() {
        return security;
    }

    public CdmEventPositionInventoryRecord security(CdmBaseStaticdataAssetCommonSecurity security) {
        this.security = security;
        return this;
    }

}
