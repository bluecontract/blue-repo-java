package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9vqkkCNnmKd3FB5tMAKKYenwq2i3mYyHmgYdPKKqkZ8U")
public class CdmBaseStaticdataAssetCommonDebtType {
    public static String blueId() {
        return "9vqkkCNnmKd3FB5tMAKKYenwq2i3mYyHmgYdPKKqkZ8U";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/DebtType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/DebtType";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonDebtType.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataAssetCommonDebtClassEnum debtClass;

    private List<CdmBaseStaticdataAssetCommonDebtEconomics> debtEconomics;

    public CdmBaseStaticdataAssetCommonDebtClassEnum getDebtClass() {
        return debtClass;
    }

    public CdmBaseStaticdataAssetCommonDebtType debtClass(CdmBaseStaticdataAssetCommonDebtClassEnum debtClass) {
        this.debtClass = debtClass;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonDebtEconomics> getDebtEconomics() {
        return debtEconomics;
    }

    public CdmBaseStaticdataAssetCommonDebtType debtEconomics(List<CdmBaseStaticdataAssetCommonDebtEconomics> debtEconomics) {
        this.debtEconomics = debtEconomics;
        return this;
    }

}
