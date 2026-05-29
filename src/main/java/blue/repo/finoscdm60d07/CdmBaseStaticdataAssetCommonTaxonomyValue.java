package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("F6mUivEQ8RTovh2EM1RvywChVG83p595wiCfpi8jG8RN")
public class CdmBaseStaticdataAssetCommonTaxonomyValue {
    public static String blueId() {
        return "F6mUivEQ8RTovh2EM1RvywChVG83p595wiCfpi8jG8RN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/TaxonomyValue";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/TaxonomyValue";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonTaxonomyValue.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataAssetCommonTaxonomyClassification> classification;

    public List<CdmBaseStaticdataAssetCommonTaxonomyClassification> getClassification() {
        return classification;
    }

    public CdmBaseStaticdataAssetCommonTaxonomyValue classification(List<CdmBaseStaticdataAssetCommonTaxonomyClassification> classification) {
        this.classification = classification;
        return this;
    }

}
