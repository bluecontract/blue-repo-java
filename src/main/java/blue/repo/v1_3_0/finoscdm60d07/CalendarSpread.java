package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3SqEgXYLqUkA4k3CnMmWU5V2H7JsHdwVb5n7DcsmEbNT")
public class CalendarSpread {
    public static String blueId() {
        return "3SqEgXYLqUkA4k3CnMmWU5V2H7JsHdwVb5n7DcsmEbNT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CalendarSpread";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CalendarSpread";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CalendarSpread.json";
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

    private AdjustableOrRelativeDate expirationDateTwo;

    public String getNamespace() {
        return namespace;
    }

    public CalendarSpread namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableOrRelativeDate getExpirationDateTwo() {
        return expirationDateTwo;
    }

    public CalendarSpread expirationDateTwo(AdjustableOrRelativeDate expirationDateTwo) {
        this.expirationDateTwo = expirationDateTwo;
        return this;
    }

}
