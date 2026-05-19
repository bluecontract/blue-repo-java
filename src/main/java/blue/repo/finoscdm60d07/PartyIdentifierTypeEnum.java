package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7rZYLt3VKaaX3TVXVy7yXkyoAEYxGLR1vFqXHxmjKs9g")
public class PartyIdentifierTypeEnum {
    public static String blueId() {
        return "7rZYLt3VKaaX3TVXVy7yXkyoAEYxGLR1vFqXHxmjKs9g";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PartyIdentifierTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PartyIdentifierTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PartyIdentifierTypeEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public PartyIdentifierTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
