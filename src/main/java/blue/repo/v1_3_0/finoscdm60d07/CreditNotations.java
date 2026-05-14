package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4bvJ21xEWHdoSoU95kEaV58KUbsBM9jaXEH7qxXw9hFF")
public class CreditNotations {
    public static String blueId() {
        return "4bvJ21xEWHdoSoU95kEaV58KUbsBM9jaXEH7qxXw9hFF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditNotations";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditNotations";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CreditNotations.json";
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

    private CreditNotation creditNotation;

    private MultipleCreditNotations creditNotations;

    public String getNamespace() {
        return namespace;
    }

    public CreditNotations namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CreditNotation getCreditNotation() {
        return creditNotation;
    }

    public CreditNotations creditNotation(CreditNotation creditNotation) {
        this.creditNotation = creditNotation;
        return this;
    }

    public MultipleCreditNotations getCreditNotations() {
        return creditNotations;
    }

    public CreditNotations creditNotations(MultipleCreditNotations creditNotations) {
        this.creditNotations = creditNotations;
        return this;
    }

}
