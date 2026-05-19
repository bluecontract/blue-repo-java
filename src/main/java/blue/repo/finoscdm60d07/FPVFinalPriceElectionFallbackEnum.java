package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Cb1JPrjRNB21wPReJfsipgSPTSyBFU6C9pVMeAqcGH2")
public class FPVFinalPriceElectionFallbackEnum {
    public static String blueId() {
        return "Cb1JPrjRNB21wPReJfsipgSPTSyBFU6C9pVMeAqcGH2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FPVFinalPriceElectionFallbackEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FPVFinalPriceElectionFallbackEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FPVFinalPriceElectionFallbackEnum.json";
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

    public FPVFinalPriceElectionFallbackEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
