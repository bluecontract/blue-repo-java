package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("51vGBKkgLH3NUCqwFpjmFLCT15MZshriveqeJPUJvZVZ")
public class CdmProductCommonSettlementPricingDates {
    public static String blueId() {
        return "51vGBKkgLH3NUCqwFpjmFLCT15MZshriveqeJPUJvZVZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/PricingDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/PricingDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementPricingDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonScheduleParametricDates parametricDates;

    private List<CdmBaseDatetimeAdjustableDates> specifiedDates;

    public CdmProductCommonScheduleParametricDates getParametricDates() {
        return parametricDates;
    }

    public CdmProductCommonSettlementPricingDates parametricDates(CdmProductCommonScheduleParametricDates parametricDates) {
        this.parametricDates = parametricDates;
        return this;
    }

    public List<CdmBaseDatetimeAdjustableDates> getSpecifiedDates() {
        return specifiedDates;
    }

    public CdmProductCommonSettlementPricingDates specifiedDates(List<CdmBaseDatetimeAdjustableDates> specifiedDates) {
        this.specifiedDates = specifiedDates;
        return this;
    }

}
