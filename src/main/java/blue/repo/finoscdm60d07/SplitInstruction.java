package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("B5XUcBNe5FkFmU33VGqjgsLyReeFsmprVWp1tZ4aeeNE#1")
public class SplitInstruction {
    public static String blueId() {
        return "B5XUcBNe5FkFmU33VGqjgsLyReeFsmprVWp1tZ4aeeNE#1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SplitInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SplitInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SplitInstruction.json";
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

    private List<PrimitiveInstruction> breakdown;

    public String getNamespace() {
        return namespace;
    }

    public SplitInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<PrimitiveInstruction> getBreakdown() {
        return breakdown;
    }

    public SplitInstruction breakdown(List<PrimitiveInstruction> breakdown) {
        this.breakdown = breakdown;
        return this;
    }

}
