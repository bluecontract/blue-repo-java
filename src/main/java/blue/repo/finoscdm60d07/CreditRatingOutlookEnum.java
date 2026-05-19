package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Bc75jDqe3fjCyh6q1ea46wddqgVkBzVD2CDeWC3FwFFb")
public class CreditRatingOutlookEnum {
    public static String blueId() {
        return "Bc75jDqe3fjCyh6q1ea46wddqgVkBzVD2CDeWC3FwFFb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditRatingOutlookEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditRatingOutlookEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditRatingOutlookEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public CreditRatingOutlookEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
