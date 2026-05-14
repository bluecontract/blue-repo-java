package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5P7gfHpfkYrd2v7YWYBpuuzamXgpYDegmCZwqkWsBW1G")
public class CustomisableOffset {
    public static String blueId() {
        return "5P7gfHpfkYrd2v7YWYBpuuzamXgpYDegmCZwqkWsBW1G";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CustomisableOffset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CustomisableOffset";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CustomisableOffset.json";
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

    private String customProvision;

    private Offset offset;

    public String getNamespace() {
        return namespace;
    }

    public CustomisableOffset namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getCustomProvision() {
        return customProvision;
    }

    public CustomisableOffset customProvision(String customProvision) {
        this.customProvision = customProvision;
        return this;
    }

    public Offset getOffset() {
        return offset;
    }

    public CustomisableOffset offset(Offset offset) {
        this.offset = offset;
        return this;
    }

}
