package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HpxJXHkm7pAsapD3ajLkwtKdCfYmmyMTh8NTGPcSr3H7")
public class PriceOperandEnum {
    public static String blueId() {
        return "HpxJXHkm7pAsapD3ajLkwtKdCfYmmyMTh8NTGPcSr3H7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PriceOperandEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PriceOperandEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PriceOperandEnum.json";
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

    public PriceOperandEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
