package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("2s8h9Fv4Wcd7om6eW6WCK8MK41XpoAvH1stjRd9Pxw4x")
public class CdmObservableAssetMultipleDebtTypes {
    public static String blueId() {
        return "2s8h9Fv4Wcd7om6eW6WCK8MK41XpoAvH1stjRd9Pxw4x";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/MultipleDebtTypes";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/MultipleDebtTypes";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetMultipleDebtTypes.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseMathQuantifierEnum condition;

    private List<ComRosettaModelFieldWithMetaString> debtType;

    public CdmBaseMathQuantifierEnum getCondition() {
        return condition;
    }

    public CdmObservableAssetMultipleDebtTypes condition(CdmBaseMathQuantifierEnum condition) {
        this.condition = condition;
        return this;
    }

    public List<ComRosettaModelFieldWithMetaString> getDebtType() {
        return debtType;
    }

    public CdmObservableAssetMultipleDebtTypes debtType(List<ComRosettaModelFieldWithMetaString> debtType) {
        this.debtType = debtType;
        return this;
    }

}
