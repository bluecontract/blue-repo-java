package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Aogoj2sCUGRvYLZhVJNntPd3rKjX5XU82C9NYKGNG6EH")
public class CdmProductAssetReferenceInformation {
    public static String blueId() {
        return "Aogoj2sCUGRvYLZhVJNntPd3rKjX5XU82C9NYKGNG6EH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/ReferenceInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/ReferenceInformation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetReferenceInformation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean allGuarantees;

    private Boolean noReferenceObligation;

    private CdmBaseStaticdataPartyLegalEntity referenceEntity;

    private List<CdmProductAssetReferenceObligation> referenceObligation;

    private Boolean referencePolicy;

    private CdmObservableAssetPrice referencePrice;

    private Boolean securedList;

    private Boolean unknownReferenceObligation;

    public Boolean getAllGuarantees() {
        return allGuarantees;
    }

    public CdmProductAssetReferenceInformation allGuarantees(Boolean allGuarantees) {
        this.allGuarantees = allGuarantees;
        return this;
    }

    public Boolean getNoReferenceObligation() {
        return noReferenceObligation;
    }

    public CdmProductAssetReferenceInformation noReferenceObligation(Boolean noReferenceObligation) {
        this.noReferenceObligation = noReferenceObligation;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getReferenceEntity() {
        return referenceEntity;
    }

    public CdmProductAssetReferenceInformation referenceEntity(CdmBaseStaticdataPartyLegalEntity referenceEntity) {
        this.referenceEntity = referenceEntity;
        return this;
    }

    public List<CdmProductAssetReferenceObligation> getReferenceObligation() {
        return referenceObligation;
    }

    public CdmProductAssetReferenceInformation referenceObligation(List<CdmProductAssetReferenceObligation> referenceObligation) {
        this.referenceObligation = referenceObligation;
        return this;
    }

    public Boolean getReferencePolicy() {
        return referencePolicy;
    }

    public CdmProductAssetReferenceInformation referencePolicy(Boolean referencePolicy) {
        this.referencePolicy = referencePolicy;
        return this;
    }

    public CdmObservableAssetPrice getReferencePrice() {
        return referencePrice;
    }

    public CdmProductAssetReferenceInformation referencePrice(CdmObservableAssetPrice referencePrice) {
        this.referencePrice = referencePrice;
        return this;
    }

    public Boolean getSecuredList() {
        return securedList;
    }

    public CdmProductAssetReferenceInformation securedList(Boolean securedList) {
        this.securedList = securedList;
        return this;
    }

    public Boolean getUnknownReferenceObligation() {
        return unknownReferenceObligation;
    }

    public CdmProductAssetReferenceInformation unknownReferenceObligation(Boolean unknownReferenceObligation) {
        this.unknownReferenceObligation = unknownReferenceObligation;
        return this;
    }

}
