package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GUrewg7LeH1b8ZY1TqW69xGJd1FdeYnnpaMTs8FcwZsy")
public class CdmProductAssetReferenceObligation {
    public static String blueId() {
        return "GUrewg7LeH1b8ZY1TqW69xGJd1FdeYnnpaMTs8FcwZsy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/ReferenceObligation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/ReferenceObligation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetReferenceObligation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyLegalEntity guarantor;

    private String guarantorReference;

    private CdmBaseStaticdataAssetCommonLoan loan;

    private CdmBaseStaticdataPartyLegalEntity primaryObligor;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaLegalEntity primaryObligorReference;

    private CdmBaseStaticdataAssetCommonSecurity security;

    private Boolean standardReferenceObligation;

    public CdmBaseStaticdataPartyLegalEntity getGuarantor() {
        return guarantor;
    }

    public CdmProductAssetReferenceObligation guarantor(CdmBaseStaticdataPartyLegalEntity guarantor) {
        this.guarantor = guarantor;
        return this;
    }

    public String getGuarantorReference() {
        return guarantorReference;
    }

    public CdmProductAssetReferenceObligation guarantorReference(String guarantorReference) {
        this.guarantorReference = guarantorReference;
        return this;
    }

    public CdmBaseStaticdataAssetCommonLoan getLoan() {
        return loan;
    }

    public CdmProductAssetReferenceObligation loan(CdmBaseStaticdataAssetCommonLoan loan) {
        this.loan = loan;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getPrimaryObligor() {
        return primaryObligor;
    }

    public CdmProductAssetReferenceObligation primaryObligor(CdmBaseStaticdataPartyLegalEntity primaryObligor) {
        this.primaryObligor = primaryObligor;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaLegalEntity getPrimaryObligorReference() {
        return primaryObligorReference;
    }

    public CdmProductAssetReferenceObligation primaryObligorReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaLegalEntity primaryObligorReference) {
        this.primaryObligorReference = primaryObligorReference;
        return this;
    }

    public CdmBaseStaticdataAssetCommonSecurity getSecurity() {
        return security;
    }

    public CdmProductAssetReferenceObligation security(CdmBaseStaticdataAssetCommonSecurity security) {
        this.security = security;
        return this;
    }

    public Boolean getStandardReferenceObligation() {
        return standardReferenceObligation;
    }

    public CdmProductAssetReferenceObligation standardReferenceObligation(Boolean standardReferenceObligation) {
        this.standardReferenceObligation = standardReferenceObligation;
        return this;
    }

}
