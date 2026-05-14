package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3Y65zs3Y5popHuK1MAYkSQXghxeWRxsRmJcySPmkmiAs")
public class LegalAgreementTypeEnum {
    public static String blueId() {
        return "3Y65zs3Y5popHuK1MAYkSQXghxeWRxsRmJcySPmkmiAs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LegalAgreementTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LegalAgreementTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/LegalAgreementTypeEnum.json";
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

    public LegalAgreementTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
