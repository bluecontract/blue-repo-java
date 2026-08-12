package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("FkMWf1pd7YUm7zUWH64xW6YKJEWnWCzUoCiDxJWMWd2U")
public class CdmBaseStaticdataIdentifierAssignedIdentifier {
    public static String blueId() {
        return "FkMWf1pd7YUm7zUWH64xW6YKJEWnWCzUoCiDxJWMWd2U";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/identifier/AssignedIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/identifier/AssignedIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataidentifierAssignedIdentifier.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString identifier;

    private BigInteger version;

    public ComRosettaModelFieldWithMetaString getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataIdentifierAssignedIdentifier identifier(ComRosettaModelFieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public BigInteger getVersion() {
        return version;
    }

    public CdmBaseStaticdataIdentifierAssignedIdentifier version(BigInteger version) {
        this.version = version;
        return this;
    }

}
