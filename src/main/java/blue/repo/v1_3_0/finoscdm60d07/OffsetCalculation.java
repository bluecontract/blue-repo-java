package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("FbR9ZGCDHxmEY8FtyAoSmcz2YYrFJRDjnXwpy4UfjCX8")
public class OffsetCalculation {
    public static String blueId() {
        return "FbR9ZGCDHxmEY8FtyAoSmcz2YYrFJRDjnXwpy4UfjCX8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "OffsetCalculation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/OffsetCalculation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/OffsetCalculation.json";
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

    private BigInteger offsetDays;

    public String getNamespace() {
        return namespace;
    }

    public OffsetCalculation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getOffsetDays() {
        return offsetDays;
    }

    public OffsetCalculation offsetDays(BigInteger offsetDays) {
        this.offsetDays = offsetDays;
        return this;
    }

}
