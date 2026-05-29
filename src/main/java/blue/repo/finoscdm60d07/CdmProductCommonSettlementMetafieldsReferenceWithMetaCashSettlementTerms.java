package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4LxF2iZVCWETVa5Sk6jK2WAVLX1SD7WaPtmgesb4xuBC")
public class CdmProductCommonSettlementMetafieldsReferenceWithMetaCashSettlementTerms {
    public static String blueId() {
        return "4LxF2iZVCWETVa5Sk6jK2WAVLX1SD7WaPtmgesb4xuBC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/settlement/metafields/ReferenceWithMetaCashSettlementTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/settlement/metafields/ReferenceWithMetaCashSettlementTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonsettlementmetafieldsReferenceWithMetaCashSettlementTerms.json";
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

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaCashSettlementTerms address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaCashSettlementTerms externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmProductCommonSettlementMetafieldsReferenceWithMetaCashSettlementTerms globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
