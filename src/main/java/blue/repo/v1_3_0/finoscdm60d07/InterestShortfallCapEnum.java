package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4w73hagvHa6sZFz6f8nSMDLELH2kMdCGd65K6nEZ6Gd4")
public class InterestShortfallCapEnum {
    public static String blueId() {
        return "4w73hagvHa6sZFz6f8nSMDLELH2kMdCGd65K6nEZ6Gd4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InterestShortfallCapEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InterestShortfallCapEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/InterestShortfallCapEnum.json";
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

    public InterestShortfallCapEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
