package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CaUwmBDEjhfmbe9wpuvWzgcVhtCaqKpook9TPzBEr57J")
public class DebtInterestEnum {
    public static String blueId() {
        return "CaUwmBDEjhfmbe9wpuvWzgcVhtCaqKpook9TPzBEr57J";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DebtInterestEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DebtInterestEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DebtInterestEnum.json";
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

    public DebtInterestEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
