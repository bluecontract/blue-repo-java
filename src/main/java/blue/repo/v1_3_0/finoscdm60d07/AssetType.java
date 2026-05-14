package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("FRqYRTWRxZfg1RuMuPbNaxZkgGMc8oTTuf4gi5Mhrb8C")
public class AssetType {
    public static String blueId() {
        return "FRqYRTWRxZfg1RuMuPbNaxZkgGMc8oTTuf4gi5Mhrb8C";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetType";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AssetType.json";
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

    private AssetTypeEnum assetType;

    private DebtType debtType;

    private EquityTypeEnum equityType;

    private FundProductTypeEnum fundType;

    private List<String> otherAssetType;

    private InstrumentTypeEnum securityType;

    public String getNamespace() {
        return namespace;
    }

    public AssetType namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AssetTypeEnum getAssetType() {
        return assetType;
    }

    public AssetType assetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
        return this;
    }

    public DebtType getDebtType() {
        return debtType;
    }

    public AssetType debtType(DebtType debtType) {
        this.debtType = debtType;
        return this;
    }

    public EquityTypeEnum getEquityType() {
        return equityType;
    }

    public AssetType equityType(EquityTypeEnum equityType) {
        this.equityType = equityType;
        return this;
    }

    public FundProductTypeEnum getFundType() {
        return fundType;
    }

    public AssetType fundType(FundProductTypeEnum fundType) {
        this.fundType = fundType;
        return this;
    }

    public List<String> getOtherAssetType() {
        return otherAssetType;
    }

    public AssetType otherAssetType(List<String> otherAssetType) {
        this.otherAssetType = otherAssetType;
        return this;
    }

    public InstrumentTypeEnum getSecurityType() {
        return securityType;
    }

    public AssetType securityType(InstrumentTypeEnum securityType) {
        this.securityType = securityType;
        return this;
    }

}
