package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DCGZgbytoXwEycKofjx6dZ2E2VhsDE6qc746WxFGWoqv")
public class MasterConfirmationAnnexTypeEnum {
    public static String blueId() {
        return "DCGZgbytoXwEycKofjx6dZ2E2VhsDE6qc746WxFGWoqv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MasterConfirmationAnnexTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MasterConfirmationAnnexTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MasterConfirmationAnnexTypeEnum.json";
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

    public MasterConfirmationAnnexTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
