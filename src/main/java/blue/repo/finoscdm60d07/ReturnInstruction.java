package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EvimWXuF5Y97ys33n5zTVCpHVeEfw2zscXUp4Q56BuEE")
public class ReturnInstruction {
    public static String blueId() {
        return "EvimWXuF5Y97ys33n5zTVCpHVeEfw2zscXUp4Q56BuEE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReturnInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReturnInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReturnInstruction.json";
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

    private List<Quantity> quantity;

    public String getNamespace() {
        return namespace;
    }

    public ReturnInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<Quantity> getQuantity() {
        return quantity;
    }

    public ReturnInstruction quantity(List<Quantity> quantity) {
        this.quantity = quantity;
        return this;
    }

}
