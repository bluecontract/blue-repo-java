package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ES2ay6GPzT9HaQobXwnNXmayrWwvgEHHD8E8qfK1oMEy")
public class ConstituentWeight {
    public static String blueId() {
        return "ES2ay6GPzT9HaQobXwnNXmayrWwvgEHHD8E8qfK1oMEy";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ConstituentWeight";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ConstituentWeight";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ConstituentWeight.json";
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

    private Double basketPercentage;

    private Double openUnits;

    public String getNamespace() {
        return namespace;
    }

    public ConstituentWeight namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getBasketPercentage() {
        return basketPercentage;
    }

    public ConstituentWeight basketPercentage(Double basketPercentage) {
        this.basketPercentage = basketPercentage;
        return this;
    }

    public Double getOpenUnits() {
        return openUnits;
    }

    public ConstituentWeight openUnits(Double openUnits) {
        this.openUnits = openUnits;
        return this;
    }

}
