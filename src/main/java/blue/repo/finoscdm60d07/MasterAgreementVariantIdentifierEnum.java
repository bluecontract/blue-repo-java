package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("41Su5SkQUFTSWLFcACHf8vaUTy7SEuvynt982wsfAC62")
public class MasterAgreementVariantIdentifierEnum {
    public static String blueId() {
        return "41Su5SkQUFTSWLFcACHf8vaUTy7SEuvynt982wsfAC62";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MasterAgreementVariantIdentifierEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MasterAgreementVariantIdentifierEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MasterAgreementVariantIdentifierEnum.json";
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

    public MasterAgreementVariantIdentifierEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
