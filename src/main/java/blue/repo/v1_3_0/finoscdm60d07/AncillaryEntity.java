package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4Uuoa5fwP8rZJEuJ5JjWpJbGuqzn4hboizs2tXxVs6Lq")
public class AncillaryEntity {
    public static String blueId() {
        return "4Uuoa5fwP8rZJEuJ5JjWpJbGuqzn4hboizs2tXxVs6Lq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AncillaryEntity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AncillaryEntity";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AncillaryEntity.json";
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

    private AncillaryRoleEnum ancillaryParty;

    private LegalEntity legalEntity;

    public String getNamespace() {
        return namespace;
    }

    public AncillaryEntity namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AncillaryRoleEnum getAncillaryParty() {
        return ancillaryParty;
    }

    public AncillaryEntity ancillaryParty(AncillaryRoleEnum ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public LegalEntity getLegalEntity() {
        return legalEntity;
    }

    public AncillaryEntity legalEntity(LegalEntity legalEntity) {
        this.legalEntity = legalEntity;
        return this;
    }

}
