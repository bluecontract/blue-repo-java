package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HPTVPtiuaXtJ3yQ1A3a1cVYEAeuBb3gmLwGeT8wteQsD")
public class ReferencePool {
    public static String blueId() {
        return "HPTVPtiuaXtJ3yQ1A3a1cVYEAeuBb3gmLwGeT8wteQsD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferencePool";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferencePool";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferencePool.json";
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

    private List<ReferencePoolItem> referencePoolItem;

    public String getNamespace() {
        return namespace;
    }

    public ReferencePool namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ReferencePoolItem> getReferencePoolItem() {
        return referencePoolItem;
    }

    public ReferencePool referencePoolItem(List<ReferencePoolItem> referencePoolItem) {
        this.referencePoolItem = referencePoolItem;
        return this;
    }

}
