package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3Y6NLPePzX63tBUcDRcuZp6SmXT9ie8eJCCiFfHvSzUA")
public class CdmProductAssetFloatingAmountEvents {
    public static String blueId() {
        return "3Y6NLPePzX63tBUcDRcuZp6SmXT9ie8eJCCiFfHvSzUA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/FloatingAmountEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/FloatingAmountEvents";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetFloatingAmountEvents.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductAssetAdditionalFixedPayments additionalFixedPayments;

    private Boolean failureToPayPrincipal;

    private CdmProductAssetFloatingAmountProvisions floatingAmountProvisions;

    private Boolean impliedWritedown;

    private CdmProductAssetInterestShortFall interestShortfall;

    private Boolean writedown;

    public CdmProductAssetAdditionalFixedPayments getAdditionalFixedPayments() {
        return additionalFixedPayments;
    }

    public CdmProductAssetFloatingAmountEvents additionalFixedPayments(CdmProductAssetAdditionalFixedPayments additionalFixedPayments) {
        this.additionalFixedPayments = additionalFixedPayments;
        return this;
    }

    public Boolean getFailureToPayPrincipal() {
        return failureToPayPrincipal;
    }

    public CdmProductAssetFloatingAmountEvents failureToPayPrincipal(Boolean failureToPayPrincipal) {
        this.failureToPayPrincipal = failureToPayPrincipal;
        return this;
    }

    public CdmProductAssetFloatingAmountProvisions getFloatingAmountProvisions() {
        return floatingAmountProvisions;
    }

    public CdmProductAssetFloatingAmountEvents floatingAmountProvisions(CdmProductAssetFloatingAmountProvisions floatingAmountProvisions) {
        this.floatingAmountProvisions = floatingAmountProvisions;
        return this;
    }

    public Boolean getImpliedWritedown() {
        return impliedWritedown;
    }

    public CdmProductAssetFloatingAmountEvents impliedWritedown(Boolean impliedWritedown) {
        this.impliedWritedown = impliedWritedown;
        return this;
    }

    public CdmProductAssetInterestShortFall getInterestShortfall() {
        return interestShortfall;
    }

    public CdmProductAssetFloatingAmountEvents interestShortfall(CdmProductAssetInterestShortFall interestShortfall) {
        this.interestShortfall = interestShortfall;
        return this;
    }

    public Boolean getWritedown() {
        return writedown;
    }

    public CdmProductAssetFloatingAmountEvents writedown(Boolean writedown) {
        this.writedown = writedown;
        return this;
    }

}
