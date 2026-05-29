package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CEQu3EzZpdpovFNqHBXsSJ1md21921ewNRp4NtASqW9T")
public class CdmBaseStaticdataIdentifierFieldWithMetaIdentifier {
    public static String blueId() {
        return "CEQu3EzZpdpovFNqHBXsSJ1md21921ewNRp4NtASqW9T";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/identifier/FieldWithMetaIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/identifier/FieldWithMetaIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataidentifierFieldWithMetaIdentifier.json";
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

    private CdmBaseStaticdataIdentifierIdentifier val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseStaticdataIdentifierFieldWithMetaIdentifier meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifier getVal() {
        return val;
    }

    public CdmBaseStaticdataIdentifierFieldWithMetaIdentifier val(CdmBaseStaticdataIdentifierIdentifier val) {
        this.val = val;
        return this;
    }

}
