package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2MBY3n1ccqVv3XyWrmGJ6dB87YtvzCaNGTvwyiDrVjdn")
public class CdmProductAssetAdditionalFixedPayments {
    public static String blueId() {
        return "2MBY3n1ccqVv3XyWrmGJ6dB87YtvzCaNGTvwyiDrVjdn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/asset/AdditionalFixedPayments";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/asset/AdditionalFixedPayments";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductassetAdditionalFixedPayments.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean interestShortfallReimbursement;

    private Boolean principalShortfallReimbursement;

    private Boolean writedownReimbursement;

    public Boolean getInterestShortfallReimbursement() {
        return interestShortfallReimbursement;
    }

    public CdmProductAssetAdditionalFixedPayments interestShortfallReimbursement(Boolean interestShortfallReimbursement) {
        this.interestShortfallReimbursement = interestShortfallReimbursement;
        return this;
    }

    public Boolean getPrincipalShortfallReimbursement() {
        return principalShortfallReimbursement;
    }

    public CdmProductAssetAdditionalFixedPayments principalShortfallReimbursement(Boolean principalShortfallReimbursement) {
        this.principalShortfallReimbursement = principalShortfallReimbursement;
        return this;
    }

    public Boolean getWritedownReimbursement() {
        return writedownReimbursement;
    }

    public CdmProductAssetAdditionalFixedPayments writedownReimbursement(Boolean writedownReimbursement) {
        this.writedownReimbursement = writedownReimbursement;
        return this;
    }

}
