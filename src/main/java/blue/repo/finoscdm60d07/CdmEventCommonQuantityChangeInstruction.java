package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("3yb5cSr8RvznwDH8gvLgj6hp8DQ5MhJukKWZmPMCbcmd")
public class CdmEventCommonQuantityChangeInstruction {
    public static String blueId() {
        return "3yb5cSr8RvznwDH8gvLgj6hp8DQ5MhJukKWZmPMCbcmd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/QuantityChangeInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/QuantityChangeInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonQuantityChangeInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmObservableAssetPriceQuantity> change;

    private CdmBaseMathQuantityChangeDirectionEnum direction;

    private List<CdmBaseStaticdataIdentifierIdentifier> lotIdentifier;

    public List<CdmObservableAssetPriceQuantity> getChange() {
        return change;
    }

    public CdmEventCommonQuantityChangeInstruction change(List<CdmObservableAssetPriceQuantity> change) {
        this.change = change;
        return this;
    }

    public CdmBaseMathQuantityChangeDirectionEnum getDirection() {
        return direction;
    }

    public CdmEventCommonQuantityChangeInstruction direction(CdmBaseMathQuantityChangeDirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    public List<CdmBaseStaticdataIdentifierIdentifier> getLotIdentifier() {
        return lotIdentifier;
    }

    public CdmEventCommonQuantityChangeInstruction lotIdentifier(List<CdmBaseStaticdataIdentifierIdentifier> lotIdentifier) {
        this.lotIdentifier = lotIdentifier;
        return this;
    }

}
