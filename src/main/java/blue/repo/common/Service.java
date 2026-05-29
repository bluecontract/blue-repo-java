package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EC4hx8cFZ9JwWCnECdoPPatsHb4sAq6QEhDLcHCcAo3t")
public class Service extends Document {
    public static String blueId() {
        return "EC4hx8cFZ9JwWCnECdoPPatsHb4sAq6QEhDLcHCcAo3t";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Service";
    }

    public static String qualifiedName() {
        return "Common/Service";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/Service.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<String> categories;

    public List<String> getCategories() {
        return categories;
    }

    public Service categories(List<String> categories) {
        this.categories = categories;
        return this;
    }

}
