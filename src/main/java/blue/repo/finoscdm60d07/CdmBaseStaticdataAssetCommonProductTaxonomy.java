package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("zhu6Vg1U6muAYReiYsG2Xh1wrN4VDaeeREHBY7A8wtc")
public class CdmBaseStaticdataAssetCommonProductTaxonomy {
    public static String blueId() {
        return "zhu6Vg1U6muAYReiYsG2Xh1wrN4VDaeeREHBY7A8wtc";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/ProductTaxonomy";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/ProductTaxonomy";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonProductTaxonomy.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonFieldWithMetaAssetClassEnum primaryAssetClass;

    private String productQualifier;

    private List<CdmBaseStaticdataAssetCommonFieldWithMetaAssetClassEnum> secondaryAssetClass;

    private CdmBaseStaticdataAssetCommonTaxonomySourceEnum source;

    private CdmBaseStaticdataAssetCommonTaxonomyValue val;

    public CdmBaseStaticdataAssetCommonFieldWithMetaAssetClassEnum getPrimaryAssetClass() {
        return primaryAssetClass;
    }

    public CdmBaseStaticdataAssetCommonProductTaxonomy primaryAssetClass(CdmBaseStaticdataAssetCommonFieldWithMetaAssetClassEnum primaryAssetClass) {
        this.primaryAssetClass = primaryAssetClass;
        return this;
    }

    public String getProductQualifier() {
        return productQualifier;
    }

    public CdmBaseStaticdataAssetCommonProductTaxonomy productQualifier(String productQualifier) {
        this.productQualifier = productQualifier;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonFieldWithMetaAssetClassEnum> getSecondaryAssetClass() {
        return secondaryAssetClass;
    }

    public CdmBaseStaticdataAssetCommonProductTaxonomy secondaryAssetClass(List<CdmBaseStaticdataAssetCommonFieldWithMetaAssetClassEnum> secondaryAssetClass) {
        this.secondaryAssetClass = secondaryAssetClass;
        return this;
    }

    public CdmBaseStaticdataAssetCommonTaxonomySourceEnum getSource() {
        return source;
    }

    public CdmBaseStaticdataAssetCommonProductTaxonomy source(CdmBaseStaticdataAssetCommonTaxonomySourceEnum source) {
        this.source = source;
        return this;
    }

    public CdmBaseStaticdataAssetCommonTaxonomyValue getVal() {
        return val;
    }

    public CdmBaseStaticdataAssetCommonProductTaxonomy val(CdmBaseStaticdataAssetCommonTaxonomyValue val) {
        this.val = val;
        return this;
    }

}
