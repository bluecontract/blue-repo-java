package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2ybnUAZFVjiKuVTgtjjGM2n2x8MAaDtWoNEQFYHWoCMT")
public class SettlementProvision {
    public static String blueId() {
        return "2ybnUAZFVjiKuVTgtjjGM2n2x8MAaDtWoNEQFYHWoCMT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SettlementProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SettlementProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SettlementProvision.json";
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

    private ShapingProvision shapingProvisions;

    public String getNamespace() {
        return namespace;
    }

    public SettlementProvision namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ShapingProvision getShapingProvisions() {
        return shapingProvisions;
    }

    public SettlementProvision shapingProvisions(ShapingProvision shapingProvisions) {
        this.shapingProvisions = shapingProvisions;
        return this;
    }

}
