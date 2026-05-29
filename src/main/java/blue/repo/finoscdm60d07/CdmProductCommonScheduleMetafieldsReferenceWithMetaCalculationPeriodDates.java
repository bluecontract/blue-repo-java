package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5kML8V9qeDP2N3N3L173vbHKEbT1tjwLQ89bXgwhB2jf")
public class CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates {
    public static String blueId() {
        return "5kML8V9qeDP2N3N3L173vbHKEbT1tjwLQ89bXgwhB2jf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/metafields/ReferenceWithMetaCalculationPeriodDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/metafields/ReferenceWithMetaCalculationPeriodDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonschedulemetafieldsReferenceWithMetaCalculationPeriodDates.json";
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

    public CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmProductCommonScheduleMetafieldsReferenceWithMetaCalculationPeriodDates globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
