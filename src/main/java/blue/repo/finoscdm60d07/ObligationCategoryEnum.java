package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DNz1f4oudJGuyGgznB9G4SNwi4NfYvxL7yU8VTXdN9ge")
public class ObligationCategoryEnum {
    public static String blueId() {
        return "DNz1f4oudJGuyGgznB9G4SNwi4NfYvxL7yU8VTXdN9ge";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ObligationCategoryEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ObligationCategoryEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ObligationCategoryEnum.json";
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

    public ObligationCategoryEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
