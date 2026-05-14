package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("99LXK5EYFxrWSTN1p3AiisuybBAKJKFE3RMNJcgjvu4n")
public class MoneyRange {
    public static String blueId() {
        return "99LXK5EYFxrWSTN1p3AiisuybBAKJKFE3RMNJcgjvu4n";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MoneyRange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MoneyRange";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/MoneyRange.json";
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

    private MoneyBound lowerBound;

    private MoneyBound upperBound;

    public String getNamespace() {
        return namespace;
    }

    public MoneyRange namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MoneyBound getLowerBound() {
        return lowerBound;
    }

    public MoneyRange lowerBound(MoneyBound lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    public MoneyBound getUpperBound() {
        return upperBound;
    }

    public MoneyRange upperBound(MoneyBound upperBound) {
        this.upperBound = upperBound;
        return this;
    }

}
