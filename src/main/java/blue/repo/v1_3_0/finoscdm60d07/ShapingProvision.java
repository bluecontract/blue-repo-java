package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GZAQut3hsq2ueXWG6S5kvxZMNRQ5zdTQBhZjG47jVUin")
public class ShapingProvision {
    public static String blueId() {
        return "GZAQut3hsq2ueXWG6S5kvxZMNRQ5zdTQBhZjG47jVUin";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ShapingProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ShapingProvision";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ShapingProvision.json";
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

    private List<Money> shapeSchedule;

    public String getNamespace() {
        return namespace;
    }

    public ShapingProvision namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<Money> getShapeSchedule() {
        return shapeSchedule;
    }

    public ShapingProvision shapeSchedule(List<Money> shapeSchedule) {
        this.shapeSchedule = shapeSchedule;
        return this;
    }

}
