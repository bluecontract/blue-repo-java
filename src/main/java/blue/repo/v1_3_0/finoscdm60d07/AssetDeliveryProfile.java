package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CMPtS5jRjUoiDerQMiTJoExYduc2NvAbW6imuFppsy8d")
public class AssetDeliveryProfile {
    public static String blueId() {
        return "CMPtS5jRjUoiDerQMiTJoExYduc2NvAbW6imuFppsy8d";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AssetDeliveryProfile";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AssetDeliveryProfile";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/AssetDeliveryProfile.json";
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

    private BankHolidayTreatmentEnum bankHolidaysTreatment;

    private List<AssetDeliveryProfileBlock> block;

    private LoadTypeEnum loadType;

    public String getNamespace() {
        return namespace;
    }

    public AssetDeliveryProfile namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BankHolidayTreatmentEnum getBankHolidaysTreatment() {
        return bankHolidaysTreatment;
    }

    public AssetDeliveryProfile bankHolidaysTreatment(BankHolidayTreatmentEnum bankHolidaysTreatment) {
        this.bankHolidaysTreatment = bankHolidaysTreatment;
        return this;
    }

    public List<AssetDeliveryProfileBlock> getBlock() {
        return block;
    }

    public AssetDeliveryProfile block(List<AssetDeliveryProfileBlock> block) {
        this.block = block;
        return this;
    }

    public LoadTypeEnum getLoadType() {
        return loadType;
    }

    public AssetDeliveryProfile loadType(LoadTypeEnum loadType) {
        this.loadType = loadType;
        return this;
    }

}
