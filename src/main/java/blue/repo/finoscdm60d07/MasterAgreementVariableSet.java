package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7Sjs1Em9GMV1CPrHj4cGL7ZgqmaTj2qyqfA2hUkTD21u#0")
public class MasterAgreementVariableSet {
    public static String blueId() {
        return "7Sjs1Em9GMV1CPrHj4cGL7ZgqmaTj2qyqfA2hUkTD21u#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MasterAgreementVariableSet";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MasterAgreementVariableSet";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MasterAgreementVariableSet.json";
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

    private String val;

    private List<MasterAgreementVariableSet> variableSet;

    public String getNamespace() {
        return namespace;
    }

    public MasterAgreementVariableSet namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getVal() {
        return val;
    }

    public MasterAgreementVariableSet val(String val) {
        this.val = val;
        return this;
    }

    public List<MasterAgreementVariableSet> getVariableSet() {
        return variableSet;
    }

    public MasterAgreementVariableSet variableSet(List<MasterAgreementVariableSet> variableSet) {
        this.variableSet = variableSet;
        return this;
    }

}
