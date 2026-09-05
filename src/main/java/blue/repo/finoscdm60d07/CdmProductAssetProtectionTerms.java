package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FxbN44mpyTHezReGD3UcwerFD7Gcj5HQn33hZu34jVyD")
public class CdmProductAssetProtectionTerms {
    public static String blueId() {
        return "FxbN44mpyTHezReGD3UcwerFD7Gcj5HQn33hZu34jVyD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/ProtectionTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/ProtectionTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetProtectionTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableEventCreditEvents creditEvents;

    private CdmProductAssetFloatingAmountEvents floatingAmountEvents;

    private CdmBaseStaticdataAssetCreditObligations obligations;

    public CdmObservableEventCreditEvents getCreditEvents() {
        return creditEvents;
    }

    public CdmProductAssetProtectionTerms creditEvents(CdmObservableEventCreditEvents creditEvents) {
        this.creditEvents = creditEvents;
        return this;
    }

    public CdmProductAssetFloatingAmountEvents getFloatingAmountEvents() {
        return floatingAmountEvents;
    }

    public CdmProductAssetProtectionTerms floatingAmountEvents(CdmProductAssetFloatingAmountEvents floatingAmountEvents) {
        this.floatingAmountEvents = floatingAmountEvents;
        return this;
    }

    public CdmBaseStaticdataAssetCreditObligations getObligations() {
        return obligations;
    }

    public CdmProductAssetProtectionTerms obligations(CdmBaseStaticdataAssetCreditObligations obligations) {
        this.obligations = obligations;
        return this;
    }

}
