package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7Goz9bVSPKwrh2w1JemH5yTx3WzBpEtoy2a6er7Qn1hs")
public class CdmProductCollateralCollateralTreatment {
    public static String blueId() {
        return "7Goz9bVSPKwrh2w1JemH5yTx3WzBpEtoy2a6er7Qn1hs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/CollateralTreatment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/CollateralTreatment";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralCollateralTreatment.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmProductCollateralConcentrationLimit> concentrationLimit;

    private Boolean isIncluded;

    private CdmProductCollateralCollateralValuationTreatment valuationTreatment;

    public List<CdmProductCollateralConcentrationLimit> getConcentrationLimit() {
        return concentrationLimit;
    }

    public CdmProductCollateralCollateralTreatment concentrationLimit(List<CdmProductCollateralConcentrationLimit> concentrationLimit) {
        this.concentrationLimit = concentrationLimit;
        return this;
    }

    public Boolean getIsIncluded() {
        return isIncluded;
    }

    public CdmProductCollateralCollateralTreatment isIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
        return this;
    }

    public CdmProductCollateralCollateralValuationTreatment getValuationTreatment() {
        return valuationTreatment;
    }

    public CdmProductCollateralCollateralTreatment valuationTreatment(CdmProductCollateralCollateralValuationTreatment valuationTreatment) {
        this.valuationTreatment = valuationTreatment;
        return this;
    }

}
