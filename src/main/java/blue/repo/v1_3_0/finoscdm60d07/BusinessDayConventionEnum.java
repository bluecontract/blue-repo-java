package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FYjKvmcTzRNBddpxNjEdu31EQrd26VAAYESVaWq8SfR4")
public class BusinessDayConventionEnum {
    public static String blueId() {
        return "FYjKvmcTzRNBddpxNjEdu31EQrd26VAAYESVaWq8SfR4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "BusinessDayConventionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/BusinessDayConventionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/BusinessDayConventionEnum.json";
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

    public BusinessDayConventionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
