package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2w9AigpM9KEZGhXep7EUFbz6DLHYFWLJ89vSuKnhyvM7")
public class CapacityUnitEnum {
    public static String blueId() {
        return "2w9AigpM9KEZGhXep7EUFbz6DLHYFWLJ89vSuKnhyvM7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CapacityUnitEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CapacityUnitEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CapacityUnitEnum.json";
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

    public CapacityUnitEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
