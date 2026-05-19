package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5gB5WyiiL6HzqGSVtJzPy6jc3hj3j1WXhzpZodFHyCb6")
public class PersonIdentifier {
    public static String blueId() {
        return "5gB5WyiiL6HzqGSVtJzPy6jc3hj3j1WXhzpZodFHyCb6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PersonIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PersonIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PersonIdentifier.json";
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

    private FieldWithMetaString country;

    private FieldWithMetaString identifier;

    private PersonIdentifierTypeEnum identifierType;

    public String getNamespace() {
        return namespace;
    }

    public PersonIdentifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getCountry() {
        return country;
    }

    public PersonIdentifier country(FieldWithMetaString country) {
        this.country = country;
        return this;
    }

    public FieldWithMetaString getIdentifier() {
        return identifier;
    }

    public PersonIdentifier identifier(FieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public PersonIdentifierTypeEnum getIdentifierType() {
        return identifierType;
    }

    public PersonIdentifier identifierType(PersonIdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

}
