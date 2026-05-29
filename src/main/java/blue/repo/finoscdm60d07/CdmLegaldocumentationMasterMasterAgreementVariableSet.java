package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9afZipQ8gy2eWFkpZxZvWSZjQD57W7UGTrwELvXRoF9m#0")
public class CdmLegaldocumentationMasterMasterAgreementVariableSet {
    public static String blueId() {
        return "9afZipQ8gy2eWFkpZxZvWSZjQD57W7UGTrwELvXRoF9m#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/MasterAgreementVariableSet";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/MasterAgreementVariableSet";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterMasterAgreementVariableSet.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String val;

    private List<CdmLegaldocumentationMasterMasterAgreementVariableSet> variableSet;

    public String getVal() {
        return val;
    }

    public CdmLegaldocumentationMasterMasterAgreementVariableSet val(String val) {
        this.val = val;
        return this;
    }

    public List<CdmLegaldocumentationMasterMasterAgreementVariableSet> getVariableSet() {
        return variableSet;
    }

    public CdmLegaldocumentationMasterMasterAgreementVariableSet variableSet(List<CdmLegaldocumentationMasterMasterAgreementVariableSet> variableSet) {
        this.variableSet = variableSet;
        return this;
    }

}
