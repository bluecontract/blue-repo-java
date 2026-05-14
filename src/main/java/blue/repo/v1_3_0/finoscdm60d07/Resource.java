package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Jk4vT3kzUuc5nFNanqaiVjSjGbat9QVGBq9AB8pgBDL")
public class Resource {
    public static String blueId() {
        return "Jk4vT3kzUuc5nFNanqaiVjSjGbat9QVGBq9AB8pgBDL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Resource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Resource";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Resource.json";
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

    private String comments;

    private FieldWithMetaString language;

    private ResourceLength length;

    private FieldWithMetaString mimeType;

    private FieldWithMetaString resourceId;

    private FieldWithMetaResourceTypeEnum resourceType;

    private Double sizeInBytes;

    private String string;

    private String url;

    public String getNamespace() {
        return namespace;
    }

    public Resource namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public Resource comments(String comments) {
        this.comments = comments;
        return this;
    }

    public FieldWithMetaString getLanguage() {
        return language;
    }

    public Resource language(FieldWithMetaString language) {
        this.language = language;
        return this;
    }

    public ResourceLength getLength() {
        return length;
    }

    public Resource length(ResourceLength length) {
        this.length = length;
        return this;
    }

    public FieldWithMetaString getMimeType() {
        return mimeType;
    }

    public Resource mimeType(FieldWithMetaString mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public FieldWithMetaString getResourceId() {
        return resourceId;
    }

    public Resource resourceId(FieldWithMetaString resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public FieldWithMetaResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public Resource resourceType(FieldWithMetaResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public Double getSizeInBytes() {
        return sizeInBytes;
    }

    public Resource sizeInBytes(Double sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    public String getString() {
        return string;
    }

    public Resource string(String string) {
        this.string = string;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Resource url(String url) {
        this.url = url;
        return this;
    }

}
