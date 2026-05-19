package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5QURHG6ufFy8YbE2SwBJnk3xnCwoqdrEdDmxYedupBB7")
public class CorporateAction {
    public static String blueId() {
        return "5QURHG6ufFy8YbE2SwBJnk3xnCwoqdrEdDmxYedupBB7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CorporateAction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CorporateAction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CorporateAction.json";
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

    private CorporateActionTypeEnum corporateActionType;

    private String exDate;

    private String payDate;

    private Underlier underlier;

    public String getNamespace() {
        return namespace;
    }

    public CorporateAction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CorporateActionTypeEnum getCorporateActionType() {
        return corporateActionType;
    }

    public CorporateAction corporateActionType(CorporateActionTypeEnum corporateActionType) {
        this.corporateActionType = corporateActionType;
        return this;
    }

    public String getExDate() {
        return exDate;
    }

    public CorporateAction exDate(String exDate) {
        this.exDate = exDate;
        return this;
    }

    public String getPayDate() {
        return payDate;
    }

    public CorporateAction payDate(String payDate) {
        this.payDate = payDate;
        return this;
    }

    public Underlier getUnderlier() {
        return underlier;
    }

    public CorporateAction underlier(Underlier underlier) {
        this.underlier = underlier;
        return this;
    }

}
