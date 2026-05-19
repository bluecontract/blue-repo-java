package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7uSsSMsX15vAyVSnAn7M9W9TiMATgrkqZhrYQrnbqV2r")
public class CashPriceTypeEnum {
    public static String blueId() {
        return "7uSsSMsX15vAyVSnAn7M9W9TiMATgrkqZhrYQrnbqV2r";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CashPriceTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CashPriceTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CashPriceTypeEnum.json";
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

    public CashPriceTypeEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
