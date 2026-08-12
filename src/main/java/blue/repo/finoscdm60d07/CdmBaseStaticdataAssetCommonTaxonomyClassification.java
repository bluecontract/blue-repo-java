package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("5c9nkt7FnTm6eNWkunPNWokAVLeHpwmv6jscyf5pZYh9")
public class CdmBaseStaticdataAssetCommonTaxonomyClassification {
    public static String blueId() {
        return "5c9nkt7FnTm6eNWkunPNWokAVLeHpwmv6jscyf5pZYh9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/TaxonomyClassification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/TaxonomyClassification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonTaxonomyClassification.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String className;

    private BigInteger ordinal;

    private String val;

    public String getClassName() {
        return className;
    }

    public CdmBaseStaticdataAssetCommonTaxonomyClassification className(String className) {
        this.className = className;
        return this;
    }

    public BigInteger getOrdinal() {
        return ordinal;
    }

    public CdmBaseStaticdataAssetCommonTaxonomyClassification ordinal(BigInteger ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    public String getVal() {
        return val;
    }

    public CdmBaseStaticdataAssetCommonTaxonomyClassification val(String val) {
        this.val = val;
        return this;
    }

}
