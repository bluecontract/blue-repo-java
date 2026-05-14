package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5mv3BZVsZV6Nvyr5up8xH3sf1TSwN3Pgi7dXLqwSw434")
public class PartyIdentifier {
    public static String blueId() {
        return "5mv3BZVsZV6Nvyr5up8xH3sf1TSwN3Pgi7dXLqwSw434";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PartyIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PartyIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PartyIdentifier.json";
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

    private PartyIdentifierTypeEnum identifierType;

    public String getNamespace() {
        return namespace;
    }

    public PartyIdentifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getIdentifier() {
        return identifier;
    }

    public PartyIdentifier identifier(FieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public PartyIdentifierTypeEnum getIdentifierType() {
        return identifierType;
    }

    public PartyIdentifier identifierType(PartyIdentifierTypeEnum identifierType) {
        this.identifierType = identifierType;
        return this;
    }

}
