package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GGjTPZ3AzfgfkzK5oceBGSwW8AjwGocN5iK3Z2hNf4Ss")
public class ValuationInstruction {
    public static String blueId() {
        return "GGjTPZ3AzfgfkzK5oceBGSwW8AjwGocN5iK3Z2hNf4Ss";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ValuationInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ValuationInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ValuationInstruction.json";
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

    private Boolean replace;

    private List<Valuation> valuation;

    public String getNamespace() {
        return namespace;
    }

    public ValuationInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getReplace() {
        return replace;
    }

    public ValuationInstruction replace(Boolean replace) {
        this.replace = replace;
        return this;
    }

    public List<Valuation> getValuation() {
        return valuation;
    }

    public ValuationInstruction valuation(List<Valuation> valuation) {
        this.valuation = valuation;
        return this;
    }

}
