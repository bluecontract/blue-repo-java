package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8oM4aajFH5AkKFmo3PpVxTdFh1kswfn5ZhVDfGQ4fgqd")
public class OrdrTrnsmssn {
    public static String blueId() {
        return "8oM4aajFH5AkKFmo3PpVxTdFh1kswfn5ZhVDfGQ4fgqd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "OrdrTrnsmssn";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/OrdrTrnsmssn";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/OrdrTrnsmssn.json";
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

    private String trnsmssnInd;

    public String getNamespace() {
        return namespace;
    }

    public OrdrTrnsmssn namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getTrnsmssnInd() {
        return trnsmssnInd;
    }

    public OrdrTrnsmssn trnsmssnInd(String trnsmssnInd) {
        this.trnsmssnInd = trnsmssnInd;
        return this;
    }

}
