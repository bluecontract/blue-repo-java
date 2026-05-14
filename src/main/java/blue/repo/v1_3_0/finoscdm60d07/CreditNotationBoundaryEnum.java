package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BtoofM2rNANnm17EWNGce4ERSE2hoYLQ3shEbNgLYEPN")
public class CreditNotationBoundaryEnum {
    public static String blueId() {
        return "BtoofM2rNANnm17EWNGce4ERSE2hoYLQ3shEbNgLYEPN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditNotationBoundaryEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditNotationBoundaryEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CreditNotationBoundaryEnum.json";
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

    public CreditNotationBoundaryEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
