package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("C7GBqLBRyCKfTtj9ihUbBy2SjPEAn3Y4vEwNxsFgX62k")
public class CdmProductAssetGeneralTerms {
    public static String blueId() {
        return "C7GBqLBRyCKfTtj9ihUbBy2SjPEAn3Y4vEwNxsFgX62k";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/GeneralTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/GeneralTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetGeneralTerms.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<ComRosettaModelFieldWithMetaString> additionalTerm;

    private CdmProductAssetBasketReferenceInformation basketReferenceInformation;

    private CdmObservableAssetCreditIndex indexReferenceInformation;

    private Boolean modifiedEquityDelivery;

    private CdmProductAssetReferenceInformation referenceInformation;

    private Boolean substitution;

    public List<ComRosettaModelFieldWithMetaString> getAdditionalTerm() {
        return additionalTerm;
    }

    public CdmProductAssetGeneralTerms additionalTerm(List<ComRosettaModelFieldWithMetaString> additionalTerm) {
        this.additionalTerm = additionalTerm;
        return this;
    }

    public CdmProductAssetBasketReferenceInformation getBasketReferenceInformation() {
        return basketReferenceInformation;
    }

    public CdmProductAssetGeneralTerms basketReferenceInformation(CdmProductAssetBasketReferenceInformation basketReferenceInformation) {
        this.basketReferenceInformation = basketReferenceInformation;
        return this;
    }

    public CdmObservableAssetCreditIndex getIndexReferenceInformation() {
        return indexReferenceInformation;
    }

    public CdmProductAssetGeneralTerms indexReferenceInformation(CdmObservableAssetCreditIndex indexReferenceInformation) {
        this.indexReferenceInformation = indexReferenceInformation;
        return this;
    }

    public Boolean getModifiedEquityDelivery() {
        return modifiedEquityDelivery;
    }

    public CdmProductAssetGeneralTerms modifiedEquityDelivery(Boolean modifiedEquityDelivery) {
        this.modifiedEquityDelivery = modifiedEquityDelivery;
        return this;
    }

    public CdmProductAssetReferenceInformation getReferenceInformation() {
        return referenceInformation;
    }

    public CdmProductAssetGeneralTerms referenceInformation(CdmProductAssetReferenceInformation referenceInformation) {
        this.referenceInformation = referenceInformation;
        return this;
    }

    public Boolean getSubstitution() {
        return substitution;
    }

    public CdmProductAssetGeneralTerms substitution(Boolean substitution) {
        this.substitution = substitution;
        return this;
    }

}
