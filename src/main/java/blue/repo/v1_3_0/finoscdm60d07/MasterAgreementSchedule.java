package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("31XxMEDiEVomCitCVLMFLSsXHFh1j8j4tABJuDAWpQrE")
public class MasterAgreementSchedule {
    public static String blueId() {
        return "31XxMEDiEVomCitCVLMFLSsXHFh1j8j4tABJuDAWpQrE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MasterAgreementSchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MasterAgreementSchedule";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MasterAgreementSchedule.json";
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

    private List<MasterAgreementClause> clause;

    public String getNamespace() {
        return namespace;
    }

    public MasterAgreementSchedule namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<MasterAgreementClause> getClause() {
        return clause;
    }

    public MasterAgreementSchedule clause(List<MasterAgreementClause> clause) {
        this.clause = clause;
        return this;
    }

}
