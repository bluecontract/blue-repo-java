package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5QtGQkvnSzkFFPTpXTBg9gDTLxBoHHrMtj7CiLLiGa94")
public class RefRate {
    public static String blueId() {
        return "5QtGQkvnSzkFFPTpXTBg9gDTLxBoHHrMtj7CiLLiGa94";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "RefRate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/RefRate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/RefRate.json";
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

    private String indx;

    private String nm;

    public String getNamespace() {
        return namespace;
    }

    public RefRate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getIndx() {
        return indx;
    }

    public RefRate indx(String indx) {
        this.indx = indx;
        return this;
    }

    public String getNm() {
        return nm;
    }

    public RefRate nm(String nm) {
        this.nm = nm;
        return this;
    }

}
