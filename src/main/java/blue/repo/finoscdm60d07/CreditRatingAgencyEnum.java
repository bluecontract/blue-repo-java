package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("jDVSLqe5adVRGW1oeEm34S8LcmK5PRYjWLtPeMZMkdi")
public class CreditRatingAgencyEnum {
    public static String blueId() {
        return "jDVSLqe5adVRGW1oeEm34S8LcmK5PRYjWLtPeMZMkdi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditRatingAgencyEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditRatingAgencyEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditRatingAgencyEnum.json";
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

    public CreditRatingAgencyEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
