package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7QLmRL5Ba3z8CNfAVBuzLNfB3CvBry9XrfyVA1zjh7fX")
public class DividendCurrency {
    public static String blueId() {
        return "7QLmRL5Ba3z8CNfAVBuzLNfB3CvBry9XrfyVA1zjh7fX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendCurrency";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendCurrency";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DividendCurrency.json";
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

    private FieldWithMetaString currency;

    private ReferenceWithMetaString currencyReference;

    private DeterminationMethodEnum determinationMethod;

    public String getNamespace() {
        return namespace;
    }

    public DividendCurrency namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getCurrency() {
        return currency;
    }

    public DividendCurrency currency(FieldWithMetaString currency) {
        this.currency = currency;
        return this;
    }

    public ReferenceWithMetaString getCurrencyReference() {
        return currencyReference;
    }

    public DividendCurrency currencyReference(ReferenceWithMetaString currencyReference) {
        this.currencyReference = currencyReference;
        return this;
    }

    public DeterminationMethodEnum getDeterminationMethod() {
        return determinationMethod;
    }

    public DividendCurrency determinationMethod(DeterminationMethodEnum determinationMethod) {
        this.determinationMethod = determinationMethod;
        return this;
    }

}
