package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("3SZ8QwiGA5TqFWnvZvKbdFxb4iZJZvT9sYb93rdCBqgT")
public class SingleValuationDate {
    public static String blueId() {
        return "3SZ8QwiGA5TqFWnvZvKbdFxb4iZJZvT9sYb93rdCBqgT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SingleValuationDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SingleValuationDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/SingleValuationDate.json";
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

    private BigInteger businessDays;

    public String getNamespace() {
        return namespace;
    }

    public SingleValuationDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getBusinessDays() {
        return businessDays;
    }

    public SingleValuationDate businessDays(BigInteger businessDays) {
        this.businessDays = businessDays;
        return this;
    }

}
