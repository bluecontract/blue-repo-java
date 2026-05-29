package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@TypeBlueId("HyXNVDmDxEPeDSSNQXVrStDaEGA3kiQJX6J14kavi83F")
public class CdmBaseStaticdataAssetCommonCollateralTaxonomyValue {
    public static String blueId() {
        return "HyXNVDmDxEPeDSSNQXVrStDaEGA3kiQJX6J14kavi83F";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/CollateralTaxonomyValue";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/CollateralTaxonomyValue";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonCollateralTaxonomyValue.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    // Original Blue property name: eu_EMIR_EligibleCollateral
    @JsonProperty("eu_EMIR_EligibleCollateral")
    private List<CdmBaseStaticdataAssetCommonEUEMIREligibleCollateralEnum> euEMIREligibleCollateral;

    private List<ComRosettaModelFieldWithMetaString> nonEnumeratedTaxonomyValue;

    // Original Blue property name: uk_EMIR_EligibleCollateral
    @JsonProperty("uk_EMIR_EligibleCollateral")
    private List<CdmBaseStaticdataAssetCommonUKEMIREligibleCollateralEnum> ukEMIREligibleCollateral;

    // Original Blue property name: us_CFTC_PR_EligibleCollateral
    @JsonProperty("us_CFTC_PR_EligibleCollateral")
    private List<CdmBaseStaticdataAssetCommonUSCFTCPREligibleCollateralEnum> usCFTCPREligibleCollateral;

    public List<CdmBaseStaticdataAssetCommonEUEMIREligibleCollateralEnum> getEuEMIREligibleCollateral() {
        return euEMIREligibleCollateral;
    }

    public CdmBaseStaticdataAssetCommonCollateralTaxonomyValue euEMIREligibleCollateral(List<CdmBaseStaticdataAssetCommonEUEMIREligibleCollateralEnum> euEMIREligibleCollateral) {
        this.euEMIREligibleCollateral = euEMIREligibleCollateral;
        return this;
    }

    public List<ComRosettaModelFieldWithMetaString> getNonEnumeratedTaxonomyValue() {
        return nonEnumeratedTaxonomyValue;
    }

    public CdmBaseStaticdataAssetCommonCollateralTaxonomyValue nonEnumeratedTaxonomyValue(List<ComRosettaModelFieldWithMetaString> nonEnumeratedTaxonomyValue) {
        this.nonEnumeratedTaxonomyValue = nonEnumeratedTaxonomyValue;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonUKEMIREligibleCollateralEnum> getUkEMIREligibleCollateral() {
        return ukEMIREligibleCollateral;
    }

    public CdmBaseStaticdataAssetCommonCollateralTaxonomyValue ukEMIREligibleCollateral(List<CdmBaseStaticdataAssetCommonUKEMIREligibleCollateralEnum> ukEMIREligibleCollateral) {
        this.ukEMIREligibleCollateral = ukEMIREligibleCollateral;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonUSCFTCPREligibleCollateralEnum> getUsCFTCPREligibleCollateral() {
        return usCFTCPREligibleCollateral;
    }

    public CdmBaseStaticdataAssetCommonCollateralTaxonomyValue usCFTCPREligibleCollateral(List<CdmBaseStaticdataAssetCommonUSCFTCPREligibleCollateralEnum> usCFTCPREligibleCollateral) {
        this.usCFTCPREligibleCollateral = usCFTCPREligibleCollateral;
        return this;
    }

}
