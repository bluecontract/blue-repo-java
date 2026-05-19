package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Zy4ykqiA5gdfj4kc4E4YvJgsWP2iDydoQTNLD26oy9c")
public class Prsn {
    public static String blueId() {
        return "Zy4ykqiA5gdfj4kc4E4YvJgsWP2iDydoQTNLD26oy9c";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Prsn";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Prsn";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Prsn.json";
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

    private String ctryOfBrnch;

    private Othr othr;

    public String getNamespace() {
        return namespace;
    }

    public Prsn namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getCtryOfBrnch() {
        return ctryOfBrnch;
    }

    public Prsn ctryOfBrnch(String ctryOfBrnch) {
        this.ctryOfBrnch = ctryOfBrnch;
        return this;
    }

    public Othr getOthr() {
        return othr;
    }

    public Prsn othr(Othr othr) {
        this.othr = othr;
        return this;
    }

}
