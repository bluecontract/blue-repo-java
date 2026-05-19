package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("7eVjngMTJQgyb6tRtLn1mPv8MVroZTgfm72NswVnVxVB")
public class ListingExchange {
    public static String blueId() {
        return "7eVjngMTJQgyb6tRtLn1mPv8MVroZTgfm72NswVnVxVB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ListingExchange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ListingExchange";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ListingExchange.json";
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

    private List<FieldWithMetaString> exchange;

    public String getNamespace() {
        return namespace;
    }

    public ListingExchange namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<FieldWithMetaString> getExchange() {
        return exchange;
    }

    public ListingExchange exchange(List<FieldWithMetaString> exchange) {
        this.exchange = exchange;
        return this;
    }

}
