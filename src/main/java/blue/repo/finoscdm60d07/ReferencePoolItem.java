package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("G1kD9m52DKdRTrbohoxcB66C3X1DQUA8TvxkiUMZh6Wp")
public class ReferencePoolItem {
    public static String blueId() {
        return "G1kD9m52DKdRTrbohoxcB66C3X1DQUA8TvxkiUMZh6Wp";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferencePoolItem";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferencePoolItem";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferencePoolItem.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private ReferenceWithMetaCashSettlementTerms cashSettlementTermsReference;

    private ConstituentWeight constituentWeight;

    private ReferenceWithMetaPhysicalSettlementTerms physicalSettlementTermsReference;

    private ReferenceWithMetaProtectionTerms protectionTermsReference;

    private ReferencePair referencePair;

    public String getNamespace() {
        return namespace;
    }

    public ReferencePoolItem namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaCashSettlementTerms getCashSettlementTermsReference() {
        return cashSettlementTermsReference;
    }

    public ReferencePoolItem cashSettlementTermsReference(ReferenceWithMetaCashSettlementTerms cashSettlementTermsReference) {
        this.cashSettlementTermsReference = cashSettlementTermsReference;
        return this;
    }

    public ConstituentWeight getConstituentWeight() {
        return constituentWeight;
    }

    public ReferencePoolItem constituentWeight(ConstituentWeight constituentWeight) {
        this.constituentWeight = constituentWeight;
        return this;
    }

    public ReferenceWithMetaPhysicalSettlementTerms getPhysicalSettlementTermsReference() {
        return physicalSettlementTermsReference;
    }

    public ReferencePoolItem physicalSettlementTermsReference(ReferenceWithMetaPhysicalSettlementTerms physicalSettlementTermsReference) {
        this.physicalSettlementTermsReference = physicalSettlementTermsReference;
        return this;
    }

    public ReferenceWithMetaProtectionTerms getProtectionTermsReference() {
        return protectionTermsReference;
    }

    public ReferencePoolItem protectionTermsReference(ReferenceWithMetaProtectionTerms protectionTermsReference) {
        this.protectionTermsReference = protectionTermsReference;
        return this;
    }

    public ReferencePair getReferencePair() {
        return referencePair;
    }

    public ReferencePoolItem referencePair(ReferencePair referencePair) {
        this.referencePair = referencePair;
        return this;
    }

}
