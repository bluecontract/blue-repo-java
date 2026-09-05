package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;
import java.util.Map;

@TypeBlueId("2gpbpX2mC3rTsuVA9afWtSNPd8FPdoDZEG8mmZrzDDCm")
public class SearchContract extends blue.language.processor.model.MarkerContract {
    public static String blueId() {
        return "2gpbpX2mC3rTsuVA9afWtSNPd8FPdoDZEG8mmZrzDDCm";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Search Contract";
    }

    public static String qualifiedName() {
        return "MyOS/Search Contract";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/SearchContract.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<String> q;

    private Map<String, String> kv;

    private Node geo;

    public List<String> getQ() {
        return q;
    }

    public SearchContract q(List<String> q) {
        this.q = q;
        return this;
    }

    public Map<String, String> getKv() {
        return kv;
    }

    public SearchContract kv(Map<String, String> kv) {
        this.kv = kv;
        return this;
    }

    public Node getGeo() {
        return geo;
    }

    public SearchContract geo(Node geo) {
        this.geo = geo;
        return this;
    }

}
