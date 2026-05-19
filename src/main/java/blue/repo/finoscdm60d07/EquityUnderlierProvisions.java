package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("68bTDtRvgynPZurH7nT19Jy72N8v8n4ZcDksksPDZ3pd")
public class EquityUnderlierProvisions {
    public static String blueId() {
        return "68bTDtRvgynPZurH7nT19Jy72N8v8n4ZcDksksPDZ3pd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EquityUnderlierProvisions";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EquityUnderlierProvisions";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/EquityUnderlierProvisions.json";
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

    private Boolean componentSecurityIndexAnnexFallback;

    private FieldWithMetaString localJurisdiction;

    private Boolean multipleExchangeIndexAnnexFallback;

    private FieldWithMetaString relevantJurisdiction;

    public String getNamespace() {
        return namespace;
    }

    public EquityUnderlierProvisions namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getComponentSecurityIndexAnnexFallback() {
        return componentSecurityIndexAnnexFallback;
    }

    public EquityUnderlierProvisions componentSecurityIndexAnnexFallback(Boolean componentSecurityIndexAnnexFallback) {
        this.componentSecurityIndexAnnexFallback = componentSecurityIndexAnnexFallback;
        return this;
    }

    public FieldWithMetaString getLocalJurisdiction() {
        return localJurisdiction;
    }

    public EquityUnderlierProvisions localJurisdiction(FieldWithMetaString localJurisdiction) {
        this.localJurisdiction = localJurisdiction;
        return this;
    }

    public Boolean getMultipleExchangeIndexAnnexFallback() {
        return multipleExchangeIndexAnnexFallback;
    }

    public EquityUnderlierProvisions multipleExchangeIndexAnnexFallback(Boolean multipleExchangeIndexAnnexFallback) {
        this.multipleExchangeIndexAnnexFallback = multipleExchangeIndexAnnexFallback;
        return this;
    }

    public FieldWithMetaString getRelevantJurisdiction() {
        return relevantJurisdiction;
    }

    public EquityUnderlierProvisions relevantJurisdiction(FieldWithMetaString relevantJurisdiction) {
        this.relevantJurisdiction = relevantJurisdiction;
        return this;
    }

}
