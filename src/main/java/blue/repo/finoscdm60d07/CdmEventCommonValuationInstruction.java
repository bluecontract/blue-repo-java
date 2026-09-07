package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8iKgBxBh7SUitbQtzgtrPEjHCma3G9oePfhg2gmrrSXr")
public class CdmEventCommonValuationInstruction {
    public static String blueId() {
        return "8iKgBxBh7SUitbQtzgtrPEjHCma3G9oePfhg2gmrrSXr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ValuationInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ValuationInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonValuationInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean replace;

    private List<CdmEventCommonValuation> valuation;

    public Boolean getReplace() {
        return replace;
    }

    public CdmEventCommonValuationInstruction replace(Boolean replace) {
        this.replace = replace;
        return this;
    }

    public List<CdmEventCommonValuation> getValuation() {
        return valuation;
    }

    public CdmEventCommonValuationInstruction valuation(List<CdmEventCommonValuation> valuation) {
        this.valuation = valuation;
        return this;
    }

}
