package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G2uPrFU4uNeXsrT1Qauu3GMgFXeHpGU8yyPtUKRD4kr3")
public class CdmProductAssetEquityUnderlierProvisions {
    public static String blueId() {
        return "G2uPrFU4uNeXsrT1Qauu3GMgFXeHpGU8yyPtUKRD4kr3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/EquityUnderlierProvisions";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/EquityUnderlierProvisions";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetEquityUnderlierProvisions.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean componentSecurityIndexAnnexFallback;

    private ComRosettaModelFieldWithMetaString localJurisdiction;

    private Boolean multipleExchangeIndexAnnexFallback;

    private ComRosettaModelFieldWithMetaString relevantJurisdiction;

    public Boolean getComponentSecurityIndexAnnexFallback() {
        return componentSecurityIndexAnnexFallback;
    }

    public CdmProductAssetEquityUnderlierProvisions componentSecurityIndexAnnexFallback(Boolean componentSecurityIndexAnnexFallback) {
        this.componentSecurityIndexAnnexFallback = componentSecurityIndexAnnexFallback;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getLocalJurisdiction() {
        return localJurisdiction;
    }

    public CdmProductAssetEquityUnderlierProvisions localJurisdiction(ComRosettaModelFieldWithMetaString localJurisdiction) {
        this.localJurisdiction = localJurisdiction;
        return this;
    }

    public Boolean getMultipleExchangeIndexAnnexFallback() {
        return multipleExchangeIndexAnnexFallback;
    }

    public CdmProductAssetEquityUnderlierProvisions multipleExchangeIndexAnnexFallback(Boolean multipleExchangeIndexAnnexFallback) {
        this.multipleExchangeIndexAnnexFallback = multipleExchangeIndexAnnexFallback;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getRelevantJurisdiction() {
        return relevantJurisdiction;
    }

    public CdmProductAssetEquityUnderlierProvisions relevantJurisdiction(ComRosettaModelFieldWithMetaString relevantJurisdiction) {
        this.relevantJurisdiction = relevantJurisdiction;
        return this;
    }

}
