package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2xF5BfFq1Qbo9FHHT2keaqhEbweWtittjL91WNdNLWJ4")
public class InstrumentTypeEnum {
    public static String blueId() {
        return "2xF5BfFq1Qbo9FHHT2keaqhEbweWtittjL91WNdNLWJ4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InstrumentTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InstrumentTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/InstrumentTypeEnum.json";
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

    public InstrumentTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
