package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6z7gjaEtwWSgs1StQNGJsAjS6f3JKxUB3D5c7xCQLQNm")
public class ProductIdentifier {
    public static String blueId() {
        return "6z7gjaEtwWSgs1StQNGJsAjS6f3JKxUB3D5c7xCQLQNm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ProductIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ProductIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ProductIdentifier.json";
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

    private FieldWithMetaString identifier;

    private ProductIdTypeEnum source;

    public String getNamespace() {
        return namespace;
    }

    public ProductIdentifier namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getIdentifier() {
        return identifier;
    }

    public ProductIdentifier identifier(FieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public ProductIdTypeEnum getSource() {
        return source;
    }

    public ProductIdentifier source(ProductIdTypeEnum source) {
        this.source = source;
        return this;
    }

}
