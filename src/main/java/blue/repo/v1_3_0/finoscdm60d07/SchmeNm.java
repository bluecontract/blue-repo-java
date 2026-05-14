package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FBwW81FZ6wQxTtforDFbqiSqxHUbgM8Jzezzrzf1mcTB")
public class SchmeNm {
    public static String blueId() {
        return "FBwW81FZ6wQxTtforDFbqiSqxHUbgM8Jzezzrzf1mcTB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SchmeNm";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SchmeNm";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SchmeNm.json";
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

    private String prtry;

    public String getNamespace() {
        return namespace;
    }

    public SchmeNm namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getPrtry() {
        return prtry;
    }

    public SchmeNm prtry(String prtry) {
        this.prtry = prtry;
        return this;
    }

}
