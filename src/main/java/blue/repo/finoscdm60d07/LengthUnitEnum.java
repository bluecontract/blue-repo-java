package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("74dmjW8PH4ugiNGFVQu6zxcyah2WUB1THAP4i5JjXguY")
public class LengthUnitEnum {
    public static String blueId() {
        return "74dmjW8PH4ugiNGFVQu6zxcyah2WUB1THAP4i5JjXguY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LengthUnitEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LengthUnitEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/LengthUnitEnum.json";
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

    public LengthUnitEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
