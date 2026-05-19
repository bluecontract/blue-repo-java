package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CGm2W6tCtLkkuUyMVjph6w6zTrcerV8jaCWRpmRxSdwv")
public class InterpolationMethodEnum {
    public static String blueId() {
        return "CGm2W6tCtLkkuUyMVjph6w6zTrcerV8jaCWRpmRxSdwv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InterpolationMethodEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InterpolationMethodEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/InterpolationMethodEnum.json";
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

    public InterpolationMethodEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
