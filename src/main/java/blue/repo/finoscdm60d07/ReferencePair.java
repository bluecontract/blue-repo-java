package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GbPRsXFqYfG2rpddddknTZYmRWdaRGKMdb9gauC9XJSV")
public class ReferencePair {
    public static String blueId() {
        return "GbPRsXFqYfG2rpddddknTZYmRWdaRGKMdb9gauC9XJSV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferencePair";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferencePair";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferencePair.json";
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

    private FieldWithMetaEntityTypeEnum entityType;

    private Boolean noReferenceObligation;

    private LegalEntity referenceEntity;

    private ReferenceObligation referenceObligation;

    public String getNamespace() {
        return namespace;
    }

    public ReferencePair namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaEntityTypeEnum getEntityType() {
        return entityType;
    }

    public ReferencePair entityType(FieldWithMetaEntityTypeEnum entityType) {
        this.entityType = entityType;
        return this;
    }

    public Boolean getNoReferenceObligation() {
        return noReferenceObligation;
    }

    public ReferencePair noReferenceObligation(Boolean noReferenceObligation) {
        this.noReferenceObligation = noReferenceObligation;
        return this;
    }

    public LegalEntity getReferenceEntity() {
        return referenceEntity;
    }

    public ReferencePair referenceEntity(LegalEntity referenceEntity) {
        this.referenceEntity = referenceEntity;
        return this;
    }

    public ReferenceObligation getReferenceObligation() {
        return referenceObligation;
    }

    public ReferencePair referenceObligation(ReferenceObligation referenceObligation) {
        this.referenceObligation = referenceObligation;
        return this;
    }

}
