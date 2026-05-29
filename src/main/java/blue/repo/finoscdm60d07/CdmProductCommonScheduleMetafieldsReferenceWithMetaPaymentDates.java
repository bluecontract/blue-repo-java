package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3dRUSDjJdgNWK1v7xMqD4sANMTcNwBMxpGLaLVPaZk4D")
public class CdmProductCommonScheduleMetafieldsReferenceWithMetaPaymentDates {
    public static String blueId() {
        return "3dRUSDjJdgNWK1v7xMqD4sANMTcNwBMxpGLaLVPaZk4D";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/metafields/ReferenceWithMetaPaymentDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/metafields/ReferenceWithMetaPaymentDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonschedulemetafieldsReferenceWithMetaPaymentDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelLibMetaReference address;

    private String externalReference;

    private String globalReference;

    public ComRosettaModelLibMetaReference getAddress() {
        return address;
    }

    public CdmProductCommonScheduleMetafieldsReferenceWithMetaPaymentDates address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmProductCommonScheduleMetafieldsReferenceWithMetaPaymentDates externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmProductCommonScheduleMetafieldsReferenceWithMetaPaymentDates globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
