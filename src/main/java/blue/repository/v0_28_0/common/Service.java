package blue.repository.v0_28_0.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;
import java.util.List;

@TypeBlueId("ALFnjBeqP1hupQrZGddqbi276GkwnuPtkQjiFLjU716A")
public class Service extends Document {
    public static String blueId() {
        return "ALFnjBeqP1hupQrZGddqbi276GkwnuPtkQjiFLjU716A";
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
        return "blue/repository/v0_28_0/definitions/Common/Service.json";
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
