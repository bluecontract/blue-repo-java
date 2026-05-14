package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4jSenpVQbj8UZbtp7j8PMm62ydesCtRTYe53wChoBWxK")
public class ResourceLength {
    public static String blueId() {
        return "4jSenpVQbj8UZbtp7j8PMm62ydesCtRTYe53wChoBWxK";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ResourceLength";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ResourceLength";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ResourceLength.json";
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

    private LengthUnitEnum lengthUnit;

    private Double lengthValue;

    public String getNamespace() {
        return namespace;
    }

    public ResourceLength namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public LengthUnitEnum getLengthUnit() {
        return lengthUnit;
    }

    public ResourceLength lengthUnit(LengthUnitEnum lengthUnit) {
        this.lengthUnit = lengthUnit;
        return this;
    }

    public Double getLengthValue() {
        return lengthValue;
    }

    public ResourceLength lengthValue(Double lengthValue) {
        this.lengthValue = lengthValue;
        return this;
    }

}
