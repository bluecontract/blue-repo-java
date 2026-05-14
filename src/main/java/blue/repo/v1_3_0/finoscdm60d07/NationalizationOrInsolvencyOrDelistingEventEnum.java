package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("JAjnk6yKqKMUA23F5ct6Ms2BTzRTqVmTrTSr8hzKaBeM")
public class NationalizationOrInsolvencyOrDelistingEventEnum {
    public static String blueId() {
        return "JAjnk6yKqKMUA23F5ct6Ms2BTzRTqVmTrTSr8hzKaBeM";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "NationalizationOrInsolvencyOrDelistingEventEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/NationalizationOrInsolvencyOrDelistingEventEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/NationalizationOrInsolvencyOrDelistingEventEnum.json";
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

    public NationalizationOrInsolvencyOrDelistingEventEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
