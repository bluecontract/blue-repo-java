package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@TypeBlueId("HhoE9cpMecW3UnEtec3o5G9mdUpNsdxhuhWe3Ghsxtu2")
public class CollateralTaxonomyValue {
    public static String blueId() {
        return "HhoE9cpMecW3UnEtec3o5G9mdUpNsdxhuhWe3Ghsxtu2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CollateralTaxonomyValue";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CollateralTaxonomyValue";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CollateralTaxonomyValue.json";
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

    // Original Blue property name: eu_EMIR_EligibleCollateral
    @JsonProperty("eu_EMIR_EligibleCollateral")
    private List<EUEMIREligibleCollateralEnum> euEMIREligibleCollateral;

    private List<FieldWithMetaString> nonEnumeratedTaxonomyValue;

    // Original Blue property name: uk_EMIR_EligibleCollateral
    @JsonProperty("uk_EMIR_EligibleCollateral")
    private List<UKEMIREligibleCollateralEnum> ukEMIREligibleCollateral;

    // Original Blue property name: us_CFTC_PR_EligibleCollateral
    @JsonProperty("us_CFTC_PR_EligibleCollateral")
    private List<USCFTCPREligibleCollateralEnum> usCFTCPREligibleCollateral;

    public String getNamespace() {
        return namespace;
    }

    public CollateralTaxonomyValue namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<EUEMIREligibleCollateralEnum> getEuEMIREligibleCollateral() {
        return euEMIREligibleCollateral;
    }

    public CollateralTaxonomyValue euEMIREligibleCollateral(List<EUEMIREligibleCollateralEnum> euEMIREligibleCollateral) {
        this.euEMIREligibleCollateral = euEMIREligibleCollateral;
        return this;
    }

    public List<FieldWithMetaString> getNonEnumeratedTaxonomyValue() {
        return nonEnumeratedTaxonomyValue;
    }

    public CollateralTaxonomyValue nonEnumeratedTaxonomyValue(List<FieldWithMetaString> nonEnumeratedTaxonomyValue) {
        this.nonEnumeratedTaxonomyValue = nonEnumeratedTaxonomyValue;
        return this;
    }

    public List<UKEMIREligibleCollateralEnum> getUkEMIREligibleCollateral() {
        return ukEMIREligibleCollateral;
    }

    public CollateralTaxonomyValue ukEMIREligibleCollateral(List<UKEMIREligibleCollateralEnum> ukEMIREligibleCollateral) {
        this.ukEMIREligibleCollateral = ukEMIREligibleCollateral;
        return this;
    }

    public List<USCFTCPREligibleCollateralEnum> getUsCFTCPREligibleCollateral() {
        return usCFTCPREligibleCollateral;
    }

    public CollateralTaxonomyValue usCFTCPREligibleCollateral(List<USCFTCPREligibleCollateralEnum> usCFTCPREligibleCollateral) {
        this.usCFTCPREligibleCollateral = usCFTCPREligibleCollateral;
        return this;
    }

}
