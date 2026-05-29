package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8EKfmgSdnP6EYVXZagpfvygY1BhsDy43CQgKoKPw4Fio")
public class CdmBaseStaticdataAssetCommonTaxonomy {
    public static String blueId() {
        return "8EKfmgSdnP6EYVXZagpfvygY1BhsDy43CQgKoKPw4Fio";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/Taxonomy";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/Taxonomy";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonTaxonomy.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonTaxonomySourceEnum source;

    private CdmBaseStaticdataAssetCommonTaxonomyValue val;

    public CdmBaseStaticdataAssetCommonTaxonomySourceEnum getSource() {
        return source;
    }

    public CdmBaseStaticdataAssetCommonTaxonomy source(CdmBaseStaticdataAssetCommonTaxonomySourceEnum source) {
        this.source = source;
        return this;
    }

    public CdmBaseStaticdataAssetCommonTaxonomyValue getVal() {
        return val;
    }

    public CdmBaseStaticdataAssetCommonTaxonomy val(CdmBaseStaticdataAssetCommonTaxonomyValue val) {
        this.val = val;
        return this;
    }

}
