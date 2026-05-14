package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("E7ZVhfMdG2UYGc788XrpWT6BV9GajFbxNEd5aTdqJd2a")
public class BusinessUnit {
    public static String blueId() {
        return "E7ZVhfMdG2UYGc788XrpWT6BV9GajFbxNEd5aTdqJd2a";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BusinessUnit";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BusinessUnit";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BusinessUnit.json";
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

    private ContactInformation contactInformation;

    private Identifier identifier;

    public String getNamespace() {
        return namespace;
    }

    public BusinessUnit namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public BusinessUnit contactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public BusinessUnit identifier(Identifier identifier) {
        this.identifier = identifier;
        return this;
    }

}
