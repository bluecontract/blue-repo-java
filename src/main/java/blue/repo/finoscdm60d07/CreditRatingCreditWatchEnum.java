package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Eh1WQeRGr2rXgWTeaFEUYch41ymvx6mSHV55hFPcLxkL")
public class CreditRatingCreditWatchEnum {
    public static String blueId() {
        return "Eh1WQeRGr2rXgWTeaFEUYch41ymvx6mSHV55hFPcLxkL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditRatingCreditWatchEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditRatingCreditWatchEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditRatingCreditWatchEnum.json";
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

    public CreditRatingCreditWatchEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
