package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9UdmkhkDcVbAW2iVtkzN5GPHav1vvJaKeJVemKZVJDd5")
public class AssetMaturity {
    public static String blueId() {
        return "9UdmkhkDcVbAW2iVtkzN5GPHav1vvJaKeJVemKZVJDd5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetMaturity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetMaturity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AssetMaturity.json";
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

    private PeriodRange maturityRange;

    private MaturityTypeEnum maturityType;

    public String getNamespace() {
        return namespace;
    }

    public AssetMaturity namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PeriodRange getMaturityRange() {
        return maturityRange;
    }

    public AssetMaturity maturityRange(PeriodRange maturityRange) {
        this.maturityRange = maturityRange;
        return this;
    }

    public MaturityTypeEnum getMaturityType() {
        return maturityType;
    }

    public AssetMaturity maturityType(MaturityTypeEnum maturityType) {
        this.maturityType = maturityType;
        return this;
    }

}
