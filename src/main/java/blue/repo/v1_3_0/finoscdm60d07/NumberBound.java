package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BSnAjRUZZbhaHLcdMC45mTAqRTZDS1SMRRZNSmpEHjhr")
public class NumberBound {
    public static String blueId() {
        return "BSnAjRUZZbhaHLcdMC45mTAqRTZDS1SMRRZNSmpEHjhr";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NumberBound";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NumberBound";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/NumberBound.json";
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

    private Boolean inclusive;

    private Double number;

    public String getNamespace() {
        return namespace;
    }

    public NumberBound namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getInclusive() {
        return inclusive;
    }

    public NumberBound inclusive(Boolean inclusive) {
        this.inclusive = inclusive;
        return this;
    }

    public Double getNumber() {
        return number;
    }

    public NumberBound number(Double number) {
        this.number = number;
        return this;
    }

}
