package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9bq1SLENRPeXxZdJXkmh3wKrFtSRGj1VGLZQGdxzHCrV")
public class NaturalPersonRole {
    public static String blueId() {
        return "9bq1SLENRPeXxZdJXkmh3wKrFtSRGj1VGLZQGdxzHCrV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NaturalPersonRole";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NaturalPersonRole";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/NaturalPersonRole.json";
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

    private ReferenceWithMetaNaturalPerson personReference;

    private List<FieldWithMetaNaturalPersonRoleEnum> role;

    public String getNamespace() {
        return namespace;
    }

    public NaturalPersonRole namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaNaturalPerson getPersonReference() {
        return personReference;
    }

    public NaturalPersonRole personReference(ReferenceWithMetaNaturalPerson personReference) {
        this.personReference = personReference;
        return this;
    }

    public List<FieldWithMetaNaturalPersonRoleEnum> getRole() {
        return role;
    }

    public NaturalPersonRole role(List<FieldWithMetaNaturalPersonRoleEnum> role) {
        this.role = role;
        return this;
    }

}
