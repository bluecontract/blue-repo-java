package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2F73RtgmE2N99HG6VQw7BNrtWcf4sQjQJ6zJ3Hp24XmS")
public class AssetCountryOfOrigin {
    public static String blueId() {
        return "2F73RtgmE2N99HG6VQw7BNrtWcf4sQjQJ6zJ3Hp24XmS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetCountryOfOrigin";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetCountryOfOrigin";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AssetCountryOfOrigin.json";
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

    private ISOCountryCodeEnum assetCountryOfOrigin;

    public String getNamespace() {
        return namespace;
    }

    public AssetCountryOfOrigin namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ISOCountryCodeEnum getAssetCountryOfOrigin() {
        return assetCountryOfOrigin;
    }

    public AssetCountryOfOrigin assetCountryOfOrigin(ISOCountryCodeEnum assetCountryOfOrigin) {
        this.assetCountryOfOrigin = assetCountryOfOrigin;
        return this;
    }

}
