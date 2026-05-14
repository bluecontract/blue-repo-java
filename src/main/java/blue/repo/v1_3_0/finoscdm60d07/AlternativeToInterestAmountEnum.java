package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8vLzPXDCufGQtU93ZgmL4k85Rx3j5zA1XTLC5HKoTKnJ")
public class AlternativeToInterestAmountEnum {
    public static String blueId() {
        return "8vLzPXDCufGQtU93ZgmL4k85Rx3j5zA1XTLC5HKoTKnJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AlternativeToInterestAmountEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AlternativeToInterestAmountEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AlternativeToInterestAmountEnum.json";
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

    public AlternativeToInterestAmountEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
