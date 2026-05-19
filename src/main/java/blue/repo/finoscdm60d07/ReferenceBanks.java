package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("DSLg4xjgHENLyws472Qt9yZs2AAgBEewEBKexhu9KfBX")
public class ReferenceBanks {
    public static String blueId() {
        return "DSLg4xjgHENLyws472Qt9yZs2AAgBEewEBKexhu9KfBX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceBanks";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceBanks";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferenceBanks.json";
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

    private List<ReferenceBank> referenceBank;

    public String getNamespace() {
        return namespace;
    }

    public ReferenceBanks namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ReferenceBank> getReferenceBank() {
        return referenceBank;
    }

    public ReferenceBanks referenceBank(List<ReferenceBank> referenceBank) {
        this.referenceBank = referenceBank;
        return this;
    }

}
