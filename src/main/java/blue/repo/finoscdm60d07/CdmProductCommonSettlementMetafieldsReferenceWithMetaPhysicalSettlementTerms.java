package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4zZq26rs1RRNTjwdwvbyZZAbRe3y2EykE2PtTne7suWB")
public class CdmProductCommonSettlementMetafieldsReferenceWithMetaPhysicalSettlementTerms {
    public static String blueId() {
        return "4zZq26rs1RRNTjwdwvbyZZAbRe3y2EykE2PtTne7suWB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/metafields/ReferenceWithMetaPhysicalSettlementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/metafields/ReferenceWithMetaPhysicalSettlementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementmetafieldsReferenceWithMetaPhysicalSettlementTerms.json";
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

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaPhysicalSettlementTerms address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaPhysicalSettlementTerms externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaPhysicalSettlementTerms globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
