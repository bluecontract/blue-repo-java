package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9q5Aqc2sXyQHBEB1fEH7YnXg3xyueB94fHUPswAoFjxZ")
public class LegalEntity {
    public static String blueId() {
        return "9q5Aqc2sXyQHBEB1fEH7YnXg3xyueB94fHUPswAoFjxZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LegalEntity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LegalEntity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/LegalEntity.json";
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

    private List<FieldWithMetaString> entityId;

    public String getNamespace() {
        return namespace;
    }

    public LegalEntity namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<FieldWithMetaString> getEntityId() {
        return entityId;
    }

    public LegalEntity entityId(List<FieldWithMetaString> entityId) {
        this.entityId = entityId;
        return this;
    }

}
