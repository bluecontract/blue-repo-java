package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("9WB67XpgjeVBGSB6fTP5EjK3G6esoKBVmp8qhevGVTeu")
public class AssignedIdentifier {
    public static String blueId() {
        return "9WB67XpgjeVBGSB6fTP5EjK3G6esoKBVmp8qhevGVTeu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssignedIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssignedIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AssignedIdentifier.json";
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

    private FieldWithMetaString identifier;

    private BigInteger version;

    public String getNamespace() {
        return namespace;
    }

    public AssignedIdentifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getIdentifier() {
        return identifier;
    }

    public AssignedIdentifier identifier(FieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public BigInteger getVersion() {
        return version;
    }

    public AssignedIdentifier version(BigInteger version) {
        this.version = version;
        return this;
    }

}
