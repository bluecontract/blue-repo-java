package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H4mh3RSWAWGHZvMSf8mFsQwYe7v869PNkynUeyXUqwDw")
public class ISOCountryCodeEnum {
    public static String blueId() {
        return "H4mh3RSWAWGHZvMSf8mFsQwYe7v869PNkynUeyXUqwDw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ISOCountryCodeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ISOCountryCodeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ISOCountryCodeEnum.json";
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

    public ISOCountryCodeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
