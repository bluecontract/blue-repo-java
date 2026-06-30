package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9jMFqKdmgCwgQBzfKNbUAGoTLobW3aCoWXv25TRM7oHp")
public class CdmBaseStaticdataPartyNaturalPersonRole {
    public static String blueId() {
        return "9jMFqKdmgCwgQBzfKNbUAGoTLobW3aCoWXv25TRM7oHp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/NaturalPersonRole";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/NaturalPersonRole";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyNaturalPersonRole.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaNaturalPerson personReference;

    private List<CdmBaseStaticdataPartyFieldWithMetaNaturalPersonRoleEnum> role;

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaNaturalPerson getPersonReference() {
        return personReference;
    }

    public CdmBaseStaticdataPartyNaturalPersonRole personReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaNaturalPerson personReference) {
        this.personReference = personReference;
        return this;
    }

    public List<CdmBaseStaticdataPartyFieldWithMetaNaturalPersonRoleEnum> getRole() {
        return role;
    }

    public CdmBaseStaticdataPartyNaturalPersonRole role(List<CdmBaseStaticdataPartyFieldWithMetaNaturalPersonRoleEnum> role) {
        this.role = role;
        return this;
    }

}
