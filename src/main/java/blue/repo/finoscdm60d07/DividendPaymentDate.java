package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6cTJGF4U4ByKidsbgw7xfv88uzCqB3QBMjrpnVKuFC9o")
public class DividendPaymentDate {
    public static String blueId() {
        return "6cTJGF4U4ByKidsbgw7xfv88uzCqB3QBMjrpnVKuFC9o";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendPaymentDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendPaymentDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DividendPaymentDate.json";
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

    private ReferenceWithMetaAdjustableOrRelativeDate dividendDate;

    private DividendDateReference dividendDateReference;

    public String getNamespace() {
        return namespace;
    }

    public DividendPaymentDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaAdjustableOrRelativeDate getDividendDate() {
        return dividendDate;
    }

    public DividendPaymentDate dividendDate(ReferenceWithMetaAdjustableOrRelativeDate dividendDate) {
        this.dividendDate = dividendDate;
        return this;
    }

    public DividendDateReference getDividendDateReference() {
        return dividendDateReference;
    }

    public DividendPaymentDate dividendDateReference(DividendDateReference dividendDateReference) {
        this.dividendDateReference = dividendDateReference;
        return this;
    }

}
