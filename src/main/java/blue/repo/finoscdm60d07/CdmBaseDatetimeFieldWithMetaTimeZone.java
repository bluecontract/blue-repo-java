package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6XsZzNy8iHgmk7eDnmTPs7QFCthawsNg96517G4uThjP")
public class CdmBaseDatetimeFieldWithMetaTimeZone {
    public static String blueId() {
        return "6XsZzNy8iHgmk7eDnmTPs7QFCthawsNg96517G4uThjP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/FieldWithMetaTimeZone";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/FieldWithMetaTimeZone";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeFieldWithMetaTimeZone.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelMetafieldsMetaFields meta;

    private CdmBaseDatetimeTimeZone val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseDatetimeFieldWithMetaTimeZone meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseDatetimeTimeZone getVal() {
        return val;
    }

    public CdmBaseDatetimeFieldWithMetaTimeZone val(CdmBaseDatetimeTimeZone val) {
        this.val = val;
        return this;
    }

}
