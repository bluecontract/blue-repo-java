package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("68KraWwT23EEA6nEkm6pD6WYim88JTP3PpM6auLGZCKA")
public class CdmBaseStaticdataPartyFieldWithMetaPersonIdentifier {
    public static String blueId() {
        return "68KraWwT23EEA6nEkm6pD6WYim88JTP3PpM6auLGZCKA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/FieldWithMetaPersonIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/FieldWithMetaPersonIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyFieldWithMetaPersonIdentifier.json";
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

    private CdmBaseStaticdataPartyPersonIdentifier val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmBaseStaticdataPartyFieldWithMetaPersonIdentifier meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmBaseStaticdataPartyPersonIdentifier getVal() {
        return val;
    }

    public CdmBaseStaticdataPartyFieldWithMetaPersonIdentifier val(CdmBaseStaticdataPartyPersonIdentifier val) {
        this.val = val;
        return this;
    }

}
